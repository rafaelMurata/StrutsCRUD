package br.com.rafaelmurata.persistence;

import java.util.List;
import java.util.Map;

public interface DepartmentDao {
	
    public List getAllDepartments();
    
    public Map getDepartmentsMap();
}
