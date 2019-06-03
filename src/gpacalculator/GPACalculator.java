
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author wug0356
 */
public class GPACalculator implements Modifiable {
    ArrayList<Course> courses = new ArrayList<Course>();
    
    public double UWGradeCalculator()
    {
        double UWGrade = 0;
        for(int i=0; i<courses.size(); i++)
        {
            double g = courses.get(i).getGradeMark();
            UWGrade += g;
        }
        return UWGrade/courses.size();
    }
    public double WGradeCalculator()
    {
        double WGrade = 0;
        for(int i=0; i<courses.size(); i++)
        {
            double g = courses.get(i).getGradeMark();
            if(courses.get(i).isWeight())
            {
                g++;
            }
            WGrade += g;
        }
        return WGrade/courses.size();
    }
    
    public String checkGS()
    {
        String gs = "";
        int eng = 4;
        int math = 3;
        int ss = 3;
        int pe = 2;
        int ps = 1;
        int ls = 1;
        int fpart = 1;
        int part = 1;
        int ele = 7;
        for(int i=0; i<courses.size(); i++)
        {
            if(courses.get(i).getCategory().equals("English")&&eng>0)
            {
                eng--;
            }
            else if(courses.get(i).getCategory().equals("Math")&&math>0)
            {
                math--;
            }
            else if(courses.get(i).getCategory().equals("Social Science")&&ss>0)
            {
                ss--;
            }
            else if(courses.get(i).getCategory().equals("PE")&&pe>0)
            {
                pe--;
            }
            else if(courses.get(i).getCategory().equals("Physical Science")&&ps>0)
            {
                ps--;
            }
            else if(courses.get(i).getCategory().equals("Life Science")&&ls>0)
            {
                ls--;
            }
            else if(courses.get(i).getCategory().equals("Fine/Performing Art")&&fpart>0)
            {
                fpart--;
            }
            else if(courses.get(i).getCategory().equals("Practical Art")&&part>0)
            {
                part--;
            }
            else
            {
                ele--;
            }
        }
        gs="needed courses:"+"\n"+eng+"years of English"+"\n"+math+"years of Math"
                +"\n"+ss+"years of Social Science"+"\n"+pe+"years of PE"+"\n"
                +ps+"years of Practical Science"+"\n"+ls+"years of Life Science"
                +"\n"+fpart+"years of Fine/Performing Art"+"\n"+part+"years of Practical Art"
                +"\n"+ele+"years of Electives";
        return gs;
    }
    
    public void add(Course c)
    {
        courses.add(c);
    }
    public void remove(int c)
    {
        courses.remove(c);
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
