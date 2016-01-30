package org.usfirst.frc27.Robot.commands;

import org.usfirst.frc27.Robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

 
public class PneumaticTest extends Command 
    { 
 
    public PneumaticTest() 
        { 
        // Use requires() here to declare subsystem dependencies 
        requires(Robot.ballDelivery); 
        } 
 
    // Called just before this Command runs the first time 
    protected void initialize() 
        { 
    		 Robot.ballDelivery.extend();
        } 
 
    // Called repeatedly when this Command is scheduled to run 
    protected void execute() 
    {
    	//Robot.driveTrain.takeJoystickInputs(Robot.oi.getLeftJoystick(), Robot.oi.getRightJoystick());
		 Robot.ballDelivery.extend();
    }
    
    // Make this return true when this Command no longer needs to run execute() 
    protected boolean isFinished() 
        { 
        return false; 
        } 
 
    // Called once after isFinished returns true 
    protected void end() 
        { 
        //Robot.driveTrain.stop(); 
		 Robot.ballDelivery.retract();    	
        } 
 
    // Called when another command which requires one or more of the same 
    // subsystems is scheduled to run 
    protected void interrupted() 
        { 
        end(); 
        } 
    }
