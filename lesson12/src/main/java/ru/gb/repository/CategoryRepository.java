package ru.gb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gb.entity.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
