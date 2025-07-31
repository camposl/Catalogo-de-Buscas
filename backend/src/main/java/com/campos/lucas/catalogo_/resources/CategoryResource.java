package com.campos.lucas.catalogo_.resources;

import com.campos.lucas.catalogo_.services.CateforyService;
import com.campos.lucas.catalogo_.enitities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CateforyService service;

    @GetMapping
    public ResponseEntity<List<Category>> findall() {
        List<Category> list = service.finddAll();
        return ResponseEntity.ok().body(list);
    }

}
