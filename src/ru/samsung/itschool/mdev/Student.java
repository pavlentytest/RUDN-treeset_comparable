package ru.samsung.itschool.mdev;

public class Student implements Comparable<Student> {
    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        Integer x1 = o.getMark();
        Integer x2 = this.getMark();
        int result = x1.compareTo(x2);
        if(result != 0) {
            return result;
        }
        String s1 = o.getName();
        String s2 = this.getName();
        return s1.compareTo(s2);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
