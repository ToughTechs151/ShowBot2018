/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick joystick = null;

	protected JoystickButton x;
	protected JoystickButton a;
	protected JoystickButton b;
	protected JoystickButton y;
	protected JoystickButton leftBumper;
	protected JoystickButton rightBumper;
	protected JoystickButton leftTrigger;
	protected JoystickButton rightTrigger;
	protected JoystickButton back;
	protected JoystickButton start;
	protected JoystickButton leftJoystick;
	protected JoystickButton rightJoystick;

	public OI(int joystickChannel) {
		joystick = new Joystick(joystickChannel);
	}

	public Joystick getJoystick() {
		return joystick;
	}
}
