package com.company._6_Command._4_RemoteControl.Commands;

import com.company._6_Command._4_RemoteControl.Objects.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public String toString() {
		return "LightOffCommand";
	}
}
