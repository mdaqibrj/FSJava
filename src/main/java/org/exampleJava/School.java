package org.exampleJava;

public class School {
String schoolName;
String schoolAddress;
String schoolPrincipalName;
int teacherCount;
int studentCount;

public void displayResult()
    {
        System.out.println("All the students of " + schoolName + " have passed with flying colors."
        + schoolPrincipalName + " Congratulate you all " + studentCount + " students " + " on behalf of all " +
                teacherCount + " teacher."
        );
    }
}
