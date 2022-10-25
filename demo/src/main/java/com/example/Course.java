package com.example;

/**
 * Hello world!
 *
 */
public class Course 
{
    private String name;
    private String desc;
    private String dept;
    private String time;
    private String weekDay;

    public Course(String name2, String desc2, String dept2, String time2, String weekDay2)
    {
        name = name2;
        desc = desc2;
        dept = dept2;
        time = time2;
        weekDay = weekDay2;
    }
    public void setName(String nameSet)
    {
        name = nameSet;
    }
    public String getName()
    {
        return name;
    }
    public void setDesc(String descSet)
    {
        desc = descSet;
    }
    public String getDesc()
    {
        return desc;
    }
    public void setDept(String deptSet)
    {
        dept = deptSet;
    }
    public String getDept()
    {
        return dept;
    }
    public void setTime(String timeSet)
    {
        time = timeSet;
    }
    public String getTime()
    {
        return time;
    }
    public void setDay(String daySet)
    {
        weekDay = daySet;
    }
    public String getDay()
    {
        return weekDay;
    }
}
