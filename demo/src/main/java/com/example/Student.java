package com.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Student
{
    private String firstName;
    private String lastName;
    private Integer age;
    private Float gpa;
    private String major;
    private String dept;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(String firstName2, String lastName2, String dept2, String major2, Float gpa2, Integer age2, ArrayList<Course> courses2)
    {
        firstName = firstName2;
        lastName = lastName2;
        dept = dept2;
        major = major2;
        gpa = gpa2;
        age = age2;
        courses = courses2;
    }
    public void setFirstName(String firstNameSet)
    {
        firstName = firstNameSet;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String LastNameSet)
    {
        lastName = LastNameSet;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setMajor(String majorSet)
    {
        major = majorSet;
    }
    public String getMajor()
    {
        return major;
    }
    public void setGPA(Float gPASet)
    {
        gpa = gPASet;
    }
    public Float getGPA()
    {
        return gpa;
    }
    public void setAge(Integer ageSet)
    {
        age = ageSet;
    }
    public Integer getAge()
    {
        return age;
    }
    public void setDept(String deptSet)
    {
        dept = deptSet;
    }
    public String getDept()
    {
        return dept;
    }
    public void setCourses(ArrayList<Course> courseSet)
    {
        courses = courseSet;
    }
    public ArrayList<Course> getCourses()
    {
        return courses;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public void addCourse(Course newCourse)
    {
        courses.add(newCourse);
    }
    public void removeCourse(Course removeCourse)
    {
        courses.remove(removeCourse);
    }
    public void sortCourse(Boolean ascending, String alphabeticalDeptOrAlphabeticalName)
    {
        if (ascending)
        {

        }
        else
        {

        }
        courses.sort(null);
    }
}
