package com.fullstack.demo.springboot.services;

import com.fullstack.demo.springboot.entities.Role;
import com.fullstack.demo.springboot.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public Role createRole(Role role){
        return roleRepository.save(role);
    }

    public Role getRoleById(String id) {
        return roleRepository.findById(id).orElse(null);
    }
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }
    public Role updateRole(Role role){
        return roleRepository.save(role);
    }

    public void deleteRole(String id){
        roleRepository.deleteById(id);
    }
}
