package vti.edu.vtiacademy.vtiassignment5.controller.v2;

import org.springframework.web.bind.annotation.*;
import vti.edu.vtiacademy.vtiassignment5.model.Address;
import vti.edu.vtiacademy.vtiassignment5.model.Department;
import vti.edu.vtiacademy.vtiassignment5.model.DepartmentUpdateReq;
import vti.edu.vtiacademy.vtiassignment5.service.DepartmentService;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v2/department")
public class DepartmentController{
    DepartmentService service;

    public DepartmentController(DepartmentService service){this.service=service;}

    @GetMapping
    public List<Department> getAll(){return service.getAll();}
    @GetMapping("{id}")
    public Department getById(@PathVariable("id") Integer id){return service.getById(id);}
    @GetMapping("{id}/address")
    public Set<Address> getAddressById(@PathVariable("id") Integer id){
        var department=service.getById(id);
        if (department==null){
            return Collections.emptySet();
        }
        return  department.getAddresses();
    }
    @PostMapping
    public Department create(@RequestBody Department department){return service.create(department);}
    @PostMapping
    public Department update(@PathVariable("id") Integer id, @RequestBody Department department){return service.update(id,department);}
    @PatchMapping({"id"})
    public Department partialUpdate(@PathVariable("id")Integer id, @RequestBody DepartmentUpdateReq department){
        return service.partialUpdate(id,department);
    }
    @DeleteMapping({"id"})
    public void delete(@PathVariable("id") Integer id){service.delete(id);}
}

