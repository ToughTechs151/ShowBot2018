/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class LauncherSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private SpeedController launcherMotor;
  private Encoder launcherEncoder;

  public LauncherSubsystem() {
    launcherMotor = new Talon(RobotMap.LAUNCHER_MOTOR);
    launcherEncoder = new Encoder(RobotMap.LAUNCHER_ENCODER_A, RobotMap.LAUNCHER_ENCODER_B);
    
  }

  public void driveLauncher(double speed) {
    launcherMotor.set(speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
