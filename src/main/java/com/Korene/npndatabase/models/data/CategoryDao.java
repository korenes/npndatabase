package com.Korene.npndatabase.models.data;

import com.Korene.npndatabase.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends CrudRepository<Category, Integer> {

}
