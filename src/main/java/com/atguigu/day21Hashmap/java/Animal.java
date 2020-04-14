package com.atguigu.day21Hashmap.java;

public class Animal {

	String name;

	public Animal(String name) {
		super();
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
            return other.name == null;
		} else return name.equals(other.name);
    }


	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
	
}
