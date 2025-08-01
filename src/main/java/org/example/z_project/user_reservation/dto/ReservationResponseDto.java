package org.example.z_project.user_reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@Getter
@ToString
public class ReservationResponseDto {
    private Long reservationId;
    private String userId;
    private Date reservationDate;
    private String activeMessage;
}
