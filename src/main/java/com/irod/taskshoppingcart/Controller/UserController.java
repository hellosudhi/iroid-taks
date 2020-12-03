package com.irod.taskshoppingcart.Controller;

import com.irod.taskshoppingcart.Model.User;
import com.irod.taskshoppingcart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("api/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User Loggin(@RequestBody User user) {

        return userService.Login(user.getUsername(), user.getPassword());
    }
    @GetMapping("/session")
    @ResponseBody
    public String session(HttpSession session){
        @SuppressWarnings("unchecked")
        String messages = (String) session.getAttribute("LOGGED__USER");
        if (messages == null) {
           return " NEW";
        }else{
            return messages;
        }

    }
    @PostMapping("/session/{user}")
    @ResponseBody
    public ResponseEntity<String> sessionAdd(@PathVariable("user") String user, HttpSession request)
    {
        request.setAttribute("LOGGED__USER",user);
        return new ResponseEntity<>("succes",HttpStatus.OK);
    }
    @PostMapping("/session/destroy")
    public ResponseEntity<String> destroySession(HttpServletRequest request) {
        request.getSession().invalidate();
        return new ResponseEntity<String>("removed",HttpStatus.OK);
    }

}
