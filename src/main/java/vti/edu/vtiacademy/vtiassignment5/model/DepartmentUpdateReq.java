package vti.edu.vtiacademy.vtiassignment5.model;

public class DepartmentUpdateReq {
    private String name;
    private  String description;

    public DepartmentUpdateReq(){
    }
    public DepartmentUpdateReq(String name, String description){
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;

    }
}
