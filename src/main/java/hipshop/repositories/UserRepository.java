package hipshop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hipshop.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long>{
	
}
