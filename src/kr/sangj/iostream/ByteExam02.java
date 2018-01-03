package kr.sangj.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteExam02 {

	public static void main(String[] args) {			
		
		InputStream input = null;
        try{
            // ȭ�鿡 ǥ���ϰ��� �ϴ� ������ �����Ѵ�.
            File file = new File("C:/test.txt");
             
            // FileInputStream �� File object�� ������ �μ��� ���� �� �ִ�.         
            input = new FileInputStream(file);
            int i = 0;
            while((i = input.read()) != -1) {
                System.out.write(i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try{
                // ������ InputStream Object�� �ݾ��ش�.
                input.close();
            } catch(IOException io) {}
        }
    }
}
