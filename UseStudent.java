package com.onesoft.collection3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student(1121,"gokul","male",14,"8th","C sec");
		Student s2=new Student(1122,"Karthi","male",15,"9th","A sec");
		Student s3=new Student(1123,"Hari","male",15,"7th","B sec");
		Student s4=new Student(1124,"Murugan","male",14,"9th","A sec");
		Student s5=new Student(1125,"Gopal","male",14,"8th","B sec");
		Student s6=new Student(1126,"Krishna","male",14,"9th","A sec");
		Student s7=new Student(1127,"Kavin","male",14,"7th","B sec");
		Student s8=new Student(1128,"ccc","male",14,"7th","B sec");
		Student s9=new Student(1129,"bbb","male",14,"9th","C sec");
		Student s10=new Student(1130,"AAA","male",14,"8th","B sec");
		Student s11=new Student(1131,"yyy","male",14,"9th","A sec");
		Student s12=new Student(1132,"Oberoi","male",14,"8th","C sec");
		Student s13=new Student(1133,"Vivek","male",14,"7th","C sec");
		Student s14=new Student(1134,"Sajn","male",14,"8th","B sec");
		Student s15=new Student(1135,"xxx","male",14,"6th","A sec");
		ArrayList<Student>s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
		s.add(s8);
		s.add(s9);
		s.add(s9);
		s.add(s10);
		s.add(s11);
		s.add(s12);
		s.add(s13);
		s.add(s14);
		s.add(s15);
		List<Student>asec=s.stream().filter(x->x.getSec().equalsIgnoreCase("A Sec")).collect(Collectors.toList());
		List<Student>bsec=s.stream().filter(y->y.getSec().equalsIgnoreCase("b Sec")).collect(Collectors.toList());
		List<Student>csec=s.stream().filter(z->z.getSec().equalsIgnoreCase("C Sec")).collect(Collectors.toList());
		List<String>name=s.stream().filter(a->a.getGender().equalsIgnoreCase("male")).map(b->b.getName()).collect(Collectors.toList());
		long count8th=s.stream().filter(b->b.getStd().equalsIgnoreCase("8th")).count();
		System.out.println(asec);
		System.out.println(bsec);
		System.out.println(name);
		System.out.println(count8th);
		List<String>asec1=asec.stream().map(c->c.getName()).sorted().collect(Collectors.toList());
		System.out.println(asec1);
		List<Integer>id=s.stream().map(c->c.getId()).sorted().collect(Collectors.toList());
		System.out.println(id);
		Optional<Integer>maxNum=id.stream().max((x,y)->x.compareTo(y));
		System.out.println(maxNum.get());
		List<Student>minnum=s.stream().filter(x->x.getStd().equalsIgnoreCase("8th")).collect(Collectors.toList());
		
		Student min=minnum.stream().min(Comparator.comparing(Student::getId)).get();
		System.out.println(min);
		List<Student>first10val=s.stream().limit(10).collect(Collectors.toList());
		System.out.println(first10val);
		Integer sum=id.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
