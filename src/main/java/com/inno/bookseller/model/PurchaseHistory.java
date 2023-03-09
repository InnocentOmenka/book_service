package com.inno.bookseller.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "purchase_history")
public class PurchaseHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "book_id", nullable = false)
    private String bookId;
    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;
    @Column(name = "price", nullable = false)
    private Double price;

}
