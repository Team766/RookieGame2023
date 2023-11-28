package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;
// import edu.wpi.first.wpilbj.DutyCycleEncoder;

public class Kicker extends Mechanism {
	private MotorController kickerMotor;

	public Kicker () {
		kickerMotor = RobotProvider.instance.getMotor("kickermotor");
	}

	// Pull the kicker back to prepare it to kick.
	public void setPower (boolean buttonPressed) {
		checkContextOwnership();

		if (buttonPressed) {
			kickerMotor.set(0.5);
		} else {
			kickerMotor.set(0.0);
		}
	}
}