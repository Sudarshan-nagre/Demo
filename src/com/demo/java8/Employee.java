package com.demo.java8;

public class Employee {
	private int empNo;
	private String empName;
	private String empAdd;
	public Employee(int empNo, String empName, String empAdd) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAdd = empAdd;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
}
