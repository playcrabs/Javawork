//package oop2;
//
//public abstract class Shape {
//	String tool;
//	String name;
//	
//	 public abstract void drawShape();
//	 
//}
// //Shape 클래스를 상속받는  ShapeChild 클래스 작성
//	 abstract class ShapeChild extends Shape{
//		 
//	 }	 
////ShapeChild 클래스를 상속받는  ShapeGrandeChild 클래스 작성
//	 abstract class ShapeGrandeChild extends ShapeChild{
//		 
//	 }	
//	 
//	 class ShapeGrandGrandChild extends ShapeGrandeChild{
//
//		@Override
//		public void drawShape() {
//			
//		}
//		 
//	 }
//	 
////Shape 클래스를 상속받는 ShapeCircle 클래스 작성
////3.14를 클래스 외부에서는 사용할 수 없는 공유 상수로 작성
////멤버변수를 매개변수로 넘겨받아 초기화 하는 생성자 작성
////부모의 메소드를 오버라이딩 - ShapeCircle클래스가 ~~~(tool)로 ~~~(name)을 그리다.
////원의 면적을 구하는 공식을 출력하는 drawCircleFormula() 작성
//class ShapeCircle extends Shape{
//	private static final double PI =3.14;
//	
//	public void drawCircleFormula() {
//		System.out.println("원의 면적:"+2*PI);
//	}
//	
//	public ShapeCircle(String name, String tool) {
//		this.name=name;
//		this.tool=tool;
//	} //부모의 멤버변수를 매개변수로 넘겨받아 초기화하는 생성자 작성
//
//	@Override
//	public void drawShape() {
//		super.drawShape();
//		System.out.println("ShapeRectangle클래스가 "+tool+"로 "+name+"을 그리다.");
//	}
//}
//
////Shape 클래스를 상속받는 ShapeSquare 클래스 작성
////사각형의 가로,세로 길이를 정수형으로 저장하는 멤버변수 선언(외부에서 접근불가)
////부모의 멤버변수를 매개변수로 넘겨받아 초기화하는 생성자 작성
////부모의 메소드를 오버라이딩 하여 클래스가 다음을 출력
////-ShapeRectangle클래스가 ~~(tool)로 ~~~(name)을 그리다.
////사각형의 면적을 구하는 공식을 출력하는 drawRectangleFormula() 작성
//class ShapeSquare extends Shape{
//	private int width;	//가로
//	private int height;	//세로
//	
//	public void drawRectangleFormula() {
//		System.out.println("사각형의 면적:"+width*height);
//	}
//	
//	public ShapeSquare(String name, String tool) {
//		this.name=name;
//		this.tool=tool;
//	} //부모의 멤버변수를 매개변수로 넘겨받아 초기화하는 생성자 작성
//	
//	@Override
//	public void drawShape() {
//		super.drawShape();
//		System.out.println("ShapeRectangle클래스가 "+tool+"로 "+name+"을 그리다.");
//	}
//	
//}