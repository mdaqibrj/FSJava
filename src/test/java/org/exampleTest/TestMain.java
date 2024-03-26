package org.exampleTest;

import org.exampleJava.Student;
import org.exampleJava.Teacher;

public class TestMain
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        t1.teach();
        s1.eat();
        s2.play();
        s3.talk();

    }
}
