package com.lara.Entity;

public class NormalUser extends User {
    private Application app;

    public Application getApp() {
        return app;
    }

    public void setApp(Application app) {
        this.app = app;
    }

    public NormalUser(int id, String name, String role) {
        super(id, name, role);
    }
}
