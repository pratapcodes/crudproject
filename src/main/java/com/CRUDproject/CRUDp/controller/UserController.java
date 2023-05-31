package com.CRUDproject.CRUDp.controller;

import com.CRUDproject.CRUDp.entity.Users;
import com.CRUDproject.CRUDp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/allUsers")
public ResponseEntity<List<Users>>getAllUsers(){
    List<Users> users =null;
    try {
        users=userService.getAllUsers();
    }
    catch (Exception ex){
        ex.getMessage();
    }
    return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
}
/*Here i just change .I dont know sa as.*/

    @GetMapping("/getById/{id}")
    public ResponseEntity <Users> getUserById(@PathVariable("id")int userId){
        Users users = null;
        try{
            users = userService.getUserById(userId);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Users>(users,HttpStatus.OK);
    }
    @RequestMapping("/addOrUpdate")
    public ResponseEntity<Users> addOrUpdateUser(@RequestBody Users user){
        Users users = null;
        try{
            users = userService.addOrUpdateUser(user);
        }
        catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Users>(users, HttpStatus.OK);
    }

    /* I am merging main to saas, will it work?   */

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<Users> addOrUpdateUser(@PathVariable ("id") int userId){
        Users users = null;
        try{
            users = userService.deleteUser(userId);
        }
        catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Users>(users, HttpStatus.OK);
    }
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<Users> addOrUpdateUsers(@PathVariable ("id") int userId){
        Users users = null;
        try{
            users = userService.deleteUser(userId);
        }
        catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Users>(users, HttpStatus.OK);
    }


    
}
