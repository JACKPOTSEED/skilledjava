package kr.sangj.polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolymorphismExam {

	public void print() {
			
		List<HashMap<String, Object>> priceList = new ArrayList<HashMap<String,Object>>();
		//이게 동작 할거라고 생각했는데 동작하지 않고 위에 것이 동작함.
		/*List<Map> listMap = new ArrayList<HashMap<String, Object>>();*/ 
		
		/*Map resMap = new HashMap<String,Object>();*/
		Map resMap = new HashMap<String,Object>();
		
		HashMap<String, Object> hasMap = new HashMap<>();
		
		/*hasMap.*/
		/*resMap.*/
		resMap.put("result", true);
		
		System.out.println("resMap : " + resMap);
	}	
}
