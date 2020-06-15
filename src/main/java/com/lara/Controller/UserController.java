package com.lara.Controller;

import com.lara.Entity.NormalUser;
import com.lara.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value="/users",method= RequestMethod.GET)
    public Collection<NormalUser> getAllUsers(){
        return this.userService.getAllusers();
    }
    @RequestMapping(value="/user",method = RequestMethod.GET)
    public NormalUser getUserById(@RequestParam int id){
        return this.userService.getUserById(id);
    }
    @RequestMapping(value="/user/createApp",method=RequestMethod.POST)
    public NormalUser CreateApp(@RequestParam int id,@RequestParam String name){
        return this.userService.createApp(id,name);
    }
    @RequestMapping(value="/user/delete",method= RequestMethod.DELETE)
    public String removeUserbyId(int id){
        this.userService.removeUserbyId(id);
        return " User is successfully removed ! ";
    }
}
