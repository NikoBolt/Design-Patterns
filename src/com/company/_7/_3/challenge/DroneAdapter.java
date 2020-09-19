package com.company._7._3.challenge;

import com.company._7._3.Objects.Duck;

public class DroneAdapter implements Duck {
	Drone drone;
 
	public DroneAdapter(Drone drone) {
		this.drone = drone;
	}
    
	public void quack() {
		drone.beep();
	}
  
	public void fly() {
		drone.spin_rotors();
		drone.take_off();
	}
}
