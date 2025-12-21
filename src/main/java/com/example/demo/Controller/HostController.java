package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.Model.Host;
import com.example.demo.Service.HostService;

@RestController
@RequestMapping("/api/hosts")
public class HostController {

    private final HostService hostService;

    public HostController(HostService hostService) {
        this.hostService = hostService;
    }

    @PostMapping
    public Host create(@RequestBody Host host) {
        return hostService.create(host);
    }

    @GetMapping
    public List<Host> getAll() {
        return hostService.getAll();
    }

    @GetMapping("/{id}")
    public Host getById(@PathVariable Long id) {
        return hostService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        hostService.delete(id);
    }
}
