/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;


import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class TankDrive extends Command {
  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
 
}
  

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  
  double kLVoltage = 12 /Robot.drivetrain.leftFrontMaster.getBusVoltage();
  double kRVoltage = 12/Robot.drivetrain.rightFrontMaster.getBusVoltage();
    
	Robot.drivetrain.rightFrontMaster.set(ControlMode.PercentOutput,-Robot.oi.rightJoystick.getY()*kRVoltage);
  Robot.drivetrain.leftFrontMaster.set(ControlMode.PercentOutput,Robot.oi.leftJoystick.getY()*kLVoltage);
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
