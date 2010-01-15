import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.net.MalformedURLException;
import scala.tools.nsc.MainGenericRunner;

public class Main extends URLClassLoader {
	public Main(URL[] urls) {
		super(urls);
	}
	public void addFile (String path) throws MalformedURLException
    {
        String urlPath = "jar:file://" + path + "!/";
        addURL (new URL (urlPath));
    }
	@SuppressWarnings("static-access")
	public void run(String[] args) throws MalformedURLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		addFile("/mnt/user/lib/scala.tools.nsc_2.7.7.final.jar");
        List<String> argList = new ArrayList<String>();
        argList.add("Scala");
        Object mainGenericRunner = this.loadClass("scala.tools.nsc.MainGenericRunner").newInstance();
        for (String s : args) argList.add(s);
        ((MainGenericRunner)mainGenericRunner).main(argList.toArray(new String[0]));
	}
    public static void main(String[] args) throws MalformedURLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
    	new Main(new URL[0]).run(args);
    }
}
