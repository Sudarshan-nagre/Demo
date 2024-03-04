package com.demo.collection;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int rollNO;
	private String name;
	private String add;

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public Student(int rollNO, String name, String add) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "\nStudent [rollNO=" + rollNO + ", name=" + name + ", add=" + add + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(add, name, rollNO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(add, other.add) && Objects.equals(name, other.name) && rollNO == other.rollNO;
	}

	@Override
	public int compareTo(Student st) {

		if (this.rollNO > st.rollNO)
			return 1;
		else if (this.rollNO < st.rollNO)
			return -1;
		else
			return 0;

		// return this.name.compareTo(st.name);
	}
}
