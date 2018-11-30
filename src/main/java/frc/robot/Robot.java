/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CameraServer;
//import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.AutonomousChooser.AutonomousC;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static BaseMobile m_BaseMobile;

  //public static BackArm m_BackArm;

 // public static BackArm m_BackArm;
  public static FrontArm m_Frontarm;
  public static RockPlaque m_RockPlaque;
  public static OI m_oi;
  //private DriverStation ds = DriverStation.getInstance();
  //private String gameCode;
	//SendableChooser<CommandGroup> m_autoChooserLeft;
  //SendableChooser<CommandGroup> m_autoChooserRight;
  
  private AutonomousC AutoCode = new AutonomousC();

 // Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();
  CommandGroup m_autonomousCommand;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    RobotMap.init();
    //m_oi = new OI();
    m_BaseMobile = new BaseMobile();
    //m_BackArm = new BackArm();
   // m_BackArm = new BackArm();

    m_Frontarm = new FrontArm();
    m_RockPlaque = new RockPlaque();
    m_oi = new OI();
    
    //m_chooser.addDefault("Default1 Auto", new DefaultAuto());
    //m_chooser.addObject("My Auto", new MyAuto());
    //SmartDashboard.putData("Auto mode", m_chooser);
    
    //m_autoChooserLeft = new SendableChooser<CommandGroup>();
    // time1 speed1, turn1 time2 speed2 turn2
    //m_autoChooserLeft.addDefault("Default Auto", new Cdr(1.5 , -0.4, 0, 2 , -0.4, 0.5));
    // m_autoChooserLeft.addObject("My Auto", new DefaultG());
    // SmartDashboard.putData("AutoModeLeft", m_autoChooserLeft);

   //  m_autoChooserRight = new SendableChooser<CommandGroup>();
     //m_autoChooserRight.addDefault("Default Auto", new Cdr(1, 2));
     //m_autoChooserRight.addObject("My Auto", new Cdr(1,2));
     //SmartDashboard.putData("AutoModeRight", m_autoChooserRight);
    
     AutoCode.installAutonomous();

     CameraServer.getInstance().startAutomaticCapture();
     

    }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
  //m_autonomousCommand = m_chooser.getSelected();
  
  SmartDashboard.putNumber("test", 2);
    //gameCode = ds.getGameSpecificMessage();

  //  if (gameCode.charAt(0) == 'L')
	//	{
	//		m_autonomousCommand = m_autoChooserLeft.getSelected();
	//    	if (m_autonomousCommand != null) {
	//    		m_autonomousCommand.start();
	//    	}
	//	}
      //  else if (gameCode.charAt(0) == 'R')
        //else if (tempGameData.charAt(0) == 'R') // Bascule cote droit
	//	{
    		//m_autonomousCommand = m_autoChooserRight.getSelected();
	    	//if (m_autonomousCommand != null) {
	    		//m_autonomousCommand.start();
	    	//}
		//}
		//else {  // Sinon equivalent de l'autoline
    	    //autonomousCommand = new DriveDistanceCommand(135,1);
    //	m_autonomousCommand = new MyDefaultAutoG(); 
                    // time1 speed1, turn1 time2 speed2 turn2
    //m_autonomousCommand = new Cdr(1.5 , 0.8, 0, 2 , 0.5, 0.5); 
    //m_autonomousCommand.start();
		//	if (m_autonomousCommand != null) {
		//		m_autonomousCommand.start();
		//	}
		//}
		
    AutoCode.chooseAutonomous();

    /*
      String autoSelected = SmartDashboard.getString("Auto Selector","Default");
       switch(autoSelected) {
        case "My Auto": 
       autonomousCommand = new MyAutoCommand();
        break; 
        case "Default Auto": 
        default:
        autonomousCommand = new ExampleCommand();
         break;
         }
     */

    // schedule the autonomous command (example)
    //if (m_autonomousCommand != null) {
    //  m_autonomousCommand.start();
    //}
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (AutoCode.getCommandGroup() != null) {
      AutoCode.cancelAutonomous();
    }
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    SmartDashboard.putBoolean("limitswitch", m_Frontarm.getLimitSwitch());
    SmartDashboard.putNumber("Speed", m_oi.getPilotStick().getY());


  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
