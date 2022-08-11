package kr.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	// 객체를 생성해서 메소드 만드는 과정을 단순화 하기 위해 interface 생성
	// 추상 메소드 : 값이 없고 메소드의 기본 값을 설정해줌
	// 우리는 인터페이스를 상속받아서 메소드를 강제적으로 구현할 것
	// 메소드의 이름은 다 같에 만들어 오버라이딩(재정의)해서 기능 구현할 것
	public abstract String execute(HttpServletRequest request, HttpServletResponse response);
}
