package hipshop.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hipshop.models.Album;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {

	public abstract ArrayList<Album> findByproductNameContaining(String productName);

}
