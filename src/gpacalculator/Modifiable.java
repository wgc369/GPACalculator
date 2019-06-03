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
public interface Modifiable {
    public void add(Course c);
    public void remove(int c);
    public Course get(int index);
}
