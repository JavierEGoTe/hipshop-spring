package hipshop.services;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hipshop.models.Album;
import hipshop.models.Song;
import hipshop.repositories.SongRepository;


@Service

public class SongService {

	@Autowired
	SongRepository songRepository;
	
	public ArrayList<Song> getUsers() {
		return (ArrayList<Song>) songRepository.findAll();
	}
	
	public Song saveSong(Song song) {
		String songName = song.getSongName();
		Album album= song.getAlbum();
		Integer songNumber = song.getSongNumber();
		String duration = song.getDuration();
		String path = song.getPath();
		
		
		if(songNumber != null ) {
			return songRepository.save(song);
		}
		
		return song;
	}
	
	public Optional<Song> getUserById(Long id) {
		return songRepository.findById(id);
	}
	
	
	public boolean deleteSong(Long id) {
		
		
		try {
			songRepository.deleteById(id); 
			return true;
		}catch(Exception error) { 
			return false;
		}
	}
	public ArrayList<Song> getUsersBySongName(String songName){
		return songRepository.findByName(songName);
	}
}
