// package com.example.demo.Service.Impl;

// import org.springframework.stereotype.Service;
// import java.util.List;

// import com.example.demo.Model.Host;
// import com.example.demo.Repository.HostRepository;
// import com.example.demo.Service.HostService;

// @Service
// public class HostServiceImpl implements HostService {

//     private final HostRepository hostRepository;

//     public HostServiceImpl(HostRepository hostRepository) {
//         this.hostRepository = hostRepository;
//     }

//     public Host create(Host host) {
//         return hostRepository.save(host);
//     }

//     public Host getById(Long id) {
//         return hostRepository.findById(id).orElseThrow();
//     }

//     public List<Host> getAll() {
//         return hostRepository.findAll();
//     }

//     public void delete(Long id) {
//         hostRepository.deleteById(id);
//     }
// }
