package Generics.ex2;

public class Student {
    String name;
    String learning;
    int level;
    int java;
    int js;

    int node;
    int python;

    public Student(String name, String learning, int level) {
        this.name=name;
        this.learning =learning;
        this.level=level;
    }

    public Student(String name, String learning, int level, int java, int js, int node, int python) {
        this.name = name;
        this.learning = learning;
        this.level = level;
        this.java = java;
        this.js = js;
        this.node = node;
        this.python = python;
    }
}
