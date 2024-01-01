package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student("Tom",1,90,15);
		Student s2 = new Student("Peter",2,89,15);
		Student s3 = new Student("Micky",3,99,16);
		Student s4 = new Student("Authur",4,65,16);
		
		List<Student> ls = new ArrayList<>();
		
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		
		System.out.println("Total Student : "+ls.size());
		
		for(Student p : ls)
		{
			System.out.println(p);
		}
		
		ls.stream().forEach(e -> System.out.print(e));
		
		ls.stream().filter(e -> e.getMarks()>80).forEach(e -> System.out.println(e.getName()+" "+e.getAge()));
		
		int marks = ls.stream().map(e -> e.getMarks()).max(Integer::compare).get();
		System.out.println(marks);
		
		

	}

}
