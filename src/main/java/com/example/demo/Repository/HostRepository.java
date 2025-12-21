package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Host;

public interface HostRepository extends JpaRepository<Host, Long> {
}
