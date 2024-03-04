package com.demo.record;

sealed public class Car permits BMWCar, AudiCar, TataCar{

	void show() {
		System.out.println("This is car !");
	}
}
sealed class BMWCar extends Car  permits MSCar{
	
	public static void main(String[] args) {
		BMWCar c = new BMWCar();
		c.show();
	}
}
non-sealed class AudiCar extends Car{
	
}
final class TataCar extends Car{
	
}
final class MSCar extends BMWCar{
	
}

