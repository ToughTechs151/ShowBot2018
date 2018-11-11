/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveHopperCommand extends Command {

  private long lastTime;
  private long recentTime;
  private long gap;
  private double ballsPerSecond;
  
  private double speed;

  public DriveHopperCommand(double speed) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.hopper);
    this.speed = speed;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.hopper.driveHopper(speed);
    if(Robot.hopper.getHopperSwitchState()) {
      recentTime = System.currentTimeMillis();
      gap = recentTime - lastTime;
      if(gap > 0)
        ballsPerSecond = 1/gap;
      else
        ballsPerSecond = 0;
      lastTime = recentTime;
      System.out.println(ballsPerSecond + " balls per second");
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
