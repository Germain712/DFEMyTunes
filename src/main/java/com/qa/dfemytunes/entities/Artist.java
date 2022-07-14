package com.qa.dfemytunes.entities;

import java.util.Objects;

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





	@Override
		public int hashCode() {
			return Objects.hash(album, artistName, genre, id, title);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Artist other = (Artist) obj;
			return Objects.equals(album, other.album) && Objects.equals(artistName, other.artistName)
					&& Objects.equals(genre, other.genre) && id == other.id && Objects.equals(title, other.title);
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
