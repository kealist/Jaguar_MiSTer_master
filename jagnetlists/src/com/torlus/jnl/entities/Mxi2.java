package com.torlus.jnl.entities;

import com.torlus.jnl.Entity;
import com.torlus.jnl.Signal;
import com.torlus.jnl.SignalType;

public class Mxi2 extends Entity {
	@Override
	public String getBaseName() {
		return "mxi2";
	}

	public Mxi2() {
		// 260c_pri_e.pdf - CMXI2XL
		ios.add(new Signal("z", SignalType.OUT));
		ios.add(new Signal("a0", SignalType.IN));
		ios.add(new Signal("a1", SignalType.IN));
		ios.add(new Signal("s", SignalType.IN));
	}
}
