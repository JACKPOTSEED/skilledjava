package kr.sangj.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.tree.FixedHeightLayoutCache;

public class ByteExam01 {

	FileInputStream fis  = null;
	FileOutputStream fos = null;
	
	public void fileInit() throws IOException {
		
		try {
			
			fis = new FileInputStream("c:/test.png");
			fos = new FileOutputStream("byte.txt");
			
			int readData = -1;
			
			while ((readData = fis.read()) != -1) {
				
				fos.write(readData);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally{
			
            try {
                fos.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
	}
}