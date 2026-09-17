package in.in2it.cats.springsecurity.service.impl;

import in.in2it.cats.springsecurity.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUser1() {
        return "Hello from User-1";
    }

    @Override
    public String getUser2() {
        return "Hello from User-2";
    }

    @Override
    public String getUser3() {
        return "Hello from User-3";
    }

    @Override
    public String getUser4() {
        return "Hello from User-4";
    }

    @Override
    public String getUser5() {
        return "Hello from User-5";
    }
}
