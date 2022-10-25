package com.example;

import java.util.ArrayList;
import java.util.Comparator;

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

    public void addCourse(Course newCourse)
    {
        courses.add(newCourse);
    }
    public void removeCourse(Course removeCourse)
    {
        courses.remove(removeCourse);
    }
    public void sortCourse(Boolean ascending, String attribute)
    {
        
        Comparator<Course> myComparatorN = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getName(); string2 = c2.getName();
                    return string1.compareTo(string2);		
                    }
			}
        };
        Comparator<Course> myComparatorD = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getDesc(); string2 = c2.getDesc();
                    return string1.compareTo(string2);		
                    }
			}
        };
        Comparator<Course> myComparatorDE = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getDept(); string2 = c2.getDept();
                    return string1.compareTo(string2);		
                    }
			}
        };
        Comparator<Course> myComparatorT = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getTime(); string2 = c2.getTime();
                    return string1.compareTo(string2);		
                    }
			}
        };
        Comparator<Course> myComparatorDY = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getDay(); string2 = c2.getDay();
                    return string1.compareTo(string2);		
                    }
			}
        };

        /***************************  Descending  *************************** */

        Comparator<Course> myComparatorND = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getName(); string2 = c2.getName();
                    return string2.compareTo(string1);		
                    }
			}
        };
        Comparator<Course> myComparatorDD = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getDesc(); string2 = c2.getDesc();
                    return string2.compareTo(string1);			
                    }
			}
        };
        Comparator<Course> myComparatorDED = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getDept(); string2 = c2.getDept();
                    return string2.compareTo(string1);		
                    }
			}
        };
        Comparator<Course> myComparatorTD = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getTime(); string2 = c2.getTime();
                    return string2.compareTo(string1);		
                    }
			}
        };
        Comparator<Course> myComparatorDYD = new Comparator<Course>() 
        {
			@Override
			public int compare(Course c1, Course c2) 
            {
                String string1 , string2;
         
                    {string1 = c1.getDay(); string2 = c2.getDay();
                    return string2.compareTo(string1);		
                    }
			}
        };
        if (ascending)
        {
            switch(attribute)
            {
                case "Name" :  courses.sort(myComparatorN);
                            break;
                case "Desc"  : courses.sort(myComparatorD);
                            break;
                case "Dept"  : courses.sort(myComparatorDE);
                            break;
                case "Time"  : courses.sort(myComparatorT);
                             break;
                case "Day"  : courses.sort(myComparatorDY);
                            break;
                default: return;
            }

        }
        else
        {
            switch(attribute)
            {
                case "Name" :  courses.sort(myComparatorND);
                            break;
                case "Desc"  : courses.sort(myComparatorDD);
                            break;
                case "Dept"  : courses.sort(myComparatorDED);
                            break;
                case "Time"  : courses.sort(myComparatorTD);
                             break;
                case "Day"  : courses.sort(myComparatorDYD);
                            break;
                default: return;
            }
        }
        
       
    }
}
