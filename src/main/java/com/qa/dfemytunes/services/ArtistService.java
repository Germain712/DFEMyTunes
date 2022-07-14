package com.qa.dfemytunes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfemytunes.entities.Artist;
import com.qa.dfemytunes.repos.ArtistRepo;
import org.springframework.*;
import org.springframework.stereotype.Service;
import com.qa.dfemytunes.entities.Artist;
import com.qa.dfemytunes.repos.ArtistRepo;

@Service
public class ArtistService {

	private ArtistRepo repo;

	public ArtistService(ArtistRepo repo) {
		this.repo = repo;
	}

	public List<Artist> readAll() {
		return this.repo.findAll();
	}

	public Artist readById(long id) {
		return this.repo.findById(id).get();
	}

	public Artist create(Artist artist) {
		return this.repo.saveAndFlush(artist);
	}

	public Artist update(long id, Artist artist) {

		Artist existing = this.repo.findById(id).get();

		existing.setTitle(artist.getTitle());
		existing.setArtistName(artist.getArtistName());
		existing.setAlbum(artist.getAlbum());
		existing.setGenre(artist.getGenre());

		return this.repo.saveAndFlush(existing);
	}

	public boolean delete(long id) {
		this.repo.deleteById(id);

		return !this.repo.existsById(id);
	}

}