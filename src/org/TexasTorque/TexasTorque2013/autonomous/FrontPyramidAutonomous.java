package org.TexasTorque.TexasTorque2013.autonomous;

import edu.wpi.first.wpilibj.Timer;
import org.TexasTorque.TexasTorque2013.constants.Constants;

public class FrontPyramidAutonomous extends AutonomousBase {

    Timer autonomousTimer;
    
    public FrontPyramidAutonomous()
    {
        super();
        autonomousTimer = new Timer();
    }
    
    public void init() 
    {
        robotOutput.setDriveMotors(0.0, 0.0);
        robotOutput.setIntakeMotor(0.0);
    }

    public void run() 
    {
        autonomousTimer.reset();
        autonomousTimer.start();
        while(ds.isAutonomous())
        {
            watchdog.feed();
            manipulator.shootHighWithVision();
            if(autonomousTimer.get() > 7.0)
            {
                manipulator.restoreDefaultPositions();
            }
            intake.run();
            shooter.run();
            elevator.run();
            magazine.run();
            drivebase.run();
        }
    }

    public void end() 
    {
    
    }
    
}
