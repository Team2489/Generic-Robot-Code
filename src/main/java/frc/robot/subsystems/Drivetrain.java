/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;



import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;



import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.RobotMap;




/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
  public TalonSRX rightFrontMaster = new TalonSRX(RobotMap.RIGHT_FRONT_MASTER);
  public TalonSRX leftFrontMaster = new TalonSRX(RobotMap.LEFT_FRONT_MASTER);
  
  TalonSRX rightBackSlave =  new TalonSRX(RobotMap.RIGHT_BACK_SLAVE);
  TalonSRX leftBackSlave = new TalonSRX(RobotMap.LEFT_BACK_SLAVE);



  public Drivetrain() {
    rightBackSlave.set(ControlMode.Follower, RobotMap.RIGHT_FRONT_MASTER);
    leftBackSlave.set(ControlMode.Follower,RobotMap.LEFT_FRONT_MASTER);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
  }


  public static Object driveSubystem() {
    return null;
  }
}
