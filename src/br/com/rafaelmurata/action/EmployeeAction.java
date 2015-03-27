package br.com.rafaelmurata.action;

import java.util.*;

import br.com.rafaelmurata.model.*;
import br.com.rafaelmurata.service.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * CRUD on struts
 * @author  Rafael Murata
 */
public class EmployeeAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private static EmployeeService empService = new EmployeeDaoService();
    private static DepartmentService deptService = new DepartmentDaoService();
    private Employee employee;
    private List<Employee> employees;
    private List<Department> departments;
   
	public String getAllEmployees(){
    	 employees = empService.getAllEmployees();
    	 return "success";
    }

	public String setUpForInsertOrUpdate(){
		prep();
		if (employee != null && employee.getEmployeeId() != null) {
			employee = empService.getEmployee(employee.getEmployeeId());
		}
		return "success";
	}
	
	
    public String insertOrUpdate(){
    	if(!validationSuccessful()){
    		return "input";
    	}else{
    		if (employee.getEmployeeId() == null) {
    			empService.insertEmployee(employee);
    		} else {
    			empService.updateEmployee(employee);
    		}
        	
    	}
    	return "success";
    }
    
    public String deleteEmployee(){
		empService.deleteEmployee(employee.getEmployeeId());
		return "success";
	}
    
    private void prep() {
		departments = deptService.getAllDepartments();
		Map session = ActionContext.getContext().getSession();
		session.put("departments", departments);
	}
    
   
	private boolean validationSuccessful(){
    	if(employee.getFirstName()==null||employee.getFirstName().trim().length()<1){
    		addActionMessage("FirstName cant be null");
    	}
    	if(employee.getLastName()==null||employee.getLastName().trim().length()<1){
    		addActionMessage("LastName cant be null");
    	}
    	if(employee.getAge()==null){
    		addActionMessage("Age cant be null");

    	}
    	if(this.hasActionMessages()){
    		return false;
    	}else{
    		return true;
    	}
    		
    	
    }

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
