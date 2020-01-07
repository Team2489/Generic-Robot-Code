/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	//Values are subjected to change according to CAN ID
	//Exception: Joystick Constants
	
	public static final int RIGHT_JOYSTICK = 1;
	public static final int LEFT_JOYSTICK = 2;
	public static final double SPEED_MULTIPLIER = 0.5;
	public static final int RIGHT_FRONT_MASTER = 1;
	public static final int RIGHT_BACK_SLAVE = 2;
	public static final int LEFT_FRONT_MASTER = 3;
	public static final int LEFT_BACK_SLAVE = 4;
	public static final double CHASSIS_GEAR_RATIO = 10.75;
	
}
