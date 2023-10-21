package com.team766.robot.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.robot.Robot;

public class DriveTurn extends Procedure {
	
	public void run (Context context) {
		context.takeOwnership(Robot.drive);

		new DriveStraight().run(context);
		new TurnLeft().run(context);
	}
}