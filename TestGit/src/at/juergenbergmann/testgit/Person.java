package at.juergenbergmann.testgit;

import java.util.Date;

public class Person {
	String name;
	Date geburtsdatum;
	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name
	 * @param geburtsdatum
	 */
	public Person(String name, Date geburtsdatum) {
		super();
		this.name = name;
		this.geburtsdatum = geburtsdatum;
	}
	
}
