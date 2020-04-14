package com.atguigu.day21Hashmap.java;

public class Person {

	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
            return other.name == null;
		} else return name.equals(other.name);
    }


	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
	
}
