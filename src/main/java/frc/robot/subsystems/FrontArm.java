/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.*;
//import frc.robot.commands.*;
import edu.wpi.first.wpilibj.*;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 * @author Nehela
 * @since 2 Novembre
 */
public class FrontArm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private static SpeedController FrontLeft = RobotMap.LeftFrontArm;
  private static SpeedController FrontRight = RobotMap.RightFrontArm;
  private static SpeedController Vacuum = RobotMap.Vacuum;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new StopFrontArm()) ;
    }
  public void frontUp(){
    FrontLeft.set(-0.3);
    FrontRight.set(0.3);
  }

  public void frontDown(){
    FrontLeft.set(0.4);
    FrontRight.set(-0.4);
  }

  public void aspirer(){
    Vacuum.set(0.5);
  }

  public void rejeter(){
    Vacuum.set(-0.5);
  }

  public void stopFrontArm(){
    FrontLeft.set(0);
    FrontRight.set(0);
  }

  public void stopVacuum(){
    Vacuum.set(0);
  }
} 
