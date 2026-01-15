package com.pet.clinic.management.model.medicalservices;

import com.pet.clinic.management.model.users.Veterinarian;
import com.pet.clinic.management.model.animal.Animal;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "MEDICAL_RECORD")
public class MedicalRecord {
    @Id
    private String recordId;
    private LocalDateTime recordDate;
    @ManyToOne
    @JoinColumn(name = "ANIMAL_ID")
    private Animal animal;
    @ManyToOne
    @JoinColumn(name = "VETERINARIAN_ID")
    private Veterinarian veterinarian;
    private String diagnosis;
    private String treatment;
    private Double weightKg;
    private Double temperatureCelsius;
    private String notes;
    private String medicationUsed;

    public MedicalRecord(String recordId,
                         LocalDateTime recordDate,
                         Animal animal,
                         Veterinarian veterinarian,
                         String diagnosis,
                         String treatment,
                         Double weightKg,
                         Double temperatureCelsius,
                         String notes,
                         String medicationUsed) {
        this.recordId = recordId;
        this.recordDate = recordDate;
        this.animal = animal;
        this.veterinarian = veterinarian;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.weightKg = weightKg;
        this.temperatureCelsius = temperatureCelsius;
        this.notes = notes;
        this.medicationUsed = medicationUsed;
    }

    public MedicalRecord() {
    }

    public String getRecordId() {
        return recordId;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public Double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public String getNotes() {
        return notes;
    }

    public String getMedicationUsed() {
        return medicationUsed;
    }
}
