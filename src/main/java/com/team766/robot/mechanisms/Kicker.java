package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;
// import edu.wpi.first.wpilbj.DutyCycleEncoder;

public class Kicker extends Mechanism {
	private MotorController kickerMotor;

	public Kicker () {
		kickerMotor = RobotProvider.instance.getMotor("kicker.kickerMotor");
	}

	// Pull the kicker back to prepare it to kick.
	public void prepare () {
		checkContextOwnership();
		// Pull the motor back until it reaches right before unlatching.
	}

	// Pull the kicker back a tiny bit, unlatching it and letting it fall, kicking forward.
	public void kick (boolean buttonPressed) {
		checkContextOwnership();
		if (buttonPressed) {
			kickerMotor.set(0.25);
		} else {
			kickerMotor.set(0);
		}
	}

	// public void resetEncoder () {
	// 	checkContextOwnership();
	// 	kickerEncoder.reset();
	// }
}