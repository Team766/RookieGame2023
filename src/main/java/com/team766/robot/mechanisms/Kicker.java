package com.team766.robot.mechanisms;
import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;

public class Kicker extends Mechanism{
	private MotorController kickMotor;

	public Kicker() {
		kickMotor = RobotProvider.instance.getMotor("kick.kickMotor");
	}
	public void setKickPower(double kickPower) {
		checkContextOwnership();

		kickMotor.set(kickPower);
	}
}
