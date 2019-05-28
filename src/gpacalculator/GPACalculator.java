
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
public class GPACalculator {
    ArrayList<Course> courses = new ArrayList<Course>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //double gpa = GradeCalculator();
    }
    public double GradeCalculator()
    {
        int grade = 0;
        for(int i=0; i<courses.size(); i++)
        {
            int g = courses.get(i).getGrade();
            grade += g;
        }
        return grade/courses.size();
    }
}
