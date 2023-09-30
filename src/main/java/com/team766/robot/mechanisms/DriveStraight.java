package com.team766.robot.mechanisms;

import com.team766.framework.Procedure;
import com.team766.robot.Robot;
import com.team766.framework.Context;

public class DriveStraight extends Procedure {

	public void run(Context context) {
		context.takeOwnership(Robot.drive);
		Robot.drive.setDrivePower(0.25, 0.25);
		context.waitForSeconds(3.0);
		Robot.drive.setDrivePower(0, 0);
	}
}