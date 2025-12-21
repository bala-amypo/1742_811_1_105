package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entity.Host;
import com.example.demo.Repository.HostRepository;
import com.example.demo.Service.HostService;

@Service
public class HostServiceImpl implements HostService {

    private final HostRepository repo;

    public HostServiceImpl(HostRepository repo) {
        this.repo = repo;
    }

    public Host create(Host host) {
        return repo.save(host);
    }

    public Host getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<Host> getAll() {
        return repo.findAll();
    }

    public Host update(Long id, Host host) {
        Host h = getById(id);
        h.setHostName(host.getHostName());
        h.setFullname(host.getFullname());
        h.setEmail(host.getEmail());
        h.setDepartment(host.getDepartment());
        h.setPhone(host.getPhone());
        return repo.save(h);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
