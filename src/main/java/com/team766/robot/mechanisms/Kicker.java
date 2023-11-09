package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;

public class Kicker extends Mechanism {
	private MotorController kickerMotor;

	public Kicker () {
		kickerMotor = RobotProvider.instance.getMotor("kicker.kickerMotor");
	}

	public void kick (double power) {
		checkContextOwnership();
		kickerMotor.set(power);
	}
 /*
	public void setDrivePower(double leftPower, double rightPower) {
		checkContextOwnership();

		leftMotor.set(leftPower);

		// Motor spins the wrong direction.
		rightMotor.set(-rightPower);
		
	}*/
}