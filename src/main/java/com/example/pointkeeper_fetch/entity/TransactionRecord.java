package com.example.pointkeeper_fetch.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name="transactionRecord")
public class TransactionRecord {
    @Id
    @Column(name="payer")
    private String payer;
    @Column(name="points")
    private int points;
    @Column(name="timestamp")
    private LocalDateTime timestamp;

}
