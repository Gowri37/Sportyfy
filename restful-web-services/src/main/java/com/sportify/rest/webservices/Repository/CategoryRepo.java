package com.sportify.rest.webservices.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sportify.rest.webservices.model.Category;



public interface CategoryRepo  extends JpaRepository<Category, Long> {

}