package com.db.lucasLima.testProjectAdmission.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "Archive")
public class ArchiveModel {
	@Id
	public Integer code;
	@Column(nullable = false, length = 6000)
	public String doc;
	
	
	public String getDoc() {
		return doc;
	}
	public void setDoc() {
		xml file = new xml();
		this.doc = file.getXml();
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	
	
}
