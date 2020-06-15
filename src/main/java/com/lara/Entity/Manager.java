package com.lara.Entity;

import java.util.ArrayList;

public class Manager extends User {
    private   NormalUser user;


    public NormalUser getUser() {
        return user;
    }

    public void setUser(NormalUser user) {
        this.user = user;
    }



    public Manager(int id, String name, String role) {
        super(id, name, role);
    }
}
