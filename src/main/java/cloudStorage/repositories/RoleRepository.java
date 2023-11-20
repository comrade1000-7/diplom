package cloudStorage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import cloudStorage.entities.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
