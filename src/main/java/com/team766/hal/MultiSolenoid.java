package com.team766.hal;

public class MultiSolenoid implements SolenoidController {

	private SolenoidController[] solenoids;
	private boolean state;

	public MultiSolenoid(final SolenoidController... solenoidsParam) {
		this.solenoids = solenoidsParam;

		set(false);
	}

	@Override
	public boolean get() {
		return state;
	}

	@Override
	public void set(final boolean on) {
		state = on;
		for (SolenoidController s : solenoids) {
			s.set(on);
		}
	}

}