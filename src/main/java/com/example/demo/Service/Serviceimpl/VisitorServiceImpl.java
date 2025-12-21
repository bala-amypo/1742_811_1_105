package com.example.demo.Service.Impl;

import com.example.demo.Service.*;
import com.example.demo.Repository.*;
import com.example.demo.Entity.*;
import com.example.demo.Exception.*;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class VisitorServiceImpl implements VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorServiceImpl(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public Visitor createVisitor(Visitor visitor) {
        return visitorRepository.save(visitor);
    }

    public Visitor getVisitor(Long id) {
        return visitorRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Visitor not found"));
    }

    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }
}
