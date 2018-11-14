/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 * 
 * @author Nehela
 * @since 2 Novembre
 */
public class ExampleSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private static SpeedController BackLeft = RobotMap.LeftBackArm;
  private static SpeedController BackRight = RobotMap.RightBackArm;
  private static SpeedController Door = RobotMap.BackDoor;

  public void backUp(){
    BackLeft.set(0.5);
    BackRight.set(0.5);
  }

  public void backDown(){
    BackLeft.set(-0.5);
    BackRight.set(-0.5);
  }

  public void closeDoor(){
    Door.set(0.5);
  }

  public void openDoor(){
    Door.set(-0.5);
  }

  public void stopBackArm(){
    BackLeft.set(0);
    BackRight.set(0);
  }

  public void stopDoor(){
    Door.set(0);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
