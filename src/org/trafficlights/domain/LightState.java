package org.trafficlights.domain;

public enum LightState {
	RED {
		public LightState next() { return RED_YELLOW; }
	},
	RED_YELLOW {
		public LightState next() { return GREEN; }
	},
	GREEN {
		public LightState next() { return YELLOW; }
	},
	YELLOW {
		public LightState next() { return RED; }
	};

	public abstract LightState next();

}
