package basic.classes.inheritances;

public class Car5 extends Car4 {	
	protected String param5 = "param5";
	
	public static void main(String[] args) {

		// Create a myCar object
		Car5 myCar = new Car5();
		System.out.println(myCar.brand + " " + myCar.param1);
		System.out.println(myCar.brand + " " + myCar.param2);
		System.out.println(myCar.brand + " " + myCar.param3);
		System.out.println(myCar.brand + " " + myCar.param4);
	}
}
