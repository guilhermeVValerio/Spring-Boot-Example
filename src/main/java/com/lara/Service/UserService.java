package com.lara.Service;

import com.lara.Entity.Application;
import com.lara.Entity.NormalUser;
import com.lara.Repository.NormalUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    NormalUserRepo normalUserRepo;
    public Collection<NormalUser> getAllusers(){
        return this.normalUserRepo.getAllusers();
    }
    public NormalUser getUserById(int id){
        return this.normalUserRepo.getUserById(id);
    }
    public NormalUser createApp(int id, String appname){
        return this.normalUserRepo.createApp(id,appname);
    }
    public void removeUserbyId(int id){
        this.normalUserRepo.removeUserbyId(id);
    }
}
