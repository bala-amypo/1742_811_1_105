package com.example.demo.Repository;
import com.example.demo.Entity.Visitor;
import java.util.Optional;      
import org.springframework.data.jpa.repository.JpaRepository;
public interface VisitorRepository extends JpaRepository<Visitor,Long>{
    
    Optional<Visitor> findByEmail(String email);
    Optional<Visitor> findByPhone(String phone)
}