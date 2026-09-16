package in.in2it.cats.springsecurity.service.impl;

import in.in2it.cats.springsecurity.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "Hello from User";
    }
}
