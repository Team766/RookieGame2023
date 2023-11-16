package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;
import com.team766.hal.simulator.Solenoid;

public class Intake extends Mechanism{
	private Solenoid intakeArm;
	private MotorController intakeWheels;

	public Intake(){
		intakeArm = RobotProvider.instance.getSolenoid("intake");
	}
	
}
