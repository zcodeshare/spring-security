package in.in2it.cats.springsecurity.controller;

import in.in2it.cats.springsecurity.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/public")
    public String publicEndPoint() {
        return "This is public endpoint";
    }

    @GetMapping("/user")
    public String userEndPoint() {
        return userService.getUser();
    }
}
