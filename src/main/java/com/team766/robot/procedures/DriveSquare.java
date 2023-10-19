
package com.team766.robot.procedures;
import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.robot.Robot;
import com.team766.robot.mechanisms.Drive;
import com.team766.logging.Category;
public class DriveSquare extends com.team766.framework.Procedure {
	public DriveSquare(){
		loggerCategory = Category.AUTONOMOUS;
	}
	public void run(Context context){
		new DriveStraight().run(context);
		log("first side complete");
		new TurnRight().run(context);
		log("first corner complete");
		new DriveStraight().run(context);
		log("second side complete");
		new TurnRight().run(context);
		log("second corner complete");
		new DriveStraight().run(context);
		log("third side complete");
		new TurnRight().run(context);
		log ("third corner complete");
		new DriveStraight().run(context);
		log ("fourth side complete");
		new TurnRight().run(context);
		log ("fourth corner complete");
	}
	
}

