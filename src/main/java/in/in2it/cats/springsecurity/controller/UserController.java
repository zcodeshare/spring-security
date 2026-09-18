package in.in2it.cats.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final AuthenticationManager authenticationManager;

    public UserController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @GetMapping("/public")
    public String publicEndPoint() {
        return "This is public endpoint";
    }

    @GetMapping("/user")
    public String user(){
        return "Hi, I am John, and I work as a software developer.";
    }

    @GetMapping("/user-method")
    @PreAuthorize("hasRole('USER')")
    public String userMethod() {
        return "User method area";
    }

    @GetMapping("/admin-only")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminOnly(){
        return "Admin method area";
    }

    @GetMapping("/current-user")
    public String currentUser(){

        Authentication authentication = SecurityContextHolder
                .getContext()
                .getAuthentication();

        return "Username : " + authentication.getName()
                + ", Authorities : " + authentication.getAuthorities();
    }

    @GetMapping("/profile")
    public String profile() {

        Authentication authentication =
                SecurityContextHolder
                        .getContext()
                        .getAuthentication();

        return "Welcome " + authentication.getName();
    }

    @GetMapping("/test-authentication")
    public String testAuthentication() {

        Authentication authentication =
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                "john",
                                "john123"
                        )
                );

        return "Authenticated user: " + authentication.getName();
    }

}
