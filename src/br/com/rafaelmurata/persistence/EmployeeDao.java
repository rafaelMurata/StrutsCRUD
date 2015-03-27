package br.com.rafaelmurata.persistence;

import java.util.List;

import br.com.rafaelmurata.model.Employee;

public interface EmployeeDao {
	
    public List getAllEmployees();
    
    public Employee getEmployee(Integer id);
    
    public void update(Employee emp);
    
    public void insert(Employee emp);
    
    public void delete(Integer id);
}
