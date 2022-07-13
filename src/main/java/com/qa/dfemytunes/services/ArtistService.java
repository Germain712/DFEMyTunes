package com.qa.dfemytunes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfemytunes.entities.Artist;

@Service
public class ArtistService {
	
	public List<Artist> readAll(){
		return this.service.readAll();
	}
	
	public Artist readById(long id) {
		return this.service.readById(id);
	}
	
	
	public Artist create(Artist artist) {
		return this.service.create(artist);
	}
	
	public Artist update(long id, Artist artist) {
		return this.service.update(id, artist);
	}
	
	public boolean delete(long id) {
		return this.service.delete(id);

		}

}