package com.ethioLove.matchers.ethiolove.repository;

import com.ethioLove.matchers.ethiolove.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchersRepository  extends JpaRepository<Customers,Integer> {
}
