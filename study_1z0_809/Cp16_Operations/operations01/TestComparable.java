package com.wealth.certificate.study_1z0_809.chapter16.operations01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/*
 * java.lang.Comparable
 * public interface Comparable<T> {
     int compareTo(T obj);
 * }
 * 
 *  Comparable, 
 * you make an object comparable to another object of the same type to sort them
 * , that's why you only take ONE parameter and the method is called compareTo (that other object).
 *  
 *  The method to implement is: 
 *  int compareTo(T obj);
 *  
 *  As you can see, it returns an int. Here are its rules:
		When ZERO is returned, it means that the object is EQUAL to the argument.
		When a number GREATER than zero is returned, it means that the object is GREATER than the argument.
		When a number LESS than zero is returned, it means that the object is LESS than the argument.
 * 
 * Many classes of Java (like BigDecimal, BigInteger, wrappers like Integer, String, etc.) 
 * implement this interface with a natural order (like 1, 2, 3, 4 or A, B, C, a, b, c).
 */


public class TestComparable implements Comparable<TestComparable> {
    private String brand;
    private int id;
    
 	public TestComparable(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    // Let's compare first by brand and then by id
 	/*
    public int compareTo(TestComparable other) {
        // Reusing the implementation of String
        int result = this.brand.compareTo(other.brand);

        // If the objects are equal, compare by id
        if(result == 0) {
            // Let's do the comparison "manually"
            // instead of using Integer.compareTo()
            if(this.id > other.id) result = 1;
            else if( this.id < other.id) result = -1;
            // else result = 0;
        }
        return result;
    }
   */
    
    // Let's compare first by id and then by brand
    public int compareTo(TestComparable other) {
       /* using Integer.compare()
       * Also, Integer.compare(x, y) is equivalent to:
	   * Integer.valueOf(x).compareTo(Integer.valueOf(y))
	   */
       int result = Integer.compare(this.id,other.id);
    	
      if(result == 0) {
    	  result = this.brand.compareTo(other.brand);
        }
        return result;
    }

    // equals and compareTo must be consistent
    // to avoid errors in some cases
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof TestComparable)) return false;
        return this.brand.equals(other)
            && this.id == ((TestComparable)other).id;
    }

    public static void main(String[] args) {
        TestComparable c1 = new TestComparable("Lenovo", 1);
        TestComparable c2 = new TestComparable("Apple", 2);
        TestComparable c3 = new TestComparable("Dell", 3);
        TestComparable c4 = new TestComparable("Lenovo", 2);

        // Some comparisons
        System.out.println(c1.compareTo(c1)); // c1 == c1
        System.out.println(c1.compareTo(c2)); // c1 > c2
        System.out.println(c2.compareTo(c1)); // c2 < c1
        System.out.println(c1.compareTo(c4)); // c1 < c2
        System.out.println(c1.equals(c4)); // c1 != c2

        // Creating a list and sorting it
        // Sort method implement Comparable interface with a natural order
        List<TestComparable> list = Arrays.asList(c1, c2, c3, c4);
        Collections.sort(list);
        list.forEach(
           c -> System.out.format("%d-%s \n",c.id,c.brand)
        );
    }
}