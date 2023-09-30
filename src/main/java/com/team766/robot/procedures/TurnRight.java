package com.team766.robot.procedures;
import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.robot.Robot;
public class TurnRight extends com.team766.framework.Procedure {
	public void run(com.team766.framework.Context context){
		context.takeOwnership(Robot.drive);
		Robot.drive.setdrivepower(0.25, -0.25);
		context.waitForSeconds(3.0);
		Robot.drive.setdrivepower(0, 0);
	}
	
}
