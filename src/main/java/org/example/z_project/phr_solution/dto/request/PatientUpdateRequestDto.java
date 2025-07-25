package org.example.z_project.phr_solution.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PatientUpdateRequestDto {
    private String name;
    private int age;
}
