/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.DigitalInput;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * @author Nehela
 * @since 2 Novembre
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  //Base Mobile
  public static SpeedController LeftMotor;
  public static SpeedController RightMotor;

  //BackArm
  public static SpeedController LeftBackArm;
  public static SpeedController RightBackArm;
  public static SpeedController BackDoor;

  //FrontArm
  public static SpeedController LeftFrontArm;
  public static SpeedController RightFrontArm;
  public static SpeedController Vacuum;
  public static DigitalInput limitSwitch;


  //RockPlaque
  public static SpeedController PusherMotor;



  public static void init(){

    //Base Mobile
      LeftMotor = new WPI_TalonSRX(1);//a valider
      RightMotor = new WPI_TalonSRX(2);//a valider

    //backArm
     /* LeftBackArm = new WPI_TalonSRX(3);//a valider
      RightBackArm = new WPI_TalonSRX(4);//a valider
      BackDoor = new WPI_VictorSPX(7);//a valider */

    //FrontArm
     LeftFrontArm = new WPI_TalonSRX(5);//a valider
     //RightFrontArm = new WPI_TalonSRX(6);//a valider
      Vacuum = new WPI_VictorSPX(8);//a valider
      limitSwitch = new DigitalInput(9);

    //RockPlaque
      PusherMotor = new WPI_VictorSPX(9);//a valider

  }

  

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
