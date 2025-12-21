package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
}
