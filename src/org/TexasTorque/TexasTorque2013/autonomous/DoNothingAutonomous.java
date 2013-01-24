package org.TexasTorque.TexasTorque2013.autonomous;

public class DoNothingAutonomous extends AutonomousBase
{
    
    public DoNothingAutonomous()
    {          
        super();
    }
    
    public void init()
    {
       
    }
    
    public void run()
    {
        while(ds.isAutonomous())
        {
            watchdog.feed();
            robotOutput.setLeftDriveMotors(0.0);
            robotOutput.setRightDriveMotors(0.0);
        }
    }
    
    public void end()
    {
        
    }
    
}
