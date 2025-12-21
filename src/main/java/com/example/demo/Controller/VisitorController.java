package com.example.demo.Controller;

import com.example.demo.Service.*;
import com.example.demo.Entity.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

    private final VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    @PostMapping
    public Visitor create(@RequestBody Visitor visitor) {
        return visitorService.createVisitor(visitor);
    }

    @GetMapping
    public List<Visitor> list() {
        return visitorService.getAllVisitors();
    }

    @GetMapping("/{id}")
    public Visitor get(@PathVariable Long id) {
        return visitorService.getVisitor(id);
    }
}
