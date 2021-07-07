package com.exadev.projet.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;


@Entity
@DiscriminatorValue("MS")
public class MedecinSpecialiste extends Medecin implements Serializable {

	private String specialite;
	
	
	@ManyToMany(mappedBy = "courses")
	private List<Patient> students;

	public MedecinSpecialiste() {
		super();
	}

	public MedecinSpecialiste(String nom, String prenom, String dateNaissance, String email,
			String codePublic, String specialite) {
		super(nom, prenom, dateNaissance, email, codePublic);
		this.specialite = specialite;
	}

	public String getspecialite() {
		return specialite;
	}

	public void setspecialite(String specialite) {
		this.specialite = specialite;
	}

	
	public List<Patient> getStudents() {
		return students;
	}

	public void setStudents(List<Patient> students) {
		this.students = students;
	}

	// TODO getters and setters for all properties

}
