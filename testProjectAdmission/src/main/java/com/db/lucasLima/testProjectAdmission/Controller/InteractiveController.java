package com.db.lucasLima.testProjectAdmission.Controller;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.query.criteria.internal.expression.function.SubstringFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import com.db.lucasLima.testProjectAdmission.Model.ArchiveModel;
import com.db.lucasLima.testProjectAdmission.Model.xml;
import com.db.lucasLima.testProjectAdmission.Repository.Repository;

@RestController
public class InteractiveController {
	xml file = new xml();
	
	@Autowired
	private Repository repository;
	
	
	@GetMapping(path = "/")
	public ArchiveModel salvar() {
		ArchiveModel arch = new ArchiveModel();
		return repository.save(arch);
	}
	
	@GetMapping(path = "api/archive")
	public ResponseEntity consult() throws ParserConfigurationException, SAXException, IOException {
		
		String x =	file.getXml().substring(0,0);
		return ResponseEntity.ok(file.getXml());
	}
	
	@GetMapping(path = "api/archive/{tag}")
	public ResponseEntity consultPart(@PathVariable("tag") String tag) throws ParserConfigurationException, SAXException, IOException {
		String xml =	file.getXml();
		int firstIndex= xml.indexOf("<"+tag+">");
		int lastIndex= xml.indexOf("</"+tag+">");
		String result = xml.substring(firstIndex,lastIndex);
		return ResponseEntity.ok(result);
	}
}
