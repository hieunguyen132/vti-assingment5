package vti.edu.vtiacademy.vtiassignment5.service;

import vti.edu.vtiacademy.vtiassignment5.model.Department;
import vti.edu.vtiacademy.vtiassignment5.model.DepartmentUpdateReq;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll();
    Department getById(Integer id);
    Department create (Department department);
    Department update (Integer id, Department department);
    Department partialUpdate(Integer id, DepartmentUpdateReq departmentUpdate);
    void delete(Integer id);
}
