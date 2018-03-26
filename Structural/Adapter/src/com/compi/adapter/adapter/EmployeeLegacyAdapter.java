package com.compi.adapter.adapter;

import com.compi.adapter.model.Employee;
import com.compi.adapter.model.EmployeeLegacy;

public class EmployeeLegacyAdapter implements Employee {

    private EmployeeLegacy instance;

    public EmployeeLegacyAdapter(EmployeeLegacy instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
