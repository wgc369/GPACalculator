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
public abstract class AbstractCourse{
    private String name;
    private int grade;
    private boolean weight;
    private int term;
    private String type;
    
    public AbstractCourse()
    {
        name = "";
        grade = 0;
        weight = false;
        term = 0;
        type = "";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the weight
     */
    public boolean isWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(boolean weight) {
        this.weight = weight;
    }

    /**
     * @return the term
     */
    public int getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(int term) {
        this.term = term;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
}
