// package com.example.demo.Service.Impl;

// import org.springframework.stereotype.Service;
// import java.time.LocalDateTime;
// import java.util.List;

// import com.example.demo.Model.VisitLog;
// import com.example.demo.Repository.VisitLogRepository;
// import com.example.demo.Service.VisitLogService;

// @Service
// public class VisitLogServiceImpl implements VisitLogService {

//     private final VisitLogRepository visitLogRepository;

//     public VisitLogServiceImpl(VisitLogRepository visitLogRepository) {
//         this.visitLogRepository = visitLogRepository;
//     }

//     public VisitLog create(VisitLog visitLog) {
//         visitLog.setCheckInTime(LocalDateTime.now());
//         return visitLogRepository.save(visitLog);
//     }

//     public VisitLog getById(Long id) {
//         return visitLogRepository.findById(id).orElseThrow();
//     }

//     public List<VisitLog> getAll() {
//         return visitLogRepository.findAll();
//     }

//     public VisitLog checkout(Long id) {
//         VisitLog log = getById(id);
//         log.setCheckOutTime(LocalDateTime.now());
//         return visitLogRepository.save(log);
//     }

//     public void delete(Long id) {
//         visitLogRepository.deleteById(id);
//     }
// }
