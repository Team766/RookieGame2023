package com.team766.robot;

import com.team766.robot.mechanisms.*;

public class Robot {
	// Declare mechanisms here
	public static Drive drive;
	public static Kicker kicker;
	public static Launcher launcher;

	public static void robotInit() {
		// Initialize mechanisms here
		drive = new Drive();
		kicker = new Kicker();
		launcher = new Launcher();
	}
}
