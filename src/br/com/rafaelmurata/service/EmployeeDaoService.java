package br.com.rafaelmurata.service;

import java.util.List;

import br.com.rafaelmurata.model.Employee;
import br.com.rafaelmurata.persistence.EmployeeDao;
import br.com.rafaelmurata.persistence.EmployeeMemoryDao;

public class EmployeeDaoService implements EmployeeService {
    private EmployeeDao dao;

    public EmployeeDaoService() {
        this.dao = new EmployeeMemoryDao();
    }

    public List getAllEmployees() {
        return dao.getAllEmployees();
    }

    public void updateEmployee(Employee emp) {
        dao.update(emp);
    }

    public void deleteEmployee(Integer id) {
        dao.delete(id);
    }

    public Employee getEmployee(Integer id) {
        return dao.getEmployee(id);
    }

    public void insertEmployee(Employee emp) {
        dao.insert(emp);
    }
}
