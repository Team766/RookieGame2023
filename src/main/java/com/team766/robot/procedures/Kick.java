package com.team766.robot.procedures;

import com.team766.framework.Context;
import com.team766.framework.Procedure;
import com.team766.robot.Robot;

public class Kick extends Procedure {
	
	public void run(Context context) {
		context.takeOwnership(Robot.kicker);
		Robot.kicker.kick(true);
		context.waitForSeconds(0.5);
		Robot.kicker.kick(false);
	}
}
