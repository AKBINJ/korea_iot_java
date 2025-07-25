package org.example.z_project.phr_solution.service;

import org.example.z_project.phr_solution.dto.request.PatientCreateRequestDto;
import org.example.z_project.phr_solution.dto.request.PatientUpdateRequestDto;
import org.example.z_project.phr_solution.dto.response.PatientListResponseDto;
import org.example.z_project.phr_solution.dto.response.PatientDetailResponseDto;

import java.util.List;

public interface PatientService {
    // CR(전체/단건)UD
    void registerPatient(PatientCreateRequestDto dto);
    List<PatientListResponseDto> listAllPatients();
    PatientDetailResponseDto getPatientById(Long id);
    void updatePatient(Long id, PatientUpdateRequestDto dto);
    void deletePatient(Long id);
}