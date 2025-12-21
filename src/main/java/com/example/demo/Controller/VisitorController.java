// package com.example.demo.Controller;

// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// import com.example.demo.Model.Visitor;
// import com.example.demo.Service.VisitorService;

// @RestController
// @RequestMapping("/api/visitors")
// public class VisitorController {

//     private final VisitorService visitorService;

//     public VisitorController(VisitorService visitorService) {
//         this.visitorService = visitorService;
//     }

//     @PostMapping
//     public Visitor create(@RequestBody Visitor visitor) {
//         return visitorService.create(visitor);
//     }

//     @GetMapping
//     public List<Visitor> getAll() {
//         return visitorService.getAll();
//     }

//     @GetMapping("/{id}")
//     public Visitor getById(@PathVariable Long id) {
//         return visitorService.getById(id);
//     }

//     @PutMapping("/{id}")
//     public Visitor update(@PathVariable Long id, @RequestBody Visitor visitor) {
//         return visitorService.update(id, visitor);
//     }

//     @DeleteMapping("/{id}")
//     public void delete(@PathVariable Long id) {
//         visitorService.delete(id);
//     }
// }
