package org.trafficlights.domain;

import java.beans.PropertyEditorSupport;

public class LightStateEditor extends PropertyEditorSupport {

	public void setAsText(String state) {
		setValue(LightState.GREEN);

		for (LightState lightState : LightState.values()) {
			if (lightState.description.equals(state)) {
				setValue(lightState);
				return;
			}
		}
	}
}
