/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;


public class NEOTankDrive extends Command {
  public NEOTankDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drivetrain2);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double kLVoltage = 12 / Robot.drivetrain2.leftFrontSpark.getBusVoltage();
    double kRVoltage = 12 / Robot.drivetrain2.rightFrontSpark.getBusVoltage();
    Robot.drivetrain2.rightFrontSpark.set(Robot.oi.rightJoystick.getY() * kLVoltage * RobotMap.SPEED_MULTIPLIER);
    Robot.drivetrain2.leftFrontSpark.set(Robot.oi.leftJoystick.getY() * kRVoltage * RobotMap.SPEED_MULTIPLIER);

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
