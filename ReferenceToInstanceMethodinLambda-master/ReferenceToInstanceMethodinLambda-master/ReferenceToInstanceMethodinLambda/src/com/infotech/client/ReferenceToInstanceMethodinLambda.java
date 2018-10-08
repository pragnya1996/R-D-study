package com.infotech.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.infotech.model.Person;

public class ReferenceToInstanceMethodinLambda {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Bindu", 21));
		persons.add(new Person("yashu", 21));
		persons.add(new Person("pragnya", 22));
		persons.add(new Person("ranjana", 22));
		
		
	List<String> personNames =ReferenceToInstanceMethodinLambda.getPersonsName(persons,Person::getName);
	personNames.forEach(System.out::println);
	}

	private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {
		List<String> results  = new ArrayList<>();
		persons.forEach(n->results.add(f.apply(n)));
		return results;
	}

}
