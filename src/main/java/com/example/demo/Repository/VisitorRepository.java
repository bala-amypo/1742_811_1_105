package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
}
