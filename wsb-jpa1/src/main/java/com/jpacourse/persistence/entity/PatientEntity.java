package com.jpacourse.persistence.entity;

import com.jpacourse.persistence.embedded.UserEmbedded;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

    @Id
	@GeneratedValue(generator = "UserIdGenerator")
	@SequenceGenerator(
	name = "UserIdGenerator",
	sequenceName = "USER_ID_SEQ_LIBRARY",
	allocationSize = 1
    )
	private Long id;

	@Embedded
	private UserEmbedded userEmbedded;

	@ManyToOne
	private AddressEntity address;

	@Column(nullable = false)
	private String patientNumber;

	@Column(nullable = false)
	private LocalDate dateOfBirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return userEmbedded.getFirstName();
	}

	public void setFirstName(String firstName) {
		userEmbedded.setFirstName(firstName);
	}

	public String getLastName() {
		return userEmbedded.getLastName();
	}

	public void setLastName(String lastName) {
		this.userEmbedded.setLastName(lastName);
	}

	public String getTelephoneNumber() {
		return userEmbedded.getTelephoneNumber();
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.userEmbedded.setTelephoneNumber(telephoneNumber);
	}

	public String getEmail() {
		return userEmbedded.getEmail();
	}

	public void setEmail(String email) {
		this.userEmbedded.setEmail(email);
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
