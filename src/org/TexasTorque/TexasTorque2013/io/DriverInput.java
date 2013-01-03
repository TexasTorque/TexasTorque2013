package org.TexasTorque.TexasTorque2013.io;

import org.TexasTorque.TexasTorque2013.constants.Ports;
import org.TexasTorque.TorqueLib.controller.*;

public class DriverInput
{
    private static DriverInput instance;
        
    public DriverInput()
    {
        
    }
    
    public synchronized static DriverInput getInstance()
    {
        return (instance == null) ? instance = new DriverInput() : instance;
    }
    
    public synchronized double applyDeadband(double axisValue, double deadband)
    {
        if(Math.abs(axisValue) <= deadband)
        {
            return 0.0;
        }
        else
        {
            return axisValue;
        }
    }
}