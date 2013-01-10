package org.TexasTorque.TexasTorque2013.subsystem;

import org.TexasTorque.TexasTorque2013.io.DriverInput;
import org.TexasTorque.TexasTorque2013.io.RobotOutput;
import org.TexasTorque.TexasTorque2013.io.SensorInput;

public class Elevator
{
    private RobotOutput robotOutput;
    private DriverInput driverInput;
    private SensorInput sensorInput;
    
    public Elevator()
    {
        robotOutput = RobotOutput.getInstance();
        driverInput = DriverInput.getInstance();
        sensorInput = SensorInput.getInstance();
    }
    
    public void run()
    {
        
    }
}
