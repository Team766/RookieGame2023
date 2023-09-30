package com.team766.robot.mechanisms;

import com.team766.framework.Context;
import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;

public class Drive extends Mechanism {
	private MotorController leftMotor;
	private MotorController rightMotor;

	public Drive() {
		leftMotor = RobotProvider.instance.getMotor("drive.leftMotor");
		rightMotor = RobotProvider.instance.getMotor("drive.rightMotor");
	}

	public void tankDrive(double leftPower, double rightPower) {
		checkContextOwnership();
		leftMotor.set(leftPower);
		rightMotor.set(rightPower);
	}

	public void arcadeDrive(double forward, double turn) {
		double leftMotorPower = turn + forward;
		double rightMotorPower = -turn + forward;
		tankDrive(leftMotorPower, rightMotorPower);
	}
}
