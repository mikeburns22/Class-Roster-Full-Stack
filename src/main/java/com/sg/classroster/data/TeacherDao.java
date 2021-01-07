package com.sg.classroster.data;

import com.sg.classroster.model.Teacher;

import java.util.List;


public interface TeacherDao {
    
    Teacher getTeacherById(int id);
    List<Teacher> getAllTeachers();
    Teacher addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacherById(int id);
    
}
