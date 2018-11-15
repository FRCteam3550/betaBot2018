/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;
//import com.ctre.phoenix.motorcontrol.can.*;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 * @author Cedric
 * @author Nehela
 * @since 2 Novembre
 */
public class BaseMobile extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  //public static SpeedController m_Right = RobotMap.Right;
  //public static SpeedController m_Left = RobotMap.Left;
  
  private static SpeedController m_left = RobotMap.LeftMotor;
  private static SpeedController m_right =  RobotMap.RightMotor;
  
  private final DifferentialDrive m_robotdrive;

  public BaseMobile(){
    m_robotdrive = new DifferentialDrive(m_left,m_right);
    m_robotdrive.setDeadband(0.1);
    m_robotdrive.setSafetyEnabled(true);
		m_robotdrive.setExpiration(0.1); 
		m_robotdrive.setMaxOutput(1.0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  } 
}