package br.com.rafaelmurata.service;

import java.util.List;

import br.com.rafaelmurata.model.Employee;

public interface EmployeeService {
	
    public List getAllEmployees();
    
    public void updateEmployee(Employee emp);
    
    public void deleteEmployee(Integer id);
    
    public Employee getEmployee(Integer id);
    
    public void insertEmployee(Employee emp);
}
