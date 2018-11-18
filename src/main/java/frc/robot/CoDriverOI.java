package frc.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ChangeLauncherSpeedCommand;
import frc.robot.commands.ExtendCommand;
import frc.robot.commands.IncrementHopperForwardCommand;
import frc.robot.commands.ReleaseBallPerSecondCommandGroup;
import frc.robot.commands.ReleaseCommandGroup;
import frc.robot.commands.RetractCommand;

public class CoDriverOI extends OI {
    
    public CoDriverOI (int channel) {
        super(channel);

        start = new JoystickButton(joystick, RobotMap.START);
        start.whenPressed(new IncrementHopperForwardCommand(0.25));

        back = new JoystickButton(joystick, RobotMap.BACK);
        back.whenPressed(new IncrementHopperForwardCommand(-0.25));
        
        rightBumper = new JoystickButton(joystick, RobotMap.RIGHT_BUMPER);
        rightBumper.whileHeld(new ReleaseBallPerSecondCommandGroup());
    
        leftBumper = new JoystickButton(joystick, RobotMap.LEFT_BUMPER);    
        leftBumper.whenPressed(new ReleaseCommandGroup());  

        x = new JoystickButton(joystick, RobotMap.X);
        x.whenPressed(new RetractCommand());

        y = new JoystickButton(joystick, RobotMap.Y);
        y.whenPressed(new ExtendCommand());

        a = new JoystickButton(joystick, RobotMap.A);
        a.whenPressed(new ChangeLauncherSpeedCommand(2300));

        b = new JoystickButton(joystick, RobotMap.B);
        b.whenPressed(new ChangeLauncherSpeedCommand(0));


    }
}