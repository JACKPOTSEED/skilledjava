package kr.sangj.main;

import java.awt.TexturePaint;
import java.util.Iterator;
import java.util.TreeSet;

import kr.sangj.collectionramework.treesetcomparable.Person;
import kr.sangj.collectionramework.treesetcomparator.TreeSetExam;

/**
 * @author sangj
 * @since  2017.12.28
 */
public class Main {

	public static void main(String[] args) {

		/*TreeSetExam treeSetExam = new TreeSetExam();

		treeSetExam.print();*/
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("lee", 23));					
		treeSet.add(new Person("sin", 24));						
		treeSet.add(new Person("choi", 33));			
		
		Iterator<Person> itr = treeSet.iterator();
		
		while (itr.hasNext()) {
			
			itr.next().print();
		}
	}
}