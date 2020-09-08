package com.test.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TICKETS")
public class PaymentRequest {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    Long routeId;

    Long clientId;

    Integer ticketId;

    ZonedDateTime departureDateTime;
    @Enumerated(EnumType.STRING)
    PaymentRequestStatus requestStatus;
}
