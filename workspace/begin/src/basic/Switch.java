package basic;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch 문
		//	if문과 달리 조건식의 결과가 정수형 범위 이내이거나
		//	문자열에 해당하는 경우 사용
		//	조건식에 일치하는  case 문으로 이동하여
		//	break문을 만날 때 까지 수행
		//	(break문이 없으면 switch문이 마지막까지 이동)
		//	일치하는 case가 없으면 default문(생략가능)으로 이동
		//	case는 리터럴이나 상수만 사용 가능
		
		// switch( 조건식 ){
		// case 값1 :		break;
		// case 값2 :		break;
		// ...
		// default :
		// }
		
		String bloodtype = "";
		char type = 'A';
		
		switch (type) {
		case 'A': bloodtype = "A형";		break;
		case 'B': bloodtype = "B형";		break;
		case 'O': bloodtype = "O형";		break;		
		default:  bloodtype = "AB형";	break;
		}
		System.out.println(bloodtype);
		
		int num = 1;
		switch (num) {
		case 1: bloodtype = "one";		break;
		case 2: bloodtype = "two";		break;
		case 3: bloodtype = "three";	break;	
		default:  bloodtype = "four";	break;
		}
		System.out.println(bloodtype);
		
		//ABO만 입력가능하게 수정
		String type2 = "a";
		switch (type2) {
		case "A": case"a" :bloodtype = "A형";		break;
		case "B": case"b" :bloodtype = "B형";		break;
		case "O": case"o" :bloodtype = "O형";		break;		
		case "AB": case"ab" : bloodtype = "AB형";	break;		
		default:  bloodtype = "제대로 입력";			break;
		}
		System.out.println(bloodtype);
		System.out.println();
		
		//난수얻기
		System.out.println(Math.random());
		System.out.println(Math.random()*1);
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*3));
		System.out.println((int)(Math.random()*3)+1);
	}//END main();

}
