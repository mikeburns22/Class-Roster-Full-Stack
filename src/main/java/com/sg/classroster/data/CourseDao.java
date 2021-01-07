package com.sg.classroster.data;

import com.sg.classroster.model.Course;
import com.sg.classroster.model.Student;
import com.sg.classroster.model.Teacher;
import java.util.List;


public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);
    
    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
