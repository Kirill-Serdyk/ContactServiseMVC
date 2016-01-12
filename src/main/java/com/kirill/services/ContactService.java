package com.kirill.services;


import com.kirill.model.Contact;

import java.util.List;

public interface ContactService {
    void addContact(Contact contact);

    void deleteContact(Contact contact);

    void clearAll();

    List<Contact> getAllContacts();

}
