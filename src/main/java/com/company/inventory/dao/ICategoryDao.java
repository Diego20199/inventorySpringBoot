package com.company.inventory.dao;

import com.company.inventory.model.Category;
import org.springframework.data.repository.CrudRepository;

/**con esta clase podemos acceder a todo los metodos del crud**/
public interface ICategoryDao extends CrudRepository<Category, Long> {
}
