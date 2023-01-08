package com.qa.dfemytunes.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.dfemytunes.entities.Artist;

public interface ArtistRepo extends JpaRepository<Artist, Long> {

}
