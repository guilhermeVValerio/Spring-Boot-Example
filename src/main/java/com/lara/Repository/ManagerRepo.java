package com.lara.Repository;

import com.lara.Entity.Application;
import com.lara.Entity.Manager;
import com.lara.Entity.NormalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ManagerRepo {
    private static Map<Integer, Manager> managers;
    static {
        managers = new HashMap<Integer, Manager>(){
            {
                put(1, new Manager(1,"lara","manager"));
            }
        };
    }
    public Collection<Manager> getAllManagers(){
        return this.managers.values();
    }
    public Manager getManagerById(int id){
        return this.managers.get(id);
    }

    public Manager addUser ( int managerid, int userid,String name){
        Manager m = this.getManagerById(managerid);
        NormalUser normalUser = new NormalUser(userid,name,"user");
       m.setUser(normalUser);
        return m;
    }
   public Manager acceptApp(Manager m){
        Manager manager = managers.get(m.getId());
        NormalUser user = m.getUser();
        Application app = user.getApp();
        app.setStatus(true);
        user.setApp(app);
        manager.setUser(user);
        return manager;
    }
    public Manager rejectApp(Manager m){
        Manager manager = managers.get(m.getId());
        NormalUser user = m.getUser();
        Application app = user.getApp();
        app.setStatus(false);
        user.setApp(app);
        manager.setUser(user);
        return manager;
    }
    public void removeManagerbyId(int id)
    {
        this.managers.remove(id);
    }
}
