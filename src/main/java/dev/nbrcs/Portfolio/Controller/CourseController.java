package dev.nbrcs.Portfolio.Controller;

import dev.nbrcs.Portfolio.Models.Course;
import dev.nbrcs.Portfolio.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseRepository courses;

    @GetMapping
    public List<Course> response(){
        return courses.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Course> getById(@RequestParam("id") Long id){
        return courses.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestParam("id") Long id){
        courses.deleteById(id);
    }
    @PostMapping("/{course}")
    public void delete(@RequestParam("course") Course course){
        courses.save(course);
    }



}