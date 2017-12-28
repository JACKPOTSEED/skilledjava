package kr.sangj.collectionramework.treesetcomparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {
	
	@SuppressWarnings("rawtypes")
	Set treeSet = new TreeSet<Integer>(new TreeSetComparatorExam());
	
	@SuppressWarnings("unchecked")
	public void print( ) {
		
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(5);
		
		System.out.println("저장된 데이터 수 : " + treeSet.size());
		
		Iterator<Integer> itr = treeSet.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
