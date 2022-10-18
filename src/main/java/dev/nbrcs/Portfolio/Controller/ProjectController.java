package dev.nbrcs.Portfolio.Controller;

import dev.nbrcs.Portfolio.Models.Project;
import dev.nbrcs.Portfolio.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectRepository projects;

    @GetMapping
    public List<Project> response(){
        return projects.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Project> getById(@RequestParam("id") Long id){
        return projects.findById(id);
    }

}
