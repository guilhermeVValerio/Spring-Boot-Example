package com.lara.Repository;

import com.lara.Entity.Application;
import com.lara.Entity.NormalUser;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class NormalUserRepo {
    private static Map<Integer, NormalUser>  users;
    static {
        users = new HashMap<Integer, NormalUser>(){
            {
                put(1, new NormalUser(1,"sam","user"));
                put(2, new NormalUser(2,"Mary","user"));
            }
        };
    }
    public Collection<NormalUser> getAllusers(){
        return users.values();
    }
    public NormalUser getUserById(int id){
        Collection<NormalUser> user = users.values();
        for(NormalUser n : user){
            if(n.getId() == id) return n;
        }
        NormalUser notfound = new NormalUser(id,"notFound","notFound");
        return notfound;
    }
    public NormalUser createApp(int id,String name){
        Date d = new Date();
        d.getTime();
        NormalUser u = users.get(id);
        Application app = new Application(id,"application1",false);
        u.setApp(app);
        return u;
    }
    public void removeUserbyId(int id){
        this.users.remove(id);
    }
}
