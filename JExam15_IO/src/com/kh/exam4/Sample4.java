package com.kh.exam4;

import java.io.*;

public class Sample4 {

	public static void main(String[] args) {
		// FileInputStream + InputStreamReader
		//	  바이트 기반	   +     문자 보조
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileInputStream fis = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(fis);
			
			int read;
			String s ="";

			char[] cArr = new char[16];
			
			while((read = isr.read(cArr)) != -1) {
				if(read == cArr.length) {
					s += new String(cArr);
				} else {
					s += new String(cArr, 0, read);
				}
			}
			System.out.println(s);
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
		// FileOutputStream + OutputStreamWriter
		//	   바이트 기반		+    문자 보조
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileOutputStream fos = new FileOutputStream(f, true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			osw.write("\n문자열을 입력하여 파일 쓰기\n");
			osw.close();
			fos.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// FileReader + BufferedReader
		//   문자 기반	  +   버퍼 보조
		try {
			File f = new File("/Users/moongjee/Desktop/Java/Sample.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String s = "";
			while(br.ready()) {
				s += br.readLine();
			}
			System.out.print(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
