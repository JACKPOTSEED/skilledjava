package kr.sangj.main;

import java.io.IOException;

import kr.sangj.iostream.ByteExam01;

public class ByteMain {

	public static void main(String[] args) {
		
		ByteExam01 ByteExam01 = new ByteExam01();
		
		try {
			ByteExam01.fileInit();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}	
}
