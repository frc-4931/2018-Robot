package org.usfirst.frc.team4931.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup {

  public Autonomous() {
    addSequential(new OpenGrabber());
  }

}