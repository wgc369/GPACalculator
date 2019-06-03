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
public abstract class Course{
    String name;
    int grade;
    double gradeMark;
    boolean weight;
    String term;
    public Course()
    {
        name = "";
        grade = 0;
        gradeMark = 0;
        weight = false;
        term = "";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public boolean isWeight() {
        return weight;
    }
    public void setWeight(boolean weight) {
        this.weight = weight;
    }
    public String getTerm() {
        return term;
    }
    public void setTerm(String term) {
        this.term = term;
    }
    public void setGradeMark(double gradeMark)
    {
        this.gradeMark=gradeMark;
    }
    public double getGradeMark()
    {
        return gradeMark;
    }
    public abstract String toString();
    
    public abstract void setCategory(String s);
    public abstract String getCategory();
}
