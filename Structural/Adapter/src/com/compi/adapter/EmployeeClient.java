package com.compi.adapter;

import com.compi.adapter.adapter.EmployeeCSVAdapter;
import com.compi.adapter.adapter.EmployeeLegacyAdapter;
import com.compi.adapter.model.Employee;
import com.compi.adapter.model.EmployeeCSV;
import com.compi.adapter.model.EmployeeDB;
import com.compi.adapter.model.EmployeeLegacy;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDB("123", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDb);

        EmployeeLegacy employeeLegacy = new EmployeeLegacy("chewie", "Han", "Solo", "han@solo.com");
        employees.add(new EmployeeLegacyAdapter(employeeLegacy));

        EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeCSVAdapter(employeeCSV));

        return employees;
    }
}
