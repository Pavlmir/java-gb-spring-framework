package ru.gb.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gb.persist.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}