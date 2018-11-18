/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class LauncherPIDSubsystem extends PIDSubsystem {
  
  private SpeedController launcherMotor;
  private Encoder launcherEncoder;
  
  /**
   * Add your docs here.
   * 512 Pulses Per Revolution!!!!!!!!!!!!!!!!!!!!!!!
   */
  public LauncherPIDSubsystem() {
    // Intert a subsystem name and PID values here
    super("LauncherPIDSubsystem", RobotMap.kPl, RobotMap.kIl, RobotMap.kDl);
    launcherMotor = new Talon(RobotMap.LAUNCHER_MOTOR);
    launcherEncoder = new Encoder(RobotMap.LAUNCHER_ENCODER_A, RobotMap.LAUNCHER_ENCODER_B);
    launcherEncoder.setPIDSourceType(PIDSourceType.kRate);
    setSetpoint(0);
    setAbsoluteTolerance(0);
    disable();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  protected double returnPIDInput() {
    // Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    System.out.println("launcher setpoint: " + getSetpoint());
    System.out.println("Encoder speed: " + getSpeed() + " encoder getrate: " + launcherEncoder.getRate());
    return getSpeed();
  }

  @Override
  protected void usePIDOutput(double output) {
    // Use output to drive your system, like a motor
    // e.g. yourMotor.set(output);
    System.out.println("Launcher output: " + output);
    launcherMotor.set(output);
  }

  public void stop() {
    launcherMotor.set(0);
  }

  private double getSpeed() {
    return launcherEncoder.getRate() / 10;
  }
}
