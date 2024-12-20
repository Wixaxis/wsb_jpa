package com.jpacourse.persistence.entity;

import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column()
	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

//	Relacja dwukierunkowa
	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	private DoctorEntity doctor;

//	Relacja dwukierunkowa
	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	private PatientEntity patient;


//	Relacja jednokierunkowa - Visit Entity jest rodzicem / właścicielem
	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinTable(
			name = "VISIT_MEDICAL_TREATMENT",
			joinColumns = @JoinColumn(name = "VISIT_ID"),
			inverseJoinColumns = @JoinColumn(name = "MEDICAL_TREATMENT_ID")
	)
	private Collection<MedicalTreatmentEntity> medicalTreatments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public Collection<MedicalTreatmentEntity> getMedicalTreatments() {
		return medicalTreatments;
	}

	public void setMedicalTreatments(Collection<MedicalTreatmentEntity> medicalTreatments) {
		this.medicalTreatments = medicalTreatments;
	}
}
