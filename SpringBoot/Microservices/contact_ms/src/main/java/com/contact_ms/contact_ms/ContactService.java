package com.contact_ms.contact_ms;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private List<Contact> contactList = Arrays.asList(
            new Contact(1L, "john.doe@example.com", "John Doe", 1L),
            new Contact(2L, "jane.doe@example.com", "Jane Doe", 2L)
    );

    public Contact getContactById(Long id) {
        return contactList.stream()
                .filter(contact -> contact.getCid().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Contact> getContactsByUserId(Long userId) {
        return contactList.stream()
                .filter(contact -> contact.getUserId().equals(userId))
                .toList();
    }

}