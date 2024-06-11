package com.example.frontend;

import com.example.frontend.SharedDataTypes.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontEndController {


    //This request is sent from the database, the database will request
    //using the link: "http://localhost:8001/getUser
    //and the User Object is sent in the variables
    //use @RequestBody for object, and @RequestParam for variables

    @PostMapping("/getUser")
    public void getUser(@RequestBody User user){
        FrontEndApplication.loggedIn = user;
    }

}
