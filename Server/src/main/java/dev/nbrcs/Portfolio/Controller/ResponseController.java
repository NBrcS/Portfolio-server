package dev.nbrcs.Portfolio.Controller;

import dev.nbrcs.Portfolio.Models.Course;
import dev.nbrcs.Portfolio.Repository.CourseRepository;
import dev.nbrcs.Portfolio.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ResponseController {

    @Autowired
    private CourseRepository courses;
    @Autowired
    private ProjectRepository projects;

    @GetMapping
    public List<Object> response(){

        List<Object> response = null;

        response.addAll(this.courses.findAll());
        response.addAll(this.projects.findAll());

        return response;
    }

}
