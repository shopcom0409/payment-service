package com.shopcom.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "payment_details")
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(generator = "payment_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "payment_seq", initialValue = 100, allocationSize = 2)
    private Integer paymentId;
    private Double amount;
    private Date paymentDate;
    private String transactionId;
    private Boolean paymentStatus;

}
