/*
 * Class: CMSC204  CRN 22098
 * Instructor: Khandan Monshi
 * Description: This program is a class that contains recursive method to calculate
 * the sum of elements in an int array.
 * Due: 10/06/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Andy Gunawan
*/

public class ArraySum {
    
    public int sumOfArray(Integer[] a, int index) {
        if (index < 0) {
        	//Base case
            return 0;
        }
        //The recursion step
        return a[index] + sumOfArray(a, index - 1);
    }
}
