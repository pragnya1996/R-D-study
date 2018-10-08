package com.infotech.myinterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.infotech.model.Student;
import com.infotech.myinterface.MyInterface;

public class MyClass extends Object implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer maxNum = Collections.max(intList);
		return maxNum;
	}
	
	 public List<Student> sortStudents(List<Student> stuList){
		return stuList;
	}

}
