/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4931.robot;

import edu.wpi.first.wpilibj.SPI;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
      
    public static final int leftFrontMotorPort = 1;
    public static final int leftBackMotorPort = 2;
    public static final int rightFrontMotorPort = 3;
    public static final int rightBackMotorPort = 4;
    public static final boolean leftFrontMotorInverted = false;
    public static final boolean leftBackMotorInverted = false;
    public static final boolean rightFrontMotorInverted = false;
    public static final boolean rightBackMotorInverted = false;
    
    public static final int[] leftEncoderPorts = {0, 1};
    public static final int[] rightEncoderPorts = {0, 1};
    public static final boolean leftEncoderInverted = false;
    public static final boolean rightEncoderInverted = false;
    
	/** [0] is forward position port, [1] is backward position port */
	public static final int[] leftGearBox = {0, 1};
	/** [0] is forward position port, [1] is backward position port */
    public static final int[] rightGearBox = {0, 1};
    
    public static final int compressor = 1;
    
    public static final SPI.Port gyroPort = SPI.Port.kOnboardCS0;

	public static final int armMotorLeftPort = 0;
	public static final int armMotorRightPort = 5;
	public static final boolean armMotorLeftInverted = false;
	public static final boolean armMotorRightInverted = false;
	
	public static final int liftMotorPort = 6;
	public static final boolean liftMotorInverted = false;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
