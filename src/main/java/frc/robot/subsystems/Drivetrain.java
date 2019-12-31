/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;



import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;



/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain {
  public WPI_TalonSRX rightFrontMotor =null;
  public WPI_TalonSRX rightBackMotor = null;
  public WPI_TalonSRX leftFrontMotor = null;
  public WPI_TalonSRX leftBackMotor = null; 
  public SpeedControllerGroup rightMotors = null;
  public SpeedControllerGroup leftMotors = null;
  DifferentialDrive dDrive = null;

  public Drivetrain(){
    rightFrontMotor = new WPI_TalonSRX(RobotMap.RIGHT_FRONT_MOTOR);
    rightBackMotor = new WPI_TalonSRX(RobotMap.RIGHT_BACK_MOTOR);
    leftFrontMotor = new WPI_TalonSRX(RobotMap.LEFT_FRONT_MOTOR);
    leftBackMotor = new WPI_TalonSRX(RobotMap.LEFT_BACK_MOTOR);
    rightMotors = new SpeedControllerGroup(rightFrontMotor, rightBackMotor);
    leftMotors = new SpeedControllerGroup(leftFrontMotor, leftBackMotor);
    dDrive = new DifferentialDrive(leftMotors, rightMotors);
  }
  
  public void tankDrive(double RightSpeed, double LeftSpeed){
    dDrive.tankDrive(LeftSpeed,RightSpeed);
  }
}
