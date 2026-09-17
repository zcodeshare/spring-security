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

    @GetMapping("/p1")
    public String publicEndPoint() {
        return "This is public-1 endpoint";
    }

    @GetMapping("/p2")
    public String p2(){
        return "This is public-2 endpoint";
    }

    @GetMapping("/p3")
    public String p3(){
        return "This is public-3 endpoint";
    }

    @GetMapping("/p4")
    public String p4(){
        return "This is public-4 endpoint";
    }

    @GetMapping("/p5")
    public String p5(){
        return "This is public-5 endpoint";
    }

    @GetMapping("/u1")
    public String u1() {
        return userService.getUser1();
    }

    @GetMapping("/u2")
    public String u2(){
        return userService.getUser2();
    }

    @GetMapping("u3")
    public String u3(){
        return userService.getUser3();
    }

    @GetMapping("/u4")
    public String u4(){
        return userService.getUser4();
    }

    @GetMapping("/u5")
    public String u5(){
        return userService.getUser5();
    }
}
