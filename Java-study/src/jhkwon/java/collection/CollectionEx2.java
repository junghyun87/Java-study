package jhkwon.java.collection;

import static java.lang.System.out;
import java.util.*;

public class CollectionEx2{

	class StudentComapre implements Comparator<Student>{
		public int compare(Student one, Student two){
			return one.name.compareTo(two.name);
		}
	}
	class StudentComapre_height implements Comparator<Student>{
		public int compare(Student one, Student two){
			return new Integer(one.height).compareTo(new Integer(two.height));
		}
	}
	public void go(){
		//List
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(10,"Mary",180));
		list.add(new Student(2,"John",175));
		list.add(new Student(3,"Steve",178));

		StudentComapre studentCompare = new StudentComapre();
		Collections.sort(list,studentCompare);
		Iterator it0 = list.iterator();
		while(it0.hasNext()){
			out.println(it0.next());
		}

		//TreeSet
		
	}

	public static void main(String[] args){
		
		new CollectionEx2().go();
		

		//HashMap
		HashMap<Student,Integer> hm = new HashMap<Student,Integer>();
		hm.put(new Student(1,"Mary"),100);
		hm.put(new Student(2,"John"),95);
		hm.put(new Student(3,"Steve"),80);
		int result = hm.get(new Student(2,"John"));
		out.println(result);
		Set set = hm.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			out.println(it.next());
		}

		//HashSet

		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student(1,"Mary"));
		hs.add(new Student(2,"John"));
		hs.add(new Student(1,"Mary"));
		Iterator it2 = hs.iterator();
		while(it2.hasNext()){
			out.println(it2.next());
		}

	}

}

class Student{
	public int id;
	public String name;
	public int height;

	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name,int height){
		this.id = id;
		this.name = name;
		this.height = height;
	}

	@Override
	public String toString(){
		return "id: " + id + ", name: "+name+", height: " + height;
	}

	@Override
	public int hashCode(){
		return name.hashCode();
	}

	@Override
	public boolean equals(Object other){
		if(!(other instanceof Student))
			return false;
		if (other == this){
			return true;
		}
		return this.id == ((Student)other).id;
	}
}