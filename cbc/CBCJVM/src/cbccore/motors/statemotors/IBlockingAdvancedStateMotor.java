/*
 * This file is part of CBCJVM.
 * CBCJVM is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * CBCJVM is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with CBCJVM.  If not, see <http://www.gnu.org/licenses/>.
*/

package cbccore.motors.statemotors;

import cbccore.Device;
import cbccore.InvalidPortException;

/**
 * <b>Implementation note:</b> When using versions of the functions defined in
 * <code>IAdvancedStateMotor</code>, the default behavior should be
 * non-blocking.
 * 
 * @author Benjamin Woodruff
 *
 */

public interface IBlockingAdvancedStateMotor extends IAdvancedStateMotor {
	public void setPositionTime(int pos, int ms, boolean blocking);
	public void setPositionTime(int pos, double sec, boolean blocking);
	
	public void setPositionSpeed(int pos, int speed, boolean blocking);
	public void setPosition(int pos, boolean blocking);
}
