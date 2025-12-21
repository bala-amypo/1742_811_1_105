package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.Visitor;

public interface VisitorService {
    Visitor create(Visitor visitor);
    Visitor getById(Long id);
    List<Visitor> getAll();
    Visitor update(Long id, Visitor visitor);
    void delete(Long id);
}
