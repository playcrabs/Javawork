package com.iu.dept;

public class DeptDTO {
	//DTO, VO
	//접근제어자 private
	//Setter, Getter
	//생성자는 여러개 가능하지만., Dqfalut 생성자는 꼭 필요!
	//멤버변수의 이름은 테이브의  컬럼명과 데이터 타입 일치
	private int deptno;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	private String dname;
	private String loc;
}
