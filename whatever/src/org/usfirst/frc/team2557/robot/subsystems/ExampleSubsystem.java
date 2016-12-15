
package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	public void Runforward(){
		RobotMap.motor.set(-1);
	}
	public void Runbackward(){
			RobotMap.motor.set(-.5);
	}
	public void getAngle(){
	RobotMap.motor.set(.75);
	}
	public void anything(){
			RobotMap.turn.getAngle();
		
		
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

