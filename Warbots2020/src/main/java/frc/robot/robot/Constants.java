/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants 
{
    public static final class IntakeConstants
    {
        public static final double rollerSpeedForward = 0.2;
        public static final double rollerSpeedReverse = 0.2;
        public static final double captureTimer = 5;
    }
    public static final class DriveTrainConstants
    {
       public static final double autoDriveDistance = 2.0; 
    }
    public static final class ShooterConstants
    {
        public static final double spinRate = 0.25;
        public static final double spinRateTolerance = 0.25;
        public static final double flyWheelConversionFactor = 1.0;
        public static final double autoShootTimeSeconds = 5.0;
        public static final double autoTimeoutSeconds = 10.0;
    }
    public static final class LoaderConstants
    {
        public static final int loaderCurrentLimit = 20;
        public static final double loaderTimeout = 5.0;
    } 
    public static final class OIConstants
    {
        public static final int driverControllerPort = 0;
        public static final int operatorControllerPort = 1;
        public static final int autoModeSelectorInput0 = 0;
        public static final int autoModeSelectorInput1 = 1;
        public static final int autoModeSelectorInput2 = 2;
        public static final int autoModeSelectorInput3 = 3;
        public static final int autoModeSelectorInput4 = 4;
    }

    public static final class BlingConstants
    {
        public static final double oceanColoredRainbow = -0.95;
        public static final double larsonScanner = -0.35;
        public static final double fastHeartBeat = 0.07;
        public static final double solidBlue = 0.87;
    }
}
