/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;
//import frc.robot.commands.BackDown;
//import frc.robot.commands.BackarmUp;
//import frc.robot.commands.CloseDoor;
//import frc.robot.commands.FrontArmDown;
//import frc.robot.commands.FrontArmUp;
//import frc.robot.commands.OpenDoor;
//import frc.robot.commands.PushBalls;
//import frc.robot.commands.Rejeter;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whileHeld(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  private int UN = 1;
  private int DEUX = 2;
  private int TROIS = 3;
  private int QUATRE = 4;
  private int CINQ = 5;
  private int SIX = 6;
  private int SEPT = 7;
  private int HUIT = 8;
  private int NEUF = 9; 
  private int DIX = 10;

  Joystick copilote = new Joystick(0);
  Joystick pilote = new Joystick(1);
  public OI(){
    
  
    Button button4 = new JoystickButton(copilote, QUATRE);
  button4.whileHeld(new FrontArmUp());

  
  Button button3 = new JoystickButton(copilote, TROIS);
  button3.whileHeld(new FrontArmDown());

  Button button1 = new JoystickButton(copilote, UN);
  button1.whileHeld(new Aspirer());

  Button button2 = new JoystickButton(copilote, DEUX);
  button2.whileHeld(new Rejeter());

<<<<<<< HEAD
  //Button button6 = new JoystickButton(copilote, SIX);
  //button6.whileHeld(new BackarmUp());
=======
  /*Button button6 = new JoystickButton(copilote, SIX);
  button6.whileHeld(new BackarmUp());
>>>>>>> d5704d2dd1242595b92de0917647f9161c67c795
  
  //Button button5 = new JoystickButton(copilote, CINQ);
  //button5.whileHeld(new BackDown());

  //Button button7 = new JoystickButton(copilote, SEPT);
  //button7.whileHeld(new OpenDoor());

<<<<<<< HEAD
  // button8 = new JoystickButton(copilote, HUIT);
  //button8.whileHeld(new CloseDoor());
=======
  Button button8 = new JoystickButton(copilote, HUIT);
  button8.whileHeld(new CloseDoor()); */
>>>>>>> d5704d2dd1242595b92de0917647f9161c67c795

  Button button9 = new JoystickButton(copilote, NEUF);
  button9.whileHeld(new PushBalls());

  Button button10 = new JoystickButton(copilote, DIX);
  button10.whileHeld(new MyAuto());

}

  public Joystick getPilotStick(){
    return pilote;
      }
}