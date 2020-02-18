package oop;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// redcar의 색 출력
		String c="color";
		System.out.println(c);
		
		RedCar redcar = new RedCar();
		BluCar blucar = new BluCar();
		GreenCar greencar = new GreenCar();
		
		System.out.println(redcar.color);
		System.out.println(blucar.color);
		System.out.println(greencar.color);

		redcar.start();
		blucar.start();
		greencar.start();
	
	}//END main()

}
