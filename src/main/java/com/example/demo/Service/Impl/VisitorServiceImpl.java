package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entity.Visitor;
import com.example.demo.Repository.VisitorRepository;
import com.example.demo.Service.VisitorService;

@Service
public class VisitorServiceImpl implements VisitorService {

    private final VisitorRepository repo;

    public VisitorServiceImpl(VisitorRepository repo) {
        this.repo = repo;
    }

    public Visitor create(Visitor visitor) {
        return repo.save(visitor);
    }

    public Visitor getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<Visitor> getAll() {
        return repo.findAll();
    }

    public Visitor update(Long id, Visitor visitor) {
        Visitor v = getById(id);
        v.setFullName(visitor.getFullName());
        v.setEmail(visitor.getEmail());
        v.setPhone(visitor.getPhone());
        v.setIdProofNumber(visitor.getIdProofNumber());
        return repo.save(v);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
