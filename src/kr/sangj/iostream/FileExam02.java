package kr.sangj.iostream;

import java.io.File;
import java.lang.management.GarbageCollectorMXBean;

import javax.crypto.spec.GCMParameterSpec;

public class FileExam02 {

	public static void main(String[] args) {
		
		File f1 = new File("C:/test.txt");
		
		System.out.println("���� �̸� : " + f1.getName());
		System.out.println("���� ��� : " + f1.getPath());
		System.out.println("���� ��� : " + f1.getAbsolutePath());
				
	}
}
