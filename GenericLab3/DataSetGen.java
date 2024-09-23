/*
 * Class: CMSC204  CRN 	 22098
 * Instructor: Khandan Monshi
 * Description: This program the generic DataSet class which loads any instance of a class that implements Measurable
 * Due: 09/23/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Andy Gunawan
*/

public class DataSetGen<T extends Measurable> {
	//Variables
    private double sum;
    private T minimum;
    private T maximum;
    private int count;

    //no arg constructor 
    public DataSetGen() {
        sum = 0.0;
        minimum = null;
        maximum = null;
        count = 0;
    }

    //Finds the sum of the items, the max and min, and counts the number of objects being added
    public void add(T item) {
        sum += item.getMeasure();
   
        if (count == 0) {
            minimum = item;
            maximum = item;
        } else {
            if (item.getMeasure() < minimum.getMeasure()) {
                minimum = item;
            }
            if (item.getMeasure() > maximum.getMeasure()) {
                maximum = item;
            }
        } 
        
        count++;
    }

    //finds the average value by dividing the sum by the number of objects
    public double getAverage() {
    	double average = sum / count;
        if (count == 0) {
            return 0;
        } else {
            return average;
        }
    }

    //returns minimum value
    public T getMinimum() {
        return minimum;
    }

    //returns maximum value
    public T getMaximum() {
        return maximum;
    }
}
