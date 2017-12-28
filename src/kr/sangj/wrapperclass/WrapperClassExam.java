package kr.sangj.wrapperclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wrapper Class�� �뵵�� �ڽ�
 * @author riris
 *
 */
public class WrapperClassExam {
	
	//�ڽ��� �Ͼ
	public byte b 	  = 4;
	public Byte WrapB = b;	
	
	public void print() {
		
		if (WrapB instanceof Byte) {
			
			System.out.println("Wrap B �� ����Ʈ�� �Դϴ�.");
		}
		
		// WrapperŬ������ �޼ҵ� ���
		System.out.println("WrapB.toString() : " + WrapB.toString());		
		
		// ��ȯ���� int �϶� ���
		System.out.println("Integer.parseInt() : " + Integer.parseInt(WrapB.toString()));
				
		// ��ȯ���� Integer �ϋ� ���
		System.out.println("Integer.valueOf() : "  + Integer.valueOf(Integer.parseInt(WrapB.toString())));
		
		//���׸������� �ڽ�1		
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		resMap.put("�̻���",23);
		
		System.out.println(resMap.get("�̻���"));
		
		//���׸������� �ڽ�2
		List<Map<String,Object>> userList= new ArrayList<Map<String,Object>>();			
		
		Map testMap = new HashMap<String,Object>();
		testMap.put("�ż�ȣ", 24);	
		
		userList.add(testMap);
		
		System.out.println("userList : " + userList);
		
		for (int i = 0; i < userList.size(); i++) {
			
			System.out.println(userList.get(i).get("�ż�ȣ"));			
		}
	}	
}
