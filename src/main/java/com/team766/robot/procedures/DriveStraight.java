package com.team766.robot.procedures;

import com.team766.framework.Context;
import com.team766.framework.Procedure;
import com.team766.robot.Robot;

public class DriveStraight extends Procedure {
	public void run(Context context) {
		context.takeOwnership(Robot.drive);
		Robot.drive.setDrivePower(0.25f, 0.25f);
		context.waitForSeconds(3f);
		Robot.drive.setDrivePower(0f, 0f);
		
	}
}
