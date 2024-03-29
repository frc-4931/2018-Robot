package org.usfirst.frc.team4931.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4931.robot.Robot;
/**
 * Opens the grabber
 */
public class OpenGrabber extends Command {

  public OpenGrabber() {
    setInterruptible(true);
  }

  @Override
  protected void initialize() {
    Robot.grabber.releaseCube();
  }

  @Override
  protected boolean isFinished() {
    return true;
  }
}
