package pl.com.redbeardsoftware.shoplj.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.redbeardsoftware.shoplj.models.User;
import pl.com.redbeardsoftware.shoplj.services.UserService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    @Autowired
    private final UserService usersService;

    //Read
    @GetMapping
    public List<User> getUsers() {
       return usersService.getUsers();
    }

    //Create
    @PostMapping
    public void registerNewUser(@RequestBody final User user) {
        usersService.addNewUser(user);
    }


}
