package com.wealth.certificate.study_1z0_809.chapter07.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TestArrayList {
	public static void main(String[] args) {
		// Creating an ArrayList with an initial capacity of 10
		List<String> list = new ArrayList<>(10);
		
		System.out.println("-----------boolean isEmpty()-----------");
		System.out.print("isEmpty() : ");
		System.out.println(list.isEmpty()); 								// true
		
		list.add(null);		
		System.out.print("add null isEmpty() : ");
		System.out.println(list.isEmpty()); 								// false
		
		System.out.println("-----------boolean add(E e)-----------");	
		System.out.println("-----------void add(int index, E element)-----------");	
		System.out.print("add a    : ");
		System.out.println(list.add("a"));									// true
		
		System.out.println("add 0, b : Inserting b at index 0 not return");	
		list.add(0, "b");													// Inserting b at index 0
		
		System.out.print("add null : ");									
		System.out.println(list.add(null));									// true
		
		System.out.print("add a    : ");
		System.out.println(list.add("a"));									// true
		
		System.out.print("add b    : ");
		System.out.println(list.add("b"));									// true
		
		System.out.print("list : ");
		System.out.println(list);											// [b, a, null, a, b]
		
		System.out.println("\n-----------int size()-----------");
		System.out.print("size() : ");
		System.out.println(list.size());									// 5
		
		System.out.println("\n-----------E get(int index)-----------");
		System.out.print("get 0  : ");
		System.out.println(list.get(0)); 									// b
		
		System.out.print("get 2  : ");
		System.out.println(list.get(2)); 									// null
		
		System.out.print("get 5  : ");
		//System.out.println(list.get(5)); 									// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 5null
	    
		System.out.println("\n-----------int indexOf(Object o)-----------");
		System.out.println(list);
		// Returning the index of the first match, -1 if not found
		System.out.print("indexOf a  : ");
		System.out.println(list.indexOf("a")); 								// 1
		
		System.out.print("indexOf c  : ");
		System.out.println(list.indexOf("c")); 								// -1
		
		System.out.print("indexOf null  : ");
		System.out.println(list.indexOf(null)); 							// 2
		
		System.out.println("\n-----------int lastIndexOf(Object o)-----------");
		System.out.println(list);
		System.out.print("lastIndexOf a  : ");
		System.out.println(list.lastIndexOf("a")); 							// 3
		
		System.out.println("\n-----------boolean addAll(Collection<? extends E> c)-----------");
		// create an empty array a with an initial capacity
		ArrayList<Integer> a = new ArrayList<Integer>(5);
		
		// use add() method to add elements in the list
		a.add(11);
		
		// create an empty array list2 with an initial capacity
		ArrayList<Integer> b = new ArrayList<Integer>(5);
		
		// use add() method to add elements in b
		b.add(22);
		b.add(23);
		b.add(24);
		
		// inserting all elements, b will get printed after a
		a.addAll(b);
		
		for (Integer number : a) {
		   System.out.println("arrlist1 : Number = " + number);
		}
		
		System.out.println("-----------boolean addAll(int index, Collection<? extends E> c)-----------");
		// inserting all elements of b at third position
		a.addAll(2, b);
		// let us print all the elements available in a
		for (Integer number : a) {
			System.out.println("arrlist1 : Number = " + number);
		}
		
		System.out.println("-----------void clear()-----------");
		a.clear();
		for (Integer number : a) {
		   System.out.println("arrlist1 : Number = " + number);
		}
		
		System.out.println("-----------Object clone()-----------");
		ArrayList<String> arrl = new ArrayList<String>();
		
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        
        System.out.println("Actual ArrayList:"+arrl);
        
        ArrayList<String> copy = (ArrayList<String>) arrl.clone();
        
        System.out.println("Cloned ArrayList:"+copy);
        
        System.out.println("\n-----------boolean contains(Object o)-----------");
        System.out.println(arrl.contains("Four")); 							// false
        System.out.println(arrl.contains("First")); 						// true
        
        System.out.println("\n-----------void ensureCapacity(int minCapacity)-----------");
        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
        // use add method to add elements
        arrlist.add(10);
        arrlist.add(50);
        // this will increase the capacity of the ArrayList to 6 elements
        arrlist.ensureCapacity(6);

        // let us print all the elements available in list
        for (Integer number : arrlist) {
        	System.out.println("Number = " + number);
        }
        
        System.out.println("\n-----------void forEach(Consumer<? super E> action)-----------");
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        //lambda
        items.forEach(item->{
        	if("C".equals(item)){
        		System.out.println(item);				//Output : C
        	}
        });
	    //lambda
	    items.forEach(item->System.out.println(item));	//Output : A,B,C,D,E
	    //method reference
	    items.forEach(System.out::println);				//Output : A,B,C,D,E
	    
	    System.out.println("\n-----------Iterator<E> iterator()-----------");
	    // create list
	    List<String> crunchifyList = new ArrayList<String>();
	    
	    // add 4 different values to list
 		crunchifyList.add("eBay");
 		crunchifyList.add("Paypal");
 		crunchifyList.add("Google");
 		crunchifyList.add("Yahoo");
 		
 		// iterate via "iterator loop"
		Iterator<String> crunchifyIterator = crunchifyList.iterator();
		while (crunchifyIterator.hasNext()) {
			System.out.println(crunchifyIterator.next());
		}
		
		System.out.println("-----------ListIterator<E> listIterator()-----------");
		// The ListIterator object is obtained using listIterator() method
		ListIterator it = crunchifyList.listIterator();
		System.out.println("Forward iteration :");
		while(it.hasNext())
			System.out.println(it.next());

		System.out.println("Backward iteration :");
		while(it.hasPrevious())
			System.out.println(it.previous());

		System.out.println("\n-----------ListIterator<E> 	listIterator(int index)-----------");
		// create an empty array list   
	    ArrayList<String> color_list = new ArrayList<String>();  
	    // use add() method to add values in the list  
	    color_list.add("White");  
	    color_list.add("Black");  
	    color_list.add("Red");
		// using listIterator() method get a ListIterator object  
	    //ListIterator itrf = color_list.listIterator(4); //java.lang.IndexOutOfBoundsException: Index: 4
	    ListIterator itrf = color_list.listIterator(0); 
	    ListIterator itrb = color_list.listIterator(1);
	    
	    //Use hasNext() and next() methods to iterate through the elements in 
	    //forward direction.  
	    System.out.println("Iterating in forward direction from 2nd position");  
	    while(itrf.hasNext())  
	    	System.out.println(itrf.next());  
	    // White Black Red
	   
	    // Use hasPrevious() and previous() methods to iterate through the 
	    //elements in backward direction.  
	    System.out.println("Iterating in backward direction from 2nd position");  
	    while(itrb.hasPrevious())  
	    	System.out.println(itrb.previous()); 
	    // White
	    System.out.println("\n-----------E remove(int index)-----------");
	    // create an empty array list with an initial capacity
	    ArrayList<String> arrList = new ArrayList<String>(5);

	    // use add() method to add values in the list
	    arrList.add("G");
	    arrList.add("E");
	    arrList.add("F");
	    arrList.add("M");
	    arrList.add("E");
	    
	    // Removes first occurrence of "E"
	    System.out.print("remove 0 : ");
	    System.out.println(arrList.remove(0));								// G
	    System.out.print("remove 5 : ");
	    //System.out.println(arrList.remove(5));							// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
	    System.out.println("\n-----------boolean remove(Object o)-----------");
	    System.out.print("remove E : ");
	    System.out.println(arrList.remove("E"));							// true
	    System.out.print("remove e : ");
	    System.out.println(arrList.remove("e"));							// false
	    System.out.print("remove A : ");
	    System.out.println(arrList.remove("A"));							// false
	    
	    System.out.println("\n-----------boolean removeAll(Collection<?> c)-----------");
	    // create an empty array sample with an initial capacity   
	    ArrayList<String> sample = new ArrayList<String>();  
	      
	    // use add() method to add values in the list   
	    sample.add("Green");   
	    sample.add("Red");   
	    sample.add("White");  
	    System.out.println("color_list : " + color_list);	// [White, Black, Red]
	    // remove all elements from second list if it exists in first list  
	    sample.removeAll(color_list);  
	      
	    System.out.println("First List :"+ color_list);  // [White, Black, Red]
	    System.out.println("Second List :"+ sample);  	 // [Green]
	    
	    System.out.println("\n-----------boolean removeIf(Predicate<? super E> filter)-----------");
	    color_list = new ArrayList<> ();  
	      
	    // use add() method to add values in the list  
	    color_list.add("White");  
	    color_list.add("Black");  
	    color_list.add("Red");  
	    color_list.add("White");  
	    color_list.add("Yellow");  
	    color_list.add("White");  
	      
	    System.out.println("List of Colors");  
	    System.out.println(color_list);  
	    
	    // Remove all White colors from color_list  
	    color_list.removeIf(t -> t.equals("White"));  
	      
	    System.out.println("Color list, after removing White colors :");  
	    System.out.println(color_list);  
	    
	    System.out.println("\n-----------protected void removeRange(int fromIndex, int toIndex)-----------");
	    System.out.println("-----------void replaceAll(UnaryOperator<E> operator)-----------");
	    color_list = new ArrayList<> (); 
	    UnaryOperator<String> unaryOpt = i -> "Whites"; 
	    // use add() method to add values in the list  
	    color_list.add("White");  
	    color_list.add("Black");  
	    color_list.add("Red");  
	    color_list.add("White");  
	    color_list.add("Yellow");  
	    color_list.add("White");
	    
	    System.out.println(color_list);										// [White, Black, Red, White, Yellow, White]	
	    
	    // Replace all colors with White color 
	    color_list.replaceAll(unaryOpt);
	    System.out.println(color_list);										// [Whites, Whites, Whites, Whites, Whites, Whites]
	    
	    System.out.println("\n-----------boolean retainAll(Collection<?> c)-----------");
	    // create an empty array list 
	    color_list = new ArrayList<String>(); 
	    // use add() method to add values in the list  
	    color_list.add("White");  
	    color_list.add("Black");  
	    color_list.add("Red");  
	    
	    // create an empty array sample with an initial capacity   
	    ArrayList<String> samples = new ArrayList<String>();  
	      
	    // use add() method to add values in the list   
	    samples.add("Green");   
	    samples.add("Red");   
	    samples.add("White");  
	          
	    System.out.println("First List :"+ color_list);  					// [White, Black, Red]
	    System.out.println("Second List :"+ samples);  						// [Green, Red, White]
	      
	    samples.retainAll(color_list);  
	      
	    System.out.println("After applying the method, First List :"+ color_list);	// [White, Black, Red]  
	    System.out.println("After applying the method, Second List :"+ samples);  	// [Red, White]
	    
	    System.out.println("\n-----------E set(int index, E element)-----------");
	    // create an empty array sample with an initial capacity  
	    arrList = new ArrayList<String>(5);
	    
	    // use add() method to add values in the list
	    arrList.add("A");
	    arrList.add("BB");
	    arrList.add("CCC");
	    arrList.add("DDDD");
	    arrList.add("EEEEE");
	    
	    System.out.print("set 2, ccc : ");
	    System.out.println(arrList.set(2, "ccc"));						 	// CCC
	    System.out.println(arrList);										// [A, BB, ccc, DDDD, EEEEE]
	    
	    System.out.println("-----------void sort(Comparator<? super E> c)-----------");
	    arrList.sort(new Comparator<String>() {
	        public int compare(String str1, String str2) {
	            if(str1.length() >= str2.length()) {
	            	return -1;
	            }else {
	            	return 1;
	            }
	        }
	    });
	    
	    System.out.println(arrList);										// [EEEEE, DDDD, ccc, BB, A]
	    
	    System.out.println("\n-----------Spliterator<E> spliterator()-----------");
	    ArrayList<Integer> number_List;  
	    Spliterator<Integer> mySpliterator;  
	    
	    number_List = new ArrayList<> ();  
	      
	    number_List.add(1);  
	    number_List.add(2);  
	    number_List.add(3);  
	      
	    mySpliterator = number_List.spliterator();  
	    System.out.println("Characteristics Of Spliterator are : "+mySpliterator.characteristics());
	    
	    System.out.println("\n-----------List<E> subList(int fromIndex, int toIndex)-----------");
	    // create an empty array list
	    color_list = new ArrayList<String>();
	    
	    // use add() method to add values in the list  
	    color_list.add("White");  
	    color_list.add("Black");  
	    color_list.add("Red");  
	    color_list.add("Green");  
	    color_list.add("Yellow");  
	    System.out.println("List of the colors :" + color_list);  
	     
	    //Return portion of the list : fromindex(inclusive)->1,  toindex(exclusive)->3  
	    ArrayList<String> new_color_list1 = new ArrayList<String>(color_list.subList(1, 3));  
	    System.out.println("Portion of the list: "+new_color_list1);  
	  
	    //Return empty list as fromindex and toindex are equal  
	    ArrayList<String> new_color_list2 = new ArrayList<String>(color_list.subList(3, 3));  
	    System.out.println("Portion of the list: "+new_color_list2);
	     
	    System.out.println("-----------Object[] toArray()-----------");
	    // Print the colors in the list  
	    for (String value : color_list) {  
	    	System.out.println("Color = " + value);  
	    }    
	    // Create an array from the ArrayList  
	    Object[] obj = color_list.toArray();  
	  
	    // Display the contents of the array  
	    System.out.println("Printing elements from first to last:");   
	    for (Object value : obj) {  
	     	System.out.println("Color = " + value);  
	    }  
	    
	    System.out.println("-----------<T> T[] toArray(T[] a)-----------");
	    // create an empty array list with an initial capacity
	    color_list = new ArrayList<String>(5);  
	    
	    // use add() method to add values in the list  
	    color_list.add("White");  
	    color_list.add("Black");  
	    color_list.add("Red");  
	    color_list.add("White");  
	    color_list.add("Yellow");  
	      
	    System.out.println("Size of the color_list: " + color_list.size());  
	  
	    // Print the colors in the list  
	    for (String value : color_list){  
	    	System.out.println("Color = " + value);  
	    }    
	    // Create an array from the ArrayList  
	    String color_list2[] = new String[color_list.size()];  
	    color_list2 = color_list.toArray(color_list2);  
	           
	    // Display the contents of the array  
	    System.out.println("Printing elements of color_list2:");   
	    for (String color : color_list2) {  
	    	System.out.println("Color = " + color);  
	    }  
	    
	    System.out.println("-----------void trimToSize()-----------");
	    // create an empty array list with capacity 50  
	    ArrayList<Integer> myArray = new ArrayList<Integer>(50);  
	  
	    // Only add four elements to the ArrayList.  
	    myArray.add(new Integer(10));  
	    myArray.add(new Integer(22));  
	    myArray.add(new Integer(30));  
	    myArray.add(new Integer(40));  
	  
	    // Trim the ArrayList down to size.  
	    myArray.trimToSize();  
	          
	    // Print all the elements available in list  
	    for (Integer number : myArray) {  
	      System.out.println("Number = " + number);  
	    }  
	    
	    String[] arr = {"a", "b", "c", "d"};
	    List<String> createlist1 = Arrays.asList(arr);
	    
	    List<String> createlist2 = Arrays.asList("a", "b", "c", "d");
	}
}
