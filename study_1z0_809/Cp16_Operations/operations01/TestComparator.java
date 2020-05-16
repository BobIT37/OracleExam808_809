package com.wealth.certificate.study_1z0_809.chapter16.operations01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
 * public interface Comparator<T> {
 *  int compare(T obj1, T obj2);
 *
 *   // Other default and static methods ...
 *	}
 * 
 * The difference is that java.util.Comparator is implemented by a class you use to sort ANOTHER class' objects
 *  while java.lang.Comparable is implemented by the SAME object you want to sort.
 *
 * With Comparator, you make an object to compare two objects of another type to sort them; that's why you take two parameters, 
 * and the method is called compare (those two objects).
 */

public class TestComparator implements Comparator<TestComparator> {

	private String brand;
	private int id;

	public TestComparator() {
		
	}
	public TestComparator(String brand, int id) {
		this.brand = brand;
        this.id = id;
	}

    // Let's compare first by id and then by brand
	@Override
	public int compare(TestComparator o1, TestComparator o2) {
		int result = Integer.compare(o1.id, o2.id);
		return result == 0 ? o1.brand.compareTo(o2.brand) : result;
	}

	public static void main(String[] args) {
		    TestComparator c1 = new TestComparator("Lenovo", 1);
	        TestComparator c2 = new TestComparator("Apple", 2);
	        TestComparator c3 = new TestComparator("Dell", 3);
	        TestComparator c4 = new TestComparator("Lenovo", 2);
	        
	        TestComparator comparator = new TestComparator();


	        // Creating a list and sorting it
	        // Sort method implement Comparable interface with a natural order
	        List<TestComparator> list = Arrays.asList(c1, c2, c3, c4);
	        Collections.sort(list, comparator);
	        list.forEach(
	           c -> System.out.format("%d-%s \n",c.id,c.brand)
	        );
	        
	        //using anonymous class
	        Comparator<TestComparator> sortById =
	        	    new Comparator<TestComparator>() {
	        	        public int compare(TestComparator t1, TestComparator t2) {
	        	            int result = Integer.compare(t1.id, t2.id);
	        	            return result == 0
	        	                ? t1.brand.compareTo(t2.brand) : result;
	        	    }
	        	};
	        
	        //using lambda expression
	        Comparator<TestComparator> sortByBrand = (a1, a2) -> {
	        	int result = a1.brand.compareTo(a2.brand);
	            return result == 0
	               ? Integer.compare(a1.id, a2.id) : result;
	        };
	        
	        
	        // new anonymous class in method sort
	        List<String> strList = Arrays.asList("B","Z","A","F");
	        Collections.sort(strList, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					System.out.println(o1 +" "+o2);
					return  o1.compareTo(o2) ;
				}
			});
	        System.out.println(strList);
	        
	        
	        /*
	         * In Java 8, with the introduction of default and static methods in interfaces, we have some useful methods on Comparator to simplify our code like:

	        	Comparator<T>
	        	   Comparator.comparing(Function<? super T, ? extends U>)
	        	Comparator<T>
	        	   Comparator.comparingInt(ToIntFunction<? super T>)
	        	Comparator<T>
	        	   Comparator.comparingLong(ToLongFunction<? super T>)
	        	Comparator<T>
	        	   Comparator.comparingDouble(ToDoubleFunction<? super T>)
	       */
	        
	        Comparator<TestComparator> comparing = Comparator.comparing(c -> c.brand);
	        
	        //Primitive Type version
	        Comparator<TestComparator> comparingInt = Comparator.comparingInt(c -> c.id);
	        
	        Comparator<TestComparator> comparingLong = Comparator.comparingLong(c -> c.id);
	                
	        Comparator<TestComparator> comparingDouble = Comparator.comparingDouble(c -> c.id);
	        
	        //They are equivalent to:
			Comparator<TestComparator> equivalent = new Comparator<TestComparator>() {
			    public int compare(TestComparator c1, TestComparator c2) {
			        return Integer.valueOf(c1.id)
			                    .compareTo(Integer.valueOf(c2.id));
			    }
			};
			
	        /*
	         * 
	         * Another useful method is thenComparing that chains two Comparators (notice that this is not a static method):
				Comparator<T>
				    thenComparing(Comparator<? super T>)
				Comparator<T>
				    thenComparing(Function<? super T, ? extends U>)
				Comparator<T>
				    thenComparingInt(ToIntFunction<? super T>)
				Comparator<T>
				    thenComparingLong(ToLongFunction<? super T>)
				Comparator<T>
				    thenComparingDouble(ToDoubleFunction<? super T>)
	         * 
	         */
			
			
			//Reverse Id then natural order brand
			Comparator<TestComparator> reverseId =
			        Comparator.comparing((TestComparator c) -> c.id).reversed()
			            .thenComparing(c -> c.brand);
			/*
			 *  3-Dell 
				2-Apple 
				2-Lenovo 
				1-Lenovo 
			 */
			
			
			//Reverse Brand then natural order id
			Comparator<TestComparator> reverseBrand =
			        Comparator.comparing((TestComparator c) -> c.id)
			            .thenComparing(c -> c.brand).reversed();
			/*
			 *  3-Dell 
				2-Lenovo 
				2-Apple 
				1-Lenovo 
			 */
			
			//Reverse Id and Brand
			Comparator<TestComparator> reverseBoth =
			        Comparator.comparing((TestComparator c) -> c.id).reversed()
			            .thenComparing(c -> c.brand).reversed();
			/*
			 *  1-Lenovo 
				2-Lenovo 
				2-Apple 
				3-Dell 
			 */
			
			//Reverse Brand Comparator
			// They are equivalent to: Reverse Brand
			Comparator<TestComparator> customComparator = (a1, a2) -> {
				return a2.brand.compareTo(a1.brand) ;
			};
			
			
			Comparator<TestComparator> custom =
			        Comparator.comparing((TestComparator c) -> c.id)
			            .thenComparing(customComparator);
			
			List<TestComparator> list2 = Arrays.asList(c1, c2, c3, c4);
	        Collections.sort(list2, custom);
	        list2.forEach(
	           c -> System.out.format("%d-%s \n",c.id,c.brand)
	        );
	       
	        
	}
}
