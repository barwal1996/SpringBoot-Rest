package com.niit.myblog.model;

import java.util.*;

public class Employees {
private List<Employee> employeeList;

public List<Employee> getEmployeeList() {
if(employeeList == null) {
employeeList = new ArrayList<>();
}
return employeeList;
}

public void setEmployeeList(List<Employee> employeeList) {
this.employeeList=employeeList;
}

}


