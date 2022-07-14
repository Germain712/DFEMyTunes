package com.qa.dfemytunes.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfemytunes.entities.Artist;
import com.qa.dfemytunes.services.ArtistService;

@RestController
@RequestMapping("/artist")
public class ArtistController {
	
	private ArtistService service;
	
	
	
	public ArtistController(ArtistService service) {
		this.service = service;
}
	
	@GetMapping("/getAll")
	public List<Artist> readAll(){
		return this.service.readAll();
	}
	
	@GetMapping("readById/{id}")
	public Artist readById(@PathVariable long id) {
		return this.service.readById(id);
	}
	
	
	@PostMapping("/create")
	public Artist create(@RequestBody Artist artist) {
		return this.service.create(artist);
	}
	
	
	@PutMapping("/update/{id}")
	public Artist update(@PathVariable long id, @RequestBody Artist artist) {
		return this.service.update(id, artist);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable long id) {
		return this.service.delete(id);
		}

}