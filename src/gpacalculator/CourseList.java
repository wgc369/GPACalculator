/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.util.ArrayList;

/**
 *
 * @author wug0356
 */
public class CourseList implements ListModifier {
    public ArrayList<Course> courses;
    public CourseList()
    {
        courses = new ArrayList<Course>();
    }
    public void add(Course c)
    {
        courses.add(c);
    }
    public void remove(Course c)
    {
        courses.remove(c);
    }
    public void modify(int index, Course c)
    {
        courses.set(index,c);
    }
    public Course get(int index)
    {
        return courses.get(index);
    }
    public ArrayList getList()
    {
        return courses;
    }
    public String toString()
    {
        return courses.toString();
    }
}
