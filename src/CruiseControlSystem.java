/**
 * This is the main class that you need to implement. You only have
 * a single method to implement, but of course that may be easier if
 * you define some auxiliary methods.
 */
public class CruiseControlSystem implements ICruiseControlSystem {
	/*
	 * Students may add any private fields or methods that they deem
	 * necessary. Public ones should not be necessary (there is no
	 * rule against it, but you should not be changing the support code
	 * and the rest of the code knows only about this).
	 */
	boolean cruiseControlStatus = false; 
	double storedThrottlePosition = 0.0;
	boolean accelerateButtonPressed = false;
	boolean acceleratePedalPressed = false;
	boolean turnOff = false;
	
	private boolean checkConditions(Car car) {
		if (car.engine_sensor.is_engine_on()
			&& !car.brake_pedal.is_brake_on()
			&& car.speed_sensor.get_speed() >= 40.0 
			&& car.speed_sensor.get_speed() < 250.0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private void startCruisingFromButton(Car car) {
		
	}
	
	private void turnOnCruising(Car car) {
		if (checkConditions(car)) {
		car.dashboard.set_start_ccs(true); 
		cruiseControlStatus = true;
		storedThrottlePosition = car.throttle.getThrottlePosition();
		car.throttle.setThrottlePosition(storedThrottlePosition);
		}
	}
	
	private void startAcceleratingFromButton(Car car) {
		
	}
	
	private void startAcceleratingFromPedal(Car car) {
		
	}
	
	private void resumeCCS(Car car) {
		
	}
	
	private void stopAcceleratingFromButton(Car car) {
		
	}
	
	private void stopCruisingFromButton(Car car) {
		
	}
	
	private void stopCruisingFromBrake(Car car) {
		
	}
	
	

	
	public void pulse(Car car){
		/* Implement Something Here */
		
		
	}
}
