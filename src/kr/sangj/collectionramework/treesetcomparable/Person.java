package kr.sangj.collectionramework.treesetcomparable;

public class Person implements Comparable<Person> {

	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age  = age;
	}
	
	public void print() {
		
		System.out.println("이름은 : " + name + " 나이는 : " + age);
	}

	@Override
	public int compareTo(Person o) {

		if (age > o.age) {
			
			return -1;
		} else if(age < o.age) {
			
			return 1;
		} else
		return 0;
	}
	
}
