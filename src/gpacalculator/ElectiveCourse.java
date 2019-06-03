/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

/**
 *
 * @author wug0356
 */
public class ElectiveCourse extends Course {
    String category;
    public ElectiveCourse()
    {
        super();
    }
    public ElectiveCourse(String name, int grade, double gradeMark, boolean weight, String term, String category)
    {
        super.name = name;
        super.grade = grade;
        super.gradeMark=gradeMark;
        super.weight = weight;
        super.term = term;
        setCategory(category);
    }
    public void setCategory(String s)
    {
        category = "Elective";
    }
    public String getCategory()
    {
        return category;
    }
    public String toString()
    {
        return name +", "+ grade + "th Grade, " + gradeMark + "point, " + "weight:" + weight + ", " + term + "Term, " + category;
    }
}
