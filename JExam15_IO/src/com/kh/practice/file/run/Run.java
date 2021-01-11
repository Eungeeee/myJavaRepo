package com.kh.practice.file.run;
import com.kh.practice.file.view.FileMenu;
/**
 * 파일 입출력을 사용하여 특정 디렉토리 영역에 있는 파일 조회 및 수정, 삭제, 추가 기능이 있는 프로그램으로 만든다.
 */
public class Run {

	public static void main(String[] args) {
		/**
		 *  FileMenu 클래스의 mainMenu 메서드 실행
		 */
		FileMenu fm = new FileMenu();
		fm.mainMenu();
	}

}
