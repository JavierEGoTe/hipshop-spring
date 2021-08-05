package hipshop.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hipshop.models.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member,Long>{
	public abstract ArrayList<Member> findByFirstName(String firstName);
}
