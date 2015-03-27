package br.com.rafaelmurata.persistence;

import java.util.*;

import br.com.rafaelmurata.model.Department;

public class DepartmentMemoryDao implements DepartmentDao {
	
	private static List<Department> departments;
    private static Map<Integer, Department> departmentsMap;
    static {
        departments = new ArrayList<Department>();
        departments.add(new Department( new Integer(1), "Accounting" ));
        departments.add(new Department( new Integer(2), "Developer"));
        departments.add(new Department( new Integer(3), "Sales" ));
        departmentsMap = new HashMap<Integer, Department>();
        Iterator<Department> iter = departments.iterator();
        while( iter.hasNext() ) {
            Department dept = iter.next();
            departmentsMap.put(dept.getDepartmentId(), dept );
        }

     }
    public List<Department> getAllDepartments() {
        return departments;
    }
    public Map<Integer, Department> getDepartmentsMap() {
        return departmentsMap;
    }
}
