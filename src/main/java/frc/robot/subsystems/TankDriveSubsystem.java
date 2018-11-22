package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.commands.DriveWithJoysticksCommand;

/**
 *
 */
public class TankDriveSubsystem extends Subsystem {	
	private SpeedController l1;
	private SpeedController l2;
	private SpeedController r1;
	private SpeedController r2;
	
	public ADXRS450_Gyro gyro = null;
	
	DifferentialDrive driveTrain = null;
	
	double speedMultiplier = 0.75;
	//TODO implement turbo and crawl modes
	double turbo = 1.0;
	double crawl = 0.5;
	
	public TankDriveSubsystem() {
		l1 = new Talon(RobotMap.LEFT_FRONT);
		l2 = new Talon(RobotMap.LEFT_BACK);
		r1 = new Talon(RobotMap.RIGHT_FRONT);
		r2 = new Talon(RobotMap.RIGHT_BACK);
		
		SpeedControllerGroup left = new SpeedControllerGroup(l1, l2);
		SpeedControllerGroup right = new SpeedControllerGroup(r1, r2);
		
		left.setInverted(true);
		right.setInverted(true);

		driveTrain = new DifferentialDrive(left, right);
		
		gyro = new ADXRS450_Gyro();
			
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticksCommand());
    }
    
    public void drive (double left, double right) {
    	driveTrain.tankDrive(left, right);
    }
    
    public void drive (OI oi) {
    	double leftVal = deadzone(oi.getJoystick().getRawAxis(RobotMap.LEFT_JOYSTICK_VERTICAL_AXIS));
    	double rightVal = deadzone(oi.getJoystick().getRawAxis(RobotMap.RIGHT_JOYSTICK_VERTICAL_AXIS));
    	
    	drive(leftVal * speedMultiplier, rightVal * speedMultiplier);
	}
	
	public double deadzone(double val) {
		if(Math.abs(val) > 0.05) {
			return val;
		} else {
			return 0;
		}
	}
}

