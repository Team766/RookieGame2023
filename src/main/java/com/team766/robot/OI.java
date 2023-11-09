package com.team766.robot;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.hal.JoystickReader;
import com.team766.hal.RobotProvider;
import com.team766.logging.Category;
import com.team766.robot.procedures.*;
import edu.wpi.first.wpilibj.DriverStation;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the code that allow control of the robot.
 */
public class OI extends Procedure {
	private JoystickReader joystick0;
	private JoystickReader joystick1;

	public OI() {
		loggerCategory = Category.OPERATOR_INTERFACE;

		joystick0 = RobotProvider.instance.getJoystick(0);
		joystick1 = RobotProvider.instance.getJoystick(1);
	}

	public void run(final Context context) {
		context.takeOwnership(Robot.drive);
		while (true) {
			// joystick 0 should be forward and backward.
			// joystick (1 for 2 joysticks, 0 for one controller) should be turning left and right.
			// axis 1 is forward backward, axis (0 for 2 joysticks, 2 for one controller) is left right.
			double leftMotorPower = -joystick0.getAxis(2) + joystick0.getAxis(1);
			// Use this for just a controller.
			double rightMotorPower = joystick0.getAxis(2) + joystick0.getAxis(1);
			
			//leftMotorPower = joystick0.getAxis(1);
		    //rightMotorPower = joystick0.getAxis(3);

			// use b for kicker
			double kickPower;
			if (joystick0.getButtonPressed(1)) {
				kickPower = 0.25;
			} else {
				kickPower = 0;
			}

			Robot.kicker.kick(kickPower);

			Robot.drive.setDrivePower(leftMotorPower, rightMotorPower);

			// wait for driver station data (and refresh it using the WPILib APIs)
			context.waitFor(() -> RobotProvider.instance.hasNewDriverStationData());
			RobotProvider.instance.refreshDriverStationData();

			// Add driver controls here - make sure to take/release ownership
			// of mechanisms when appropriate.
		}
	}
}
