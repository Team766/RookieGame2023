package com.team766.robot.procedures;

import com.team766.framework.Context;
import com.team766.robot.mechanisms.Launcher;

public class Launch extends Procedure {
	public void run(Context context){
		context.takeOwnership(Launcher);
		Launcher.setPusher(true);
		
	}
}
