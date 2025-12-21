package com.example.demo.Service.Impl;

import com.example.demo.Service.HostService;
import com.example.demo.Repository.HostRepository;
import com.example.demo.Entity.Host;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Exception.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostServiceImpl implements HostService {

    private final HostRepository hostRepository;

    public HostServiceImpl(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    public Host createHost(Host host) {
        if (hostRepository.findByEmail(host.getEmail()).isPresent()) {
            throw new BadRequestException("Host not found");
        }
        return hostRepository.save(host);
    }

    public Host getHost(Long id) {
        return hostRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Host not found"));
    }

    public List<Host> getAllHosts() {
        return hostRepository.findAll();
    }
}
