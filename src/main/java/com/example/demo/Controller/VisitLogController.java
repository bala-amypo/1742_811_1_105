// package com.example.demo.Controller;

// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// import com.example.demo.Model.VisitLog;
// import com.example.demo.Service.VisitLogService;

// @RestController
// @RequestMapping("/api/visitlogs")
// public class VisitLogController {

//     private final VisitLogService visitLogService;

//     public VisitLogController(VisitLogService visitLogService) {
//         this.visitLogService = visitLogService;
//     }

//     @PostMapping
//     public VisitLog create(@RequestBody VisitLog visitLog) {
//         return visitLogService.create(visitLog);
//     }

//     @GetMapping
//     public List<VisitLog> getAll() {
//         return visitLogService.getAll();
//     }

//     @GetMapping("/{id}")
//     public VisitLog getById(@PathVariable Long id) {
//         return visitLogService.getById(id);
//     }

//     @PutMapping("/checkout/{id}")
//     public VisitLog checkout(@PathVariable Long id) {
//         return visitLogService.checkout(id);
//     }

//     @DeleteMapping("/{id}")
//     public void delete(@PathVariable Long id) {
//         visitLogService.delete(id);
//     }
// }
