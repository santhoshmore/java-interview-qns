package com.rafi_programs;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private Integer empId;
	private String empName;
	public Employee() {}
	
	/*public static final Comparator<Employee> empIdComparator = new Comparator<Employee>() {
		public int compare(Employee emp1, Employee emp2){
			return emp1.empId - emp2.empId;
		}
	};
	
	public static final Comparator<Employee> nameComparator = new Comparator<Employee>(){
		public int compare(Employee emp1, Employee emp2){
			return emp1.empName.compareTo(emp2.empName);
		}
	};*/
	
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public int compareTo(Employee arg0) {
		
		//return arg0.getEmpId().compareTo(this.getEmpId()) ;
		return this.getEmpId().compareTo(arg0.getEmpId()) ;
	}
}