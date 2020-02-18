//package oop2;
//
//public class ShapeMain {
//
//	public static void main(String[] args) {
//		Shape shape = new Shape();
//		ShapeCircle circle = new ShapeCircle( "원","브러쉬");	//ShapeCircle 클래스의 객체 circle 생성
//		ShapeSquare rect = new ShapeSquare( "사각형","샤프");	//ShapeRectangle 클래스의 인스턴스 rect 생성
//
//		shape.drawShape();
//		circle.drawShape();
//		rect.drawShape();
//		
//		System.out.println("- - - - - 업 캐 스 팅 - - - - -");
//		shape = circle;
//		shape.drawShape();
//
//		shape = rect;
//		shape.drawShape();
//
////		System.out.println("- - - - - 다 운 캐 스 팅 - - - - -");
////		circle = (ShapeCircle) new Shape();
////		circle.drawShape();
//		//오류남
//
//		//참조변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용
//		System.out.println("- - - - - instanceof - - - - -");
//		System.out.println(rect instanceof Shape);
//		System.out.println(rect instanceof Object);
//		System.out.println(rect instanceof ShapeSquare);
//		System.out.println(shape instanceof ShapeCircle);
//		System.out.println(shape instanceof ShapeSquare);
//		System.out.println(shape instanceof Shape);
//		
//	}//END main()
//
//}//END class
//;