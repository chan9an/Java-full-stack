package com.ms.user_ms;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private List<User> userList = Arrays.asList(
            new User(1L, "ABC", "9876543210"),
            new User(2L, "BCD", "9123456789"),
            new User(3L, "CDE", "9123456789"),
            new User(4L, "DEF", "9123456789"),
            new User(5L, "EFG", "9123456789")
    );

    public User getUserById(Long id) {
        return userList.stream()
                .filter(user -> user.getUsrId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
