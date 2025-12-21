package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.Host;

public interface HostService {
    Host create(Host host);
    Host getById(Long id);
    List<Host> getAll();
    Host update(Long id, Host host);
    void delete(Long id);
}
