package com.kirill.dao.impl;


import com.kirill.dao.ContactDao;
import com.kirill.entity.MappedContact;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ContactDaoImpl implements ContactDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void save(MappedContact contact) {
        em.persist(contact);
    }

    @Override
    public List<MappedContact> findAll() {
        return em.createQuery("SELECT mappedContact FROM MappedContact mappedContact").getResultList();
    }
}