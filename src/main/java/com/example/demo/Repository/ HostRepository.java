package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Host;

import java.util.Optional;

public interface HostRepository extends JpaRepository<Host, Long> {

    Optional<Host> findByEmail(String email);
}
