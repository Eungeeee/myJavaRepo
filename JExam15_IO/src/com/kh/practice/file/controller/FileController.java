package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	/**
	 *  여기에서 파일에 직접 접근하여 사용하는 것이 아니라 FileController에서
	 *  FileDAO 객체를 이용해 FileDAO가 재공하는 기능을 사용하여 파일 작업을 한다.
	 */
	FileDAO fdao = new FileDAO();
	
	public void listFile() {
		String[] res = fdao.listFile();
		if(res.length != 0) {
			for(int i = 0; i < res.length; i++) {
				System.out.println(res[i]);
			}
		} else {
			System.out.println("해당 디렉터리에 파일이 없습니다. 임의로 기본 파일을 생성합니다.");
			fdao.addFile("default.txt");
		}
	}

	public void addFile(String name) {
		// FileDAO 에 지정한 이름의 파일이 이미 존재하는지 검사를 할 수 있는
		// 메서드(existFile())를 추가 하여 동일한 이름의 파일이 존재하는 경우
		// (1), (2), (3), (4) 의 접두사가 붙는 형식으로 파일이 생성 될 수 있도록 한다.
		fdao.addFile(name);
	}
	
	public void readFile(String name) {
		// TODO Auto-generated method stub
		
	}
	public void editFile(String name, String before, String after) {
		// TODO Auto-generated method stub
		
	}
	public void deleteFile(String name) {
		// TODO Auto-generated method stub
		
	}

}
