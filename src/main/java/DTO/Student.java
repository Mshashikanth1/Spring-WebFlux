package DTO;

public class Student {
    private final Long id;
    private final String name;
    private final String grade;

    public Student(Long id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
