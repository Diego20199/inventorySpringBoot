package com.company.inventory.service;

import com.company.inventory.response.CategoryResponseRest;
import org.springframework.http.ResponseEntity;

public interface ICategoryService {
    public ResponseEntity<CategoryResponseRest> search();//ResponseEntity es un estructura http para dar el formato
}
