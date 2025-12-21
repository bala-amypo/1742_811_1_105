package com.example.demo.Service;

import com.example.demo.Entity.Host;
import java.util.List;

public interface HostService {
    Host createHost(Host host);
    Host getHost(Long id);
    List<Host> getAllHosts();
}
