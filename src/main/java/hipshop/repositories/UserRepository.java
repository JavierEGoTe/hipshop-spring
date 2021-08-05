package hipshop.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hipshop.models.Member;

@Repository
public interface UserRepository extends CrudRepository<Member,Long>{
	
}
