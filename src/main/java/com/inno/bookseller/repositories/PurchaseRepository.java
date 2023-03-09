package com.inno.bookseller.repositories;

import com.inno.bookseller.model.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<PurchaseHistory, Long> {
}
