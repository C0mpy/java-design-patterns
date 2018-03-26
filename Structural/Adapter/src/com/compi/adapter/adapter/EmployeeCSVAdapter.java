package com.compi.adapter.adapter;

import com.compi.adapter.model.Employee;
import com.compi.adapter.model.EmployeeCSV;

public class EmployeeCSVAdapter implements Employee {

    private EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
