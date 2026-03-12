package java_advanced.framework.spring.core;

import java.io.Serializable;

public class Student implements Serializable {

    private Integer id;
    private String name;
    private String mailId;
    private Project project;

    public Student(Integer id, String name, String mailId, Project project) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.project = project;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", project=" + project + "]";
    }
}