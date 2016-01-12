package com.kirill.dao;


import com.kirill.entity.MappedContact;

import java.util.List;

public interface ContactDao {

    void save(MappedContact contact);

    List<MappedContact> findAll();

}
