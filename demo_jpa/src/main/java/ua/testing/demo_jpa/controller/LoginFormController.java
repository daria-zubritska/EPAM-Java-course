package ua.testing.demo_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import ua.testing.demo_jpa.dto.UserDTO;
import ua.testing.demo_jpa.dto.UsersDTO;
import ua.testing.demo_jpa.entity.RoleType;
import ua.testing.demo_jpa.entity.User;
import ua.testing.demo_jpa.service.UserService;

@Slf4j
@RestController
@RequestMapping(value = "/")
public class LoginFormController {

    private final UserService userService;

    @Autowired
    public LoginFormController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public void loginFormController(UserDTO user){
    	
    }
    
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public @ResponseBody void regFormController(@RequestBody UserDTO user){
        userService.saveNewUser(User.builder().firstName(user.firstName).
        		lastName(user.lastName).email(user.email).role(RoleType.ROLE_USER).build());
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public UsersDTO getAllUser(){
    	UsersDTO u = userService.getAllUsers();
    	
        return u;
    }
}
