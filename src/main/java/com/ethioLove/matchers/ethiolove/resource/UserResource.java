package com.ethioLove.matchers.ethiolove.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ethioLove.matchers.ethiolove.models.User;
import com.ethioLove.matchers.ethiolove.repository.UserRepository;
import java.util.List;

@RestController
@RequestMapping(value="/rest/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserResource {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(value="/all")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    @PostMapping(value="/add")
    public void addUser(@RequestBody final User user){
     User userByName=userRepository.findByEmailAndlName(user.getEmail(),user.getLName());
        if(userByName==null){
            userRepository.save(user);
        }

    }
    @PostMapping(value="/login")
    public User getUser(@RequestBody final User user){
     return userRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
    }


}
