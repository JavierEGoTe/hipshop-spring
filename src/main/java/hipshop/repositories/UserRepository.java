package hipshop.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hipshop.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	public abstract ArrayList<User> findByName(String findFirstName);
}
