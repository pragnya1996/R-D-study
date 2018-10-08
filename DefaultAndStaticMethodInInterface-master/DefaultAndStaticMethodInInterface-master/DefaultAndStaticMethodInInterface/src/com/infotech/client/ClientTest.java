package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

import com.infotech.model.Student;
import com.infotech.myinterface.MyInterface;
import com.infotech.myinterfaceImpl.MyClass;

public class ClientTest {

	public static void main(String[] args) {

		MyInterface myInterface = new MyClass();
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("ram", 20));
		stuList.add(new Student("shyam", 16));
		stuList.add(new Student("kiran", 26));
		
		List<Student> sortStudents = myInterface.sortStudents(stuList);
		for (Student student : sortStudents) {
			System.out.println(student.getName()+"\t"+student.getAge());
		}
		
		System.out.println("-------------------------------");
		
		MyInterface.greet("ram");
		
		System.out.println("-----------------------------------");
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1000);
		intList.add(50);
		intList.add(9000);
		intList.add(90);
		Integer maxNum = myInterface.getMaxNum(intList);
		System.out.println("Max Num:"+maxNum);
		
	}

}
