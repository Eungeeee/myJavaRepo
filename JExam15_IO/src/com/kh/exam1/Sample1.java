package com.kh.exam1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Sample1 {
	
	private static File f;
	
	public static String[] getDirList(String path) {
		/*
		 *  지정한 디렉터리의 모든 파일 및 디렉터리 목록을 반환하는 메서드
		 *  반환형은 문자열 배열
		 *  단, 디렉터리만 반환한다.
		 */
		f = new File(path);
		if(!f.exists()) {
			System.out.println(path + " 에 해당하는 디렉터리 또는 파일이 존재하지 않습니다.");
			return new String[] {""};
		}
		
		File[] fList = f.listFiles();
		String[] sList = new String[fList.length];
		int idx = 0;
		for(int i = 0; i < fList.length; i++) {
			if(fList[i].isDirectory()) {
				sList[idx] = fList[i].getName();
				idx++;
			}
		}
		String[] res = new String[idx];
		System.arraycopy(sList, 0, res, 0, idx);
		return res;
	}
	
	public static String[] getFileList(String path) {
		/*
		 *  지정한 디렉터리의 모든 파일 및 디렉터리 목록을 반환하는 메서드
		 *  반환형은 문자열 배열
		 *  단, 파일만 반환한다.
		 */
		f = new File(path);
		if(!f.exists()) {
			System.out.println(path + " 에 해당하는 디렉터리 또는 파일이 존재하지 않습니다.");
			return new String[] {""};
		}
		
		File[] fList = f.listFiles();
		String[] sList = new String[fList.length];
		int idx = 0;
		for(int i = 0; i < fList.length; i++) {
			if(fList[i].isFile()) {
				sList[idx] = fList[i].getName();
				idx++;
			}
		}
		String[] res = new String[idx];
		System.arraycopy(sList, 0, res, 0, idx);
		return res;
	}
	
	public static String[] getList(String path) {
		/*
		 *  지정한 디렉터리의 모든 파일 및 디렉터리 목록을 반환하는 메서드
		 *  반환형은 문자열 배열
		 *  단, 숨김파일에 대해서는 반환하지 않게 만든다.
		 */
		f = new File(path);
		if(!f.exists()) {
			System.out.println(path + " 에 해당하는 디렉터리 또는 파일이 존재하지 않습니다.");
			return new String[] {""};
		}
		
		File[] fList = f.listFiles();
		String[] sList = new String[fList.length];
		int idx = 0;
		for(int i = 0; i < fList.length; i++) {
			if(!fList[i].isHidden()) {
				sList[idx] = fList[i].getName();
				idx++;
			}
		}
		String[] res = new String[idx];
		System.arraycopy(sList, 0, res, 0, idx);
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(getList("/Users/moongjee/")) + "\n");
		System.out.println(Arrays.toString(getDirList("/Users/moongjee/")) + "\n");
		System.out.println(Arrays.toString(getFileList("/Users/moongjee/")) + "\n");
		
		File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}
		System.out.println(f.getName() + " 읽기 가능? : " + f.canRead() + "\n");
		System.out.println(f.getName() + " 쓰기 가능? : " + f.canWrite() + "\n");
		System.out.println(f.getName() + " 실행 가능? : " + f.canExecute() + "\n");
		System.out.println(f.getName() + " 디렉터리? : " + f.isDirectory() + "\n");
		System.out.println(f.getName() + " 파일? : " + f.isFile() + "\n");
		System.out.println(f.getName() + " 숨김? : " + f.isHidden() + "\n");
		System.out.println(f.getName() + " 크기(바이트)? : " + f.length() + "\n");
		System.out.println(f.getName() + " 마지막 수정날짜 : " + f.lastModified() + "\n");
		
		f = new File("/Users/moongjee/Desktop/Java/");
		String[] fileList = f.list();
		System.out.println(f.list());
		for(int i = 0; i < fileList.length; i++) {
			System.out.println(fileList[i]);
		}
		System.out.println("==============ListFiles()==============");
		File[] fList = f.listFiles();
		System.out.println(f.list());
		for(int i = 0; i < fList.length; i++) {
			System.out.println(fList[i] + "\t" + fList[i].isHidden() + "\t" + fList[i].length());
		}
		
		f = new File("/Users/moongjee/Desktop/Java/newFolder");
		f.mkdir();
		
		f = new File("/Users/moongjee/Desktop/Java/newFolder/sam");
		f.mkdir();
		
		new File("/Users/moongjee/Desktop/Java/newFolder/sam").delete();
	}

}
