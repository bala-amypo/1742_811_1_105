// package com.example.demo.Service.Impl;

// import org.springframework.stereotype.Service;
// import java.util.List;

// import com.example.demo.Model.Visitor;
// import com.example.demo.Repository.VisitorRepository;
// import com.example.demo.Service.VisitorService;

// @Service
// public class VisitorServiceImpl implements VisitorService {

//     private final VisitorRepository visitorRepository;

//     public VisitorServiceImpl(VisitorRepository visitorRepository) {
//         this.visitorRepository = visitorRepository;
//     }

//     public Visitor create(Visitor visitor) {
//         return visitorRepository.save(visitor);
//     }

//     public Visitor getById(Long id) {
//         return visitorRepository.findById(id).orElseThrow();
//     }

//     public List<Visitor> getAll() {
//         return visitorRepository.findAll();
//     }

//     public Visitor update(Long id, Visitor visitor) {
//         Visitor v = getById(id);
//         v.setFullName(visitor.getFullName());
//         v.setEmail(visitor.getEmail());
//         v.setPhone(visitor.getPhone());
//         v.setIdProofNumber(visitor.getIdProofNumber());
//         return visitorRepository.save(v);
//     }

//     public void delete(Long id) {
//         visitorRepository.deleteById(id);
//     }
// }
