package com.campos.lucas.catalogo_.services;

import com.campos.lucas.catalogo_.enitities.Category;
import com.campos.lucas.catalogo_.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateforyService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> finddAll(){
        return repository.findAll();
    }

}
