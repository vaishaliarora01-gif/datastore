package com.datastore.person.controller;

import com.datastore.person.pojo.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final List<Student> studentList = new ArrayList<>();

    @PostMapping("/post")
    public ResponseEntity<String> postStudent(@RequestBody Student student, HttpServletRequest request) {
        System.out.println("Header 'test': " + request.getHeader("test"));
        studentList.add(student);
        return ResponseEntity.ok("Student successfully posted.");
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<Student> getStudent(@PathVariable String name) {
        List<Student> matched = studentList.stream()
                .filter(stu -> stu.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        if (matched.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.ok(matched.get(0));
    }
}
