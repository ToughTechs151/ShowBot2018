/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class CartridgeCommand extends Command {
  public CartridgeCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Piston);

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    cartridgePiston.extend();
    Timer t = new Timer()
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    cartridgePiston.retract();
    t.delay(0.5);
    cartridgePiston.extend();


  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    cartridgePiston.off();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
