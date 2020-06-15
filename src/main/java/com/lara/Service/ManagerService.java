package com.lara.Service;

import com.lara.Entity.Manager;
import com.lara.Repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ManagerService {
    @Autowired
    ManagerRepo managerRepo;
    public Collection<Manager> getAllManagers(){
        return this.managerRepo.getAllManagers();
    }
    public Manager getManagerById(int id){
        return this.managerRepo.getManagerById(id);
    }
    public Manager addUser(int id1,int id2,String name){
        return this.managerRepo.addUser(id1,id2,name);
    }
    public Manager acceptApp(Manager m){
        return this.managerRepo.acceptApp(m);
    }
    public Manager rejectApp(Manager m){
        return this.managerRepo.rejectApp(m);
    }
    public void removeManagerbyId(int id){
        this.managerRepo.removeManagerbyId(id);
    }
}
