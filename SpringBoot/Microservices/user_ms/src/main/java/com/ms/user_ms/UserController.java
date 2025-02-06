package com.ms.user_ms;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final RestTemplate restTemplate;

    public UserController(UserService userService, RestTemplate restTemplate) {
        this.userService = userService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        
        if (user == null) {
            throw new RuntimeException("User not found with ID: " + id);
        }

       
        String contactServiceUrl = "http://ContactService/contacts/user/" + id;

        
        ResponseEntity<List<Contact>> response = restTemplate.exchange(
                contactServiceUrl,
                org.springframework.http.HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Contact>>() {}
        );

        List<Contact> contacts = response.getBody();
        user.setContacts(contacts);

        return user;
    }
}
