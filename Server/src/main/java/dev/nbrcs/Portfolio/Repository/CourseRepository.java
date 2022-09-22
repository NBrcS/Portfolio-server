package dev.nbrcs.Portfolio.Repository;

import dev.nbrcs.Portfolio.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
