package org.TexasTorque.TexasTorque2013.constants;

public class Constants
{
    //----- Deadbands -----
    public static double SPEED_AXIS_DEADBAND = 0.07;
    public static double TURN_AXIS_DEADBAND = 0.07;
    
    //----- Autonomous -----
    public static int DO_NOTHING_AUTO = 0;
    public static int DIAGNOSTIC_AUTO = 1;
    public static int FRONT_SHOOT_AUTO = 2;
    public static int FRONT_DRIVE_AUTO = 3;
    public static int REAR_SHOOT_AUTO = 4;
    public static int REAR_DRIVE_FORWARD_AUTO = 5;
    public static int REAR_DRIVE_FORWARD_DOUBLE_AUTO = 6;
    public static int REAR_DRIVE_REVERSE_AUTO = 7;
    public static int REAR_DRIVE_REVERSE_SHOOT_AUTO = 8;
    
    //----- Drivebase -----
    public static double MAX_DIAMETER = 1.5;
    public static double ROBOT_WIDTH = 1.0;
    public static double DEFAULT_LOW_SENSITIVITY = 1.25;
    public static double DEFAULT_HIGH_SENSITIVITY = 0.7;
    
    //----- Gyro -----
    public static int GYRO_ACCUMULATOR_DEADBAND = 75;
    public static double GYRO_SENSITIVITY = 0.0136;
    
    //----- Shooter -----
    public static double TILT_PARALLEL_POSITION = 0.5;
    public static double POTENTIOMETER_LOW_VOLTAGE = 2.5;
    public static double POTENTIOMETER_HIGH_VOLTAGE = 5.0;
    public static int FRONT_SHOOTER_DEFAULT_RATE = 3000;
    public static int REAR_SHOOTER_DEFAULT_RATE = 2000;
    
    //----- Elevator -----
    public static int ELEVATOR_BOTTOM_POSITION = 0;
    public static int ELEVATOR_TOP_POSITION = 500;
    
    //----- Misc -----
    public static int TORQUE_LOGGING_LOOP_TIME = 20;
    
}
