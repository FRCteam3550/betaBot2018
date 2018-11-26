/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class ArcadeDrive extends Command {
  public ArcadeDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_BaseMobile);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize(){
    Robot.m_BaseMobile.stopRobot();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.m_BaseMobile.arcadedrive(0.7*Robot.m_oi.getPilotStick().getY(), -0.8*Robot.m_oi.getPilotStick().getZ(),true);
  //  Robot.driveTrain.curvatureDrive(-Robot.m_oi.getPilotStick().getY(), Robot.m_oi.getPilotStick().getZ(),true);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_BaseMobile.stopRobot();

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
