package com.campos.lucas.catalogo_.repositories;

import com.campos.lucas.catalogo_.enitities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
