package com.gareth;

// Visitor

public interface TeacherVisitor {

    String visit(Student student);
    String visit(Parent parent);
}
