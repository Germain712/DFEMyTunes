package com.qa.dfemytunes.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.dfemytunes.entities.Artist;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:testschema.sql",
		"classpath:testdata.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class ArtistControllerTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;

	@Test
	public void createTest() throws Exception {

		Artist entry = new Artist("Vogue", "Madonna", "The Immaculate Collection", "Pop");
		String entryAsJSON = mapper.writeValueAsString(entry);

		Artist result = new Artist("Vogue", "Madonna", "The Immaculate Collection", "Pop");
		String resultAsJSON = mapper.writeValueAsString(result);

		mvc.perform(post("/artist/create").contentType(MediaType.APPLICATION_JSON).contentType(entryAsJSON))
				.andExpect(content().json(resultAsJSON));

	}

	@Test
	public void readAllTest() throws Exception {

		List<Artist> output = new ArrayList<>();
		Artist entry = new Artist(1L, "Vogue", "Madonna", "The Immaculate Collection", "Pop");
		output.add(entry);

		String outputAsJSON = mapper.writeValueAsString(output);

		mvc.perform(get("/artist/readAll").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(outputAsJSON));

	}

	@Test
	public void readByIdTest() throws Exception {

		Artist entry = new Artist("Vogue", "Madonna", "The Immaculate Collection", "Pop");
		String entryAsJSON = this.mapper.writeValueAsString(entry);

		mvc.perform(get("/artist/readById").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(entryAsJSON));

	}

	@Test
	public void updateTest() throws Exception {

		Artist entry = new Artist("Vogue", "Madonna", "The Immaculate Collection", "Pop");
		String entryAsJSON = this.mapper.writeValueAsString(entry);

		Artist result = new Artist("Vogue", "Madonna", "The Immaculate Collection", "Pop");
		mvc.perform(put("/artist/update/1").contentType(MediaType.APPLICATION_JSON).content(entryAsJSON))
				.andExpect(content().json(entryAsJSON));

	}

	@Test
	public void deleteTest() throws Exception {
		mvc.perform(delete("/artist/delete/1").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().string("true"));
	}

}
