package org.usfirst.frc.team4931.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import jaci.pathfinder.followers.EncoderFollower;
import jaci.pathfinder.modifiers.TankModifier;
import org.usfirst.frc.team4931.robot.Robot;
import org.usfirst.frc.team4931.robot.RobotMap;

/**
 * Drives the drivetrain in the trajectory that was determined.
 * 
 * @author shawn ely
 */
public class DriveByTrajectory extends Command {
  private EncoderFollower leftEncoderFollower;
  private EncoderFollower rightEncoderFollower;

  DriveByTrajectory(TankModifier tankModifier) {
    requires(Robot.drivetrain);
    leftEncoderFollower = new EncoderFollower(tankModifier.getLeftTrajectory());
    rightEncoderFollower = new EncoderFollower(tankModifier.getRightTrajectory());
    leftEncoderFollower.configureEncoder(0, RobotMap.encoderPPR, .10); //FIXME Wheel diameter
    rightEncoderFollower.configureEncoder(0, RobotMap.encoderPPR, .10); //FIXME Wheel diameter
    Robot.drivetrain.resetLeftEncoder();
    Robot.drivetrain.resetRightEncoder();
   }

  /**
   * Sets the motor speed based on the encoder readings along the trajectory
   */
  @Override
  protected void execute() {
    double leftSpeed = leftEncoderFollower.calculate(Robot.drivetrain.getLeftEncoder());
    double rightSpeed = rightEncoderFollower.calculate(Robot.drivetrain.getRightEncoder());
    Robot.drivetrain.driveTank(leftSpeed, rightSpeed);
  }

  /**
   * returns isFinished() when both encoders are finished
   */
  @Override
  protected boolean isFinished() {
    return leftEncoderFollower.isFinished() && rightEncoderFollower.isFinished();
  }
}