package frc.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IncrementHopperForwardCommand;
import frc.robot.commands.ReleaseBallPerSecondCommandGroup;

public class CoDriverOI extends OI {
    
    public CoDriverOI (int channel) {
        super(channel);

        x = new JoystickButton(joystick, RobotMap.X);
        x.whenPressed(new IncrementHopperForwardCommand(0.25));

        y = new JoystickButton(joystick, RobotMap.Y);
        y.whileHeld(new ReleaseBallPerSecondCommandGroup());
    
        a = new JoystickButton(joystick, RobotMap.A);    
        a.whenPressed(new IncrementHopperForwardCommand(-0.25));  
    }
}