package com.kirill.services.impl;

import com.kirill.dao.ContactDao;
import com.kirill.entity.MappedContact;
import com.kirill.model.Contact;
import com.kirill.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    @Transactional
    public void addContact(Contact contact) {
        MappedContact mappedContact = new MappedContact();
        mappedContact.setName(contact.getName());
        mappedContact.setPhone(contact.getPhone());
        mappedContact.setEmail(contact.getEmail());
        System.out.println(mappedContact);
        contactDao.save(mappedContact);
    }

    @Override
    public void deleteContact(Contact contact) {

    }

    @Override
    public void clearAll() {

    }

    @Override
    @Transactional(readOnly = true)
    public List<Contact> getAllContacts() {
        List<MappedContact> mappedContacts = contactDao.findAll();
        List<Contact> contacts = new ArrayList<Contact>(mappedContacts.size());
        for (MappedContact mappedContact : mappedContacts) {
            Contact contact = new Contact();
            contact.setName(mappedContact.getName());
            contact.setPhone(mappedContact.getPhone());
            contact.setEmail(mappedContact.getEmail());
            contacts.add(contact);
        }
        return contacts;
    }

    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }
}
