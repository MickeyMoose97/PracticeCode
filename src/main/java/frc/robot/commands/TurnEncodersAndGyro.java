/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TurnEncodersAndGyro extends Command {

  double error = 0;
  double desiredDegree = 0;
  double currentDegree = 0;
  double pAdjustment = 0;
  double iAdjustment = 0;
  double dAdjustment = 0;
  double pidAdjustment = 0;
  double motorSpeed = .55;
  
  public TurnEncodersAndGyro(double changeInDegree){
    requires(Robot.m_drive);
    this.desiredDegree = changeInDegree;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_drive.stop();
    Robot.m_drive.gyroReset();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    error = 
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
