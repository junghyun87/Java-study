package jhkwon.java.collection;

import java.util.*;
import static java.lang.System.out;

//1. implement Comaprable class and compareTo(Object b) method
class StudentEntity implements Comparable<StudentEntity>{
	public int id;
	public String name;
	public int height;

	public StudentEntity(int id, String name){
		this.id = id;
		this.name = name;
	}

	public StudentEntity(int id, String name,int height){
		this.id = id;
		this.name = name;
		this.height = height;
	}

	public int compareTo(StudentEntity s){
		StudentEntity stu = (StudentEntity) s;
		return name.compareTo(stu.name);
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
		if(!(other instanceof StudentEntity))
			return false;
		if (other == this){
			return true;
		}
		return this.id == ((StudentEntity)other).id;
	}
}

//2. impements Comparator
class StudentCompare implements Comparator<StudentEntity>{
	public int compare(StudentEntity one, StudentEntity two){
		return (one.name.compareTo(two.name));
	}
}

public class Sorting{
	public static void main(String[] args){
		new Sorting().go();
	}
	public void go(){
		StudentCompare sCompare = new StudentCompare();
		TreeSet<StudentEntity> tree = new TreeSet<StudentEntity>(sCompare);
		tree.add(new StudentEntity(1,"Mary"));
		tree.add(new StudentEntity(2,"John"));
		tree.add(new StudentEntity(3,"Mary"));
		Iterator it2 = tree.iterator();
		while(it2.hasNext()){
			out.println(it2.next());
		}

	}
}