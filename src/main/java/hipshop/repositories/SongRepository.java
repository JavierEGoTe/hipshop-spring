package hipshop.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import hipshop.models.Song;
import hipshop.models.Vendor;

public interface SongRepository extends CrudRepository<Song, Long> {

	public abstract ArrayList<Song> findByName(String songName);
}
