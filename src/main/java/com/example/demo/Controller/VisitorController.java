package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.Entity.Visitor;
import com.example.demo.Service.VisitorService;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

    private final VisitorService service;

    public VisitorController(VisitorService service) {
        this.service = service;
    }

    @PostMapping
    public Visitor create(@RequestBody Visitor visitor) {
        return service.create(visitor);
    }

    @GetMapping
    public List<Visitor> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Visitor get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Visitor update(@PathVariable Long id, @RequestBody Visitor visitor) {
        return service.update(id, visitor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
