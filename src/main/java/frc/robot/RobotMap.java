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
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

	// JOYSTICKS
	// JOYSTICK BUTTONS
	public static final int X = 3;
	public static final int A = 1;
	public static final int B = 2;
	public static final int Y = 4;
	public static final int LEFT_BUMPER = 5;
	public static final int RIGHT_BUMPER = 6;
	public static final int BACK = 7;
	public static final int START = 8;
	public static final int LEFT_JOYSTICK = 9;
	public static final int RIGHT_JOYSTICK = 10;

	// JOYSTICK AXES
	public static final int LEFT_JOYSTICK_LATERAL_AXIS = 0;
	public static final int LEFT_JOYSTICK_VERTICAL_AXIS = 1;
	public static final int RIGHT_JOYSTICK_LATERAL_AXIS = 4;
	public static final int RIGHT_JOYSTICK_VERTICAL_AXIS = 5;
	public static final int LEFT_TRIGGER = 2;
	public static final int RIGHT_TRIGGER = 3;

	// PWM
	public static final int HOPPER_MOTOR = 3; //2;
	public static final int LEFT_FRONT = 0;
	public static final int LEFT_BACK = 1;
	public static final int RIGHT_FRONT = 4; //2
	public static final int RIGHT_BACK = 5; //3;
	public static final int LAUNCHER_MOTOR = 2; //5;

	// DIO
	public static final int HOPPER_SWITCH = 0;
	public static final int LAUNCHER_ENCODER_A = 1;
	public static final int LAUNCHER_ENCODER_B = 2;

	//PID CONSTANTS
	public static final double kPl = 0.001;
	public static final double kIl = 0;
	public static final double kDl = 0;
}