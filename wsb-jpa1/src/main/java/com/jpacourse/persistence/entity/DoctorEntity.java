package com.jpacourse.persistence.entity;

import com.jpacourse.persistence.embedded.UserEmbedded;
import com.jpacourse.persistence.enums.Specialization;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "DOCTOR")
public class DoctorEntity {
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

	@Column(nullable = false)
	private String doctorNumber;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Specialization specialization;

//	Relacja dwukierunkowa
	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	private AddressEntity address;

//	Relacja dwukierunkowa
	@OneToMany(mappedBy = "doctor", orphanRemoval = true, fetch = FetchType.EAGER)
	private Collection<VisitEntity> visits;

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
		userEmbedded.setLastName(lastName);
	}

	public String getTelephoneNumber() {
		return userEmbedded.getTelephoneNumber();
	}

	public void setTelephoneNumber(String telephoneNumber) {
		userEmbedded.setTelephoneNumber(telephoneNumber);
	}

	public String getEmail() {
		return userEmbedded.getEmail();
	}

	public void setEmail(String email) {
		userEmbedded.setEmail(email);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctorNumber() {
		return doctorNumber;
	}

	public void setDoctorNumber(String doctorNumber) {
		this.doctorNumber = doctorNumber;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

}
