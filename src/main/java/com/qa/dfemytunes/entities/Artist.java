package com.qa.dfemytunes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String artistName;
	
	private String album;
	
	private String genre;
	
	
	public Artist() {}
	

	public Artist(String title, String artistName, String album, String genre) {
		super();
		this.title = title;
		this.artistName = artistName;
		this.album = album;
		this.genre = genre;
	}
		
		
		public Artist(long id, String title, String artistName, String album, String genre) {
			super();
			this.id = id;
			this.title = title;
			this.artistName = artistName;
			this.album = album;
			this.genre = genre;
		
		
	}





	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
