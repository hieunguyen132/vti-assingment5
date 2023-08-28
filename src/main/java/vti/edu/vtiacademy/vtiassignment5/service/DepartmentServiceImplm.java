package vti.edu.vtiacademy.vtiassignment5.service;

import org.springframework.stereotype.Service;
import vti.edu.vtiacademy.vtiassignment5.model.Department;
import vti.edu.vtiacademy.vtiassignment5.model.DepartmentUpdateReq;
import vti.edu.vtiacademy.vtiassignment5.repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentServiceImplm implements DepartmentService {
    DepartmentRepository repository;

    public DepartmentServiceImplm(DepartmentRepository repository){
        this.repository=repository;
    }
    @Override
    public List<Department> getAll (){return repository.getAll();}
    @Override
    public Department getById(Integer id){
        var department = repository.getById(id);
        if (department==null){
            throw new RuntimeException("Department not found");
        }
        return department;
    }
    @Override
    public Department create(Department department){return repository.create(department);}
    @Override
    public Department update(Integer id, Department department){
        var departmentInDb= repository.getById(id);
        if (department.getName()!=null){
            departmentInDb.setName(department.getName());
        }
        if (department.getDescription()!=null){
            departmentInDb.setDescription(department.getDescription());
        }
        return repository.create(departmentInDb);
    }

    @Override
    public Department partialUpdate(Integer id, DepartmentUpdateReq departmentUpdate) {
        return null;
    }

    @Override
    public void delete(Integer id){repository.delete(id);}
}
