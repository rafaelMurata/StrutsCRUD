package br.com.rafaelmurata.service;

import java.util.List;

import br.com.rafaelmurata.persistence.DepartmentDao;
import br.com.rafaelmurata.persistence.DepartmentMemoryDao;

public class DepartmentDaoService implements DepartmentService {
    private DepartmentDao dao;

    public DepartmentDaoService() {
        this.dao = new DepartmentMemoryDao();
    }

    public List getAllDepartments() {
        return dao.getAllDepartments();
    }
}
