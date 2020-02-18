package oop2.ex;

//Move와 Attack을 상속
public interface Skill extends Move, Attack{
	//다른 패키지에서는 접근 할 수 없는  helipSkill()작성
	//매개변수: 없음
	//반환값: 없음
	//기능: "[도움말] 스킬은 공격과 이동중에서 선택 가능합니다." 출력
	default void helpSkill() {
		System.out.println("[도움말] 스킬은 공격과 이동중에서 선택 가능합니다.");
	}
	
}
