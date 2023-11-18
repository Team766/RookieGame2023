package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;

public class Kicker extends Mechanism {
	private MotorController kicker;
	//something tells me none of this works
	public Kicker() {
		kicker = RobotProvider.instance.getMotor("drive.kicker");
	}

	public void kick(boolean start) {
		checkContextOwnership();

		if (start)
			kicker.set(1.00);
		else
			kicker.set(0.00);
	}
}
