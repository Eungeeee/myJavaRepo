package com.kh.exam3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {
	
	public static int wordCount(String filename, String word) {
		/*
		 * 지정한 파일의 문자열에서 word에 해당하는 단어가 몇개 있는지 반환하는 메서드
		 */
		try {
			File f = new File(filename);
			FileReader fr = new FileReader(f);
			int read;
			char[] cArr = new char[1024];
			String s = "";
			while((read = fr.read(cArr)) != -1) {
				s += new String(cArr, 0, read);
			}
			int stIdx = 0;
			int foundCount = 0;
			while(true) {
				stIdx = s.indexOf(word, stIdx);
				if(stIdx == -1) {
					break;
				}
				foundCount += 1;
				stIdx = stIdx + 1;
			}
			fr.close();
			return foundCount;
		} catch(FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다.");
		} catch(IOException e) {
			System.out.println("파일 입출력에 문제가 발생 했습니다.");
		}
		return 0;
	}
	
	
	public static void saveDirFileList(String dir) {
		/*
		 * 지정한 디렉터리 안의 폴더와 파일의 목록을 파일로 만들어 출력
		 * 숨김 파일/폴더, 일반 파일/폴더를 구분하여 저장한다.
		 */
		File f = new File(dir);
		
		if(!f.exists()) {
			System.out.println(dir + " 에 해당하는 디렉터리 또는 파일이 존재하지 않습니다.");
		}
		
		File[] fList = f.listFiles();
		// nFile : 일반 파일 문자열 | nFolder : 일반 디렉터리 | dFile : 숨김 파일 | dFolder : 숨김 디렉터리
		String nFile = "", nFolder = "", dFile = "", dFolder = "";
		for(int i = 0; i < fList.length; i++) {
			if(fList[i].isFile()) {
				if(fList[i].isHidden()) {
				dFile += fList[i].getName();
				} else {
					nFile += fList[i].getName();
				}
			} else if (fList[i].isDirectory()){
				if(fList[i].isHidden()) {
					dFolder += fList[i].getName() + ", ";
				} else {
					nFolder += fList[i].getName() + ", ";
				}
			}
		}
		try {
		FileWriter fw = new FileWriter(dir + "/list.txt");
		fw.write(dir + "의 파일 목록\n");
		fw.write("\t숨김 파일\n");
		fw.write("\t\t" + dFile + "\n");
		fw.write("\t숨김 폴더\n");
		fw.write("\t\t" + dFolder + "\n");
		fw.write("\t폴더\n");
		fw.write("\t\t" + nFolder + "\n");
		fw.write("\t파일\n");
		fw.write("\t\t" + nFile + "\n");
		fw.close();
		System.out.println(dir + "/list.txt 위치에 파일 쓰기가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일 및 디렉터리가 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일 입출력에 오류가 발생했습니다.");
		}
	}

	
	public static void main(String[] args) {
		/**
		 * 	FileReader / FileWriter
		 * 		- 파일로 부터 문자 단위의 데이터 읽기 / 쓰기
		 * 		- 주로 텍스트 파일에 대한 처리를 담당
		 */
		String filename = "/Users/moongjee/Library/Containers/jp.naver.line.mac/Data/Library/Containers/jp.naver.line/Data/LINE.ini";
		System.out.println(wordCount(filename,"window"));
		saveDirFileList("/Users/moongjee");
		
		
		// 파일 읽기
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileReader fr = new FileReader(f);
			int read;
			char[] cArr = new char[4];
			// 문자 배열로 읽은 데이터를 하나의 문자열로 만들어 출력
			String s = "";
			StringBuffer sb = new StringBuffer();
			while((read = fr.read(cArr)) != -1) {
				s += new String(cArr, 0, read);
				sb.append(cArr, 0, read);
				/* if(cArr.length == read) {
				s += new String(cArr);
				sb.append(cArr);
				} else {
					for(int i = 0; i < read; i++) {
						s += cArr[i];
						sb.append(cArr[i]);
					}
				}
				// System.out.print(cArr);
				// 반복문에서 출력하지 않고 반복이 끝난 이후에 출력하기 위해서 문자열 이용하여 수정
				 */
			}
			System.out.println(s);
			System.out.println(sb.toString());
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoungException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}
		
		
		// 파일 쓰기
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("파일에 문자열 쓰기");
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoungException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}
		
	}

}
