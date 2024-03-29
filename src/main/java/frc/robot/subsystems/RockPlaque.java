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
import edu.wpi.first.wpilibj.*;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 * @author nehela
 * @since 2 November
 */
public class RockPlaque extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private static SpeedController Pusher = RobotMap.PusherMotor;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new StopPusher());
  }

  public void push(){
    Pusher.set(0.5);
  }

  public void stopPusher(){
    Pusher.set(0);
  }
  
} 
