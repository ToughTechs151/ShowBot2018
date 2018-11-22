/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import frc.robot.commands.IncrementHopperCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class ReleaseBallPerSecondThroughHopperCommandGroup extends CommandGroup {
  /**
   * Add your docs here.
   */
  public ReleaseBallPerSecondThroughHopperCommandGroup() {
    addSequential(new IncrementHopperCommand(0.35));
    addSequential(new WaitCommand(0.15));
  }
}
