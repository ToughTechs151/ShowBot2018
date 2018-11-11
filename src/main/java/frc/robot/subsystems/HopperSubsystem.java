/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class HopperSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private SpeedController hopperMotor;
  private DigitalInput hopperSwitch;

  public HopperSubsystem() {
    hopperMotor = new Talon(RobotMap.HOPPER_MOTOR);
    hopperSwitch = new DigitalInput(RobotMap.HOPPER_SWITCH);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
  }

  public void stopHopper() {
    hopperMotor.set(0);
  }

  public void driveHopper(double speed) {
    hopperMotor.set(-speed);
  }

  public void driveHopper(OI oi) {
    driveHopper(deadzone(oi, RobotMap.RIGHT_JOYSTICK_VERTICAL_AXIS));
  }

  private double deadzone(OI oi, int axis) {
    double rawAxis = oi.getJoystick().getRawAxis(axis);
    if(Math.abs(rawAxis) > 0.04)
      return rawAxis;
    return 0;
  }

  public boolean getHopperSwitchState() {
    return hopperSwitch.get();
  }
}
