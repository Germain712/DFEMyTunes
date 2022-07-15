package com.qa.dfemytunes.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dfemytunes.entities.Artist;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, Long> {

}
