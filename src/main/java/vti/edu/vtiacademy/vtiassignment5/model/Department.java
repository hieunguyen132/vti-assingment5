package vti.edu.vtiacademy.vtiassignment5.model;

import java.util.Set;

public class Department {
    private int id;
    private String name;
    private String description;
    private Set<Address> addresses;


    public String getFullname() {
        return name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Department(){

    }
    public Department(int id, String name){
        setId(id);
        setName(name);
    }
    public Department(String name) {setName(name);}
    public int getId(){return id;}
    public void setId(int id){
        if (id<0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }
        this.id=id;

    }
    public String getName(){return name;}
    public void  setName(String name){
        if (name== null||"".equals(name.trim())) {
            throw new IllegalArgumentException("Name must not be emty");
        }
        this.name=name;
        }

    public Set<Address> getAddresses() { return addresses;
    }

    public void setAddresses(Set<Address> addresses) { this.addresses = addresses;
    }
}

