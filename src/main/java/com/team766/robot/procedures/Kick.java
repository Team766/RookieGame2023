package com.team766.robot.procedures;

import com.team766.framework.Procedure;
import com.team766.library.RateLimiter;
import com.team766.framework.Context;
import com.team766.robot.Robot;
import com.team766.library.RateLimiter;


public class Kick extends Procedure {
	
	private RateLimiter rateLimiter1 = new RateLimiter(0.25);
	private RateLimiter rateLimiter2 = new RateLimiter(2.25);
	private RateLimiter rateLimiter3 = new RateLimiter(4.25);

	// Doesn't work.
	public void run (Context context) {
		// context.takeOwnership(Robot.kicker);
		// // Kick
		// Robot.kicker.setKickerPower(0.5);
		// while (true) {
		// 	if (rateLimiter1.next()) {
		// 	Robot.kicker.setKickerPower(0.0);
		// 	break;
		// 	}
		// }

		// // Wait for kicking to end, then pull back the kicker.
		// while (true) {
		// 	if (rateLimiter2.next()) {
		// 		Robot.kicker.setKickerPower(0.25);
		// 		break;
		// 	}
		// }

		// // Stop pulling back the kicker.
		// while (true) {
		// 	if (rateLimiter3.next()) {
		// 		Robot.kicker.setKickerPower(0.0);
		// 	}
		// }
	}
}