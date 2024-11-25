package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);
		Plane avion2 = new Plane("Airbus300");
		Plane avion3 = new Plane("Harrier");
		Tractor tractor2 = new Tractor(1000);

		plane.start();
		tractor.start();
		avion2.start();
		avion2.stop();
		avion3.maintenance();

		plane.fly();
		tractor.forward();

	}

}
