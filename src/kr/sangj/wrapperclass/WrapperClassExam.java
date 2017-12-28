package kr.sangj.wrapperclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wrapper Class의 용도와 박싱
 * @author riris
 *
 */
public class WrapperClassExam {
	
	//박싱이 일어남
	public byte b 	  = 4;
	public Byte WrapB = b;	
	
	public void print() {
		
		if (WrapB instanceof Byte) {
			
			System.out.println("Wrap B 는 바이트형 입니다.");
		}
		
		// Wrapper클래스의 메소드 사용
		System.out.println("WrapB.toString() : " + WrapB.toString());		
		
		// 반환형이 int 일때 사용
		System.out.println("Integer.parseInt() : " + Integer.parseInt(WrapB.toString()));
				
		// 반환형이 Integer 일떄 사용
		System.out.println("Integer.valueOf() : "  + Integer.valueOf(Integer.parseInt(WrapB.toString())));
		
		//제네릭에서의 박싱1		
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		resMap.put("이상정",23);
		
		System.out.println(resMap.get("이상정"));
		
		//제네릭에서의 박싱2
		List<Map<String,Object>> userList= new ArrayList<Map<String,Object>>();			
		
		Map testMap = new HashMap<String,Object>();
		testMap.put("신선호", 24);	
		
		userList.add(testMap);
		
		System.out.println("userList : " + userList);
		
		for (int i = 0; i < userList.size(); i++) {
			
			System.out.println(userList.get(i).get("신선호"));			
		}
	}	
}
