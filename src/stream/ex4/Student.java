package stream.ex4;

public class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }
    String getName(){return name;}
    int getBan(){return ban;}
    int getTotalScore(){return totalScore;}

    //총점 내림차순
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
