package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.Entity.Host;
import com.example.demo.Service.HostService;

@RestController
@RequestMapping("/api/hosts")
public class HostController {

    private final HostService service;

    public HostController(HostService service) {
        this.service = service;
    }

    @PostMapping
    public Host create(@RequestBody Host host) {
        return service.create(host);
    }

    @GetMapping
    public List<Host> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Host get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Host update(@PathVariable Long id, @RequestBody Host host) {
        return service.update(id, host);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
