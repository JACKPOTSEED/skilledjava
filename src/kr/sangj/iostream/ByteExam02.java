package kr.sangj.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteExam02 {

	public static void main(String[] args) {			
		
		InputStream input = null;
        try{
            // 화면에 표시하고자 하는 파일을 선택한다.
            File file = new File("C:/test.txt");
             
            // FileInputStream 는 File object를 생성자 인수로 받을 수 있다.         
            input = new FileInputStream(file);
            int i = 0;
            while((i = input.read()) != -1) {
                System.out.write(i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try{
                // 생성된 InputStream Object를 닫아준다.
                input.close();
            } catch(IOException io) {}
        }
    }
}
