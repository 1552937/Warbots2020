/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.robot;

import edu.wpi.first.wpilibj2.command.Subsystem;

public enum Pin
{

    //vvvvvvvvv ELECTRONICS EDITING START HERE vvvvvvvvvvv

    LeftFrontMotor(1, RobotContainer.driveTrain),
    RightFrontMotor(3, RobotContainer.driveTrain),
    LeftRearMotor(2, RobotContainer.driveTrain),
    RightRearMotor(4, RobotContainer.driveTrain),

    LeftFrontEncoderA(1, RobotContainer.driveTrain),
    LeftFrontEncoderB(1, RobotContainer.driveTrain),
    RightFrontEncoderA(3, RobotContainer.driveTrain),
    RightFrontEncoderB(3, RobotContainer.driveTrain),
    LeftRearEncoderA(2, RobotContainer.driveTrain),
    LeftRearEncoderB(2, RobotContainer.driveTrain),
    RightRearEncoderA(4, RobotContainer.driveTrain),
    RightRearEncoderB(4, RobotContainer.driveTrain),

    /*^^^^^^^^^^ ELECTRONICS EDITING END HERE ^^^^^^^^^^^^
     *
     * How to use the Pin document:
     *
     * MYPIN(3, Robot.someSubsystem),
     * YOURPIN(4, Robot.otherSubsystem),
     * THEIRPIN(2, Robot.someSubsystem),
     *    ^     ^          ^           ^
     *    ^     ^      Subsystem       ^
     * Pin Name ^                      ^
     *          ^          Comma at the End of a Value
     *   Pin Number on Rio
     *
     *
     */;// <= this isn't a stray semicolon, it's being used for the benefit of electronics


    Pin(int i, Subsystem ss)
    {
        id = i;
        claz = ss.getClass().getName();
    }

    public int id() throws IllegalArgumentException
    {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        var caller = stackTrace[2].getClassName();
        if(caller.equals(claz)) return id;
        throw new IllegalArgumentException();
    }

    private final int id;
    private final String claz;
}