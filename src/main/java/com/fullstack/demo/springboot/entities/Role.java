package com.fullstack.demo.springboot.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "Roles")
public class Role implements Serializable {
    @Id
    private String id;
    private String rolename;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getRolename(){
        return rolename;
    }
    public void setRolename(String rolename){
        this.rolename = rolename;
    }
}
