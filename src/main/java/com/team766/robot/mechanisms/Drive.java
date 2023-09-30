package com.team766.robot.mechanisms;
import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider; 

public class Drive extends Mechanism {
	private MotorController leftmotor;
	private MotorController rightmotor;
	public Drive() {
		leftmotor = RobotProvider.instance.getMotor("drive.leftMotor");
		rightmotor = RobotProvider.instance.getMotor("drive.rightMotor");

	}
	public void setdrivepower(double leftPower, double rightPower) {
		checkContextOwnership();
		leftmotor.set(leftPower);
		rightmotor.set(rightPower);


	}
	

}
