/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import com.revrobotics.CANEncoder;



/**
 * Add your docs here.
 * 
 */

public class NEODriveTrain extends Subsystem{

  CANSparkMax rightFrontSpark = new CANSparkMax(RobotMap.RIGHT_FRONT_MASTER, MotorType.kBrushless);
  CANSparkMax rightBackSpark = new CANSparkMax(RobotMap.RIGHT_BACK_SLAVE, MotorType.kBrushless);
  CANSparkMax leftFrontSpark = new CANSparkMax(RobotMap.LEFT_FRONT_MASTER, MotorType.kBrushless);
  CANSparkMax leftBackSpark = new CANSparkMax(RobotMap.LEFT_BACK_SLAVE, MotorType.kBrushless);
  CANEncoder leftEncoder;
  CANEncoder rightEncoder;

  public NEODriveTrain(){
    rightBackSpark.follow(rightFrontSpark, true);
    leftBackSpark.follow(leftFrontSpark, true);
    rightFrontSpark.enableVoltageCompensation(12);
    leftFrontSpark.enableVoltageCompensation(12);
    rightEncoder = rightFrontSpark.getEncoder();
    leftEncoder = leftFrontSpark.getEncoder();
  }

  public void tankDrive(double leftSpeed, double rightSpeed) {
    leftFrontSpark.set(leftSpeed);
    rightFrontSpark.set(rightSpeed);
  }

  public double getLeftVelocity() {
    return leftEncoder.getVelocity() / RobotMap.CHASSIS_GEAR_RATIO;
  }

  public double getRightVelocity() {
    return rightEncoder.getVelocity() / RobotMap.CHASSIS_GEAR_RATIO;
  }

  public double getLeftPosition() {
    return leftEncoder.getPosition() / RobotMap.CHASSIS_GEAR_RATIO;
  }

  public double getRightPosition() {
    return rightEncoder.getPosition() / RobotMap.CHASSIS_GEAR_RATIO;
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

}