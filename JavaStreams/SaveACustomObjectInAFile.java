package com.company;

import java.io.*;

class Course implements Serializable {
    String courseName;
    Integer numberOfStudents;

    public String getCourseName() {
        return this.courseName;
    }

    public Integer getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public void setNumberOfStudents(Integer number) {
        this.numberOfStudents = number;
    }
}

public class SaveACustomObjectInAFile {

    public static void main(String[] args) {
        Course firstCourse = new Course();
        firstCourse.setCourseName("Programming Basics");
        firstCourse.setNumberOfStudents(200);

        Course secondCourse = new Course();
        secondCourse.setCourseName("Java Basics");
        secondCourse.setNumberOfStudents(150);

        Course thirdCourse = new Course();
        thirdCourse.setCourseName("C# Advanced");
        thirdCourse.setNumberOfStudents(140);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(new File("resources/courses.txt")));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream("resources/courses.txt"))) {

            output.writeObject(firstCourse);
            output.writeObject(secondCourse);
            output.writeObject(thirdCourse);
            output.close();

            while (true) {
                try {
                    Course course = (Course) input.readObject();
                    System.out.println("Course: " + course.getCourseName());
                    System.out.println("Number of students: " + course.getNumberOfStudents());
                } catch (EOFException e) {
                    input.close();
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
