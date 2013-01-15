// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc4.Team4Ascent;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.Encoder.PIDSourceParameter;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Gyro chasisGyro;
    public static SpeedController chasisLeftFrontMotor;
    public static SpeedController chasisLeftRearMotor;
    public static SpeedController chasisRightFrontMotor;
    public static SpeedController chasisRightRearMotor;
    public static RobotDrive chasisDrive;
    public static PIDController chasisPID;
    public static Encoder driveEncoder;
    public static Compressor pnuematicsCompressor;
    public static DoubleSolenoid pnuematicsDoubleSolenoid;
    public static Encoder launcherEncoder;
    public static SpeedController launcherTalon;
    public static PIDController launcherPID;
    public static SpeedController intakeTalon;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chasisGyro = new Gyro(1, 2);
	LiveWindow.addSensor("Chasis", "Gyro", chasisGyro);
        chasisGyro.setSensitivity(1.25);
        chasisLeftFrontMotor = new Talon(2, 1);
	LiveWindow.addActuator("Chasis", "LeftFrontMotor", (Talon) chasisLeftFrontMotor);
        
        chasisLeftRearMotor = new Talon(2, 2);
	LiveWindow.addActuator("Chasis", "LeftRearMotor", (Talon) chasisLeftRearMotor);
        
        chasisRightFrontMotor = new Talon(2, 3);
	LiveWindow.addActuator("Chasis", "RightFrontMotor", (Talon) chasisRightFrontMotor);
        
        chasisRightRearMotor = new Talon(2, 4);
	LiveWindow.addActuator("Chasis", "RightRearMotor", (Talon) chasisRightRearMotor);
        
        chasisDrive = new RobotDrive(chasisLeftFrontMotor, chasisLeftRearMotor,
              chasisRightFrontMotor, chasisRightRearMotor);
        
        driveEncoder = new Encoder(1, 4, 1, 5, false, EncodingType.k4X);
        
        chasisPID = new PIDController(1.0, 0.0, 0.0, 0.0, driveEncoder, chasisLeftFrontMotor, 0.02);

	
        chasisDrive.setSafetyEnabled(true);
        chasisDrive.setExpiration(0.1);
        chasisDrive.setSensitivity(0.5);
        chasisDrive.setMaxOutput(1.0);
        pnuematicsCompressor = new Compressor(1, 1, 1, 1);
	
        
        pnuematicsDoubleSolenoid = new DoubleSolenoid(1, 1, 2);      
	
        
        launcherEncoder = new Encoder(1, 4, 1, 5, false, EncodingType.k4X);
	LiveWindow.addSensor("Launcher", "Encoder", launcherEncoder);
        launcherEncoder.setDistancePerPulse(1.0);
        launcherEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        launcherEncoder.start();
        launcherTalon = new Talon(1, 5);
	LiveWindow.addActuator("Launcher", "Talon", (Talon) launcherTalon);
        
        launcherPID = new PIDController(1.0, 0.0, 0.0, 0.0, launcherEncoder, launcherTalon, 0.02);
	LiveWindow.addActuator("Launcher", "PID", launcherPID);
        launcherPID.setContinuous(false); launcherPID.setAbsoluteTolerance(0.2); 
        launcherPID.setOutputRange(-1.0, 1.0);        
        intakeTalon = new Talon(1, 6);
	LiveWindow.addActuator("Intake", "Talon", (Talon) intakeTalon);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
