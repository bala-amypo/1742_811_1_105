package com.example.demo.Controller;

import com.example.demo.Entity.Host;
import com.example.demo.Service.HostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hosts")
public class HostController {

    private final HostService hostService;

    public HostController(HostService hostService) {
        this.hostService = hostService;
    }

    @PostMapping
    public Host createHost(@RequestBody Host host) {
        return hostService.createHost(host);
    }

    @GetMapping
    public List<Host> getAllHosts() {
        return hostService.getAllHosts();
    }

    @GetMapping("/{id}")
    public Host getHost(@PathVariable Long id) {
        return hostService.getHost(id);
    }
}
