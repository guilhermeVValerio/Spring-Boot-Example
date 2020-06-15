package com.lara.Controller;

import com.lara.Entity.Manager;
import com.lara.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ManagerController{
    @Autowired
    ManagerService managerService;
    @RequestMapping(value = "/managers",method = RequestMethod.GET)
    public Collection<Manager> getAllManagers(){
        return this.managerService.getAllManagers();
    }
    @RequestMapping(value="/manager",method = RequestMethod.GET)
    public Manager getManagerById(@RequestParam int id){
        return this.managerService.getManagerById(id);
    }
    @RequestMapping(value="/manager/addUser",method=RequestMethod.POST)
    public Manager addUser(@RequestParam int id1,@RequestParam  int id2,@RequestParam String name){
        return this.managerService.addUser(id1,id2,name);
    }
    @RequestMapping(value = "/manager/accept",consumes = MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.PUT)
    public Manager acceptApp(@RequestBody Manager m){
        return this.managerService.acceptApp(m);
    }
    @RequestMapping(value = "/manager/reject",consumes = MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.PUT)
    public Manager rejectApp(@RequestBody Manager m){
        return this.managerService.rejectApp(m);
    }
    @RequestMapping(value="/manager/delete",method= RequestMethod.DELETE)
    public String removeManagerbyId(int id){
        this.managerService.removeManagerbyId(id);
        return " Manager is successfully removed ! ";
    }
}