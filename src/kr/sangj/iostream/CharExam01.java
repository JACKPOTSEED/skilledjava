package kr.sangj.iostream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharExam01 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		try {
			
			line = br.readLine();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(line);
	}
}
