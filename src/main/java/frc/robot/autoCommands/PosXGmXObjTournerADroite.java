/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.autoCommands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class PosXGmXObjTournerADroite extends CommandGroup {
  /**
   * Add your docs here.
   */
  public PosXGmXObjTournerADroite(double timeout1, double speed1, double turn1, double timeout2, double speed2,
            double turn2) {
    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    //addSequential(new turnLeft(timeout1));
    addSequential(new turnRight(timeout1 ,speed1, turn1));
    addSequential(new turnRight(timeout2 ,speed2,  turn2));


    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  }
}
