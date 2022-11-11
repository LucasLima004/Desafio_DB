package com.db.lucasLima.testProjectAdmission;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.xml.sax.SAXException;

import com.db.lucasLima.testProjectAdmission.Controller.InteractiveController;
import com.db.lucasLima.testProjectAdmission.Model.ArchiveModel;
import com.db.lucasLima.testProjectAdmission.Model.xml;
import com.db.lucasLima.testProjectAdmission.Repository.Repository;

import io.restassured.http.ContentType;


//Identifica o contexto web, para realizar requisição http.
@WebMvcTest
class InteractiveControllerTest {
	
	@Autowired
	private InteractiveController controller;
	//Não injeta o objeto real.
	@MockBean
	private Repository repository;
	
	
	//Realiza antes de cada teste as configurações.
	@BeforeEach
	public void setup() {
		standaloneSetup(this.controller);
	}
	
	@Test
	public void consultTestUnit() throws ParserConfigurationException, SAXException, IOException {
		given()
			.accept(ContentType.ANY)
			.when()
				.get("api/archive/")
			.then()
				.statusCode(HttpStatus.OK.value());
	}
	
	
	@Test
	public void consultTestSucess() {
		when(this.controller.salvar()).thenReturn(new ArchiveModel());
		given()
			.accept(ContentType.XML)
			.when()
				.get("api/archive")
			.then()
				.statusCode(HttpStatus.OK.value());
	}
	@Test
	public void consultTestFail() {
		when(this.controller.salvar()).thenReturn(null);
		given()
			.accept(ContentType.XML)
		.when()
			.get("api/")
		.then()
			.statusCode(HttpStatus.NOT_FOUND.value());
	}
	

}
