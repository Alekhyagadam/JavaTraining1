package JavaActivity1;

public class Car {
		String color;
		String transmission;
		int make;
		int tyres;
		int doors;
		
		Car(){
			doors = 4;
			tyres =4;
		}
			public void displayCharacteristics() {
				System.out.println("The color of car is :"  +color);
				System.out.println("The transmission of car is:" +transmission);
				System.out.println("The make of the car is :" +make);
				System.out.println("The number of tyres is:" +tyres);
				System.out.println("The number of doors is :" +doors);
			}
			
			public void accelerate() {
				System.out.println("Car is moving forward");
			}
			
			public void brake() {
				System.out.println("Car has stopped");
			}
			
	
	
   


}

