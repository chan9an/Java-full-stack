package com.ms.user_ms;

import java.util.ArrayList;
import java.util.List;


public class User {
    private Long usrId;
    private String name;
    private String phone;
    private List<Contact> contacts;

   
    public User(Long usrId, String name, String phone) {
        this.usrId = usrId;
        this.name = name;
        this.phone = phone;
        this.contacts = new ArrayList<>(); 
    }

    
    public User(Long usrId, String name, String phone, List<Contact> contacts) {
        this.usrId = usrId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts != null ? contacts : new ArrayList<>(); 
    }

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts != null ? contacts : new ArrayList<>(); 
    }
}
