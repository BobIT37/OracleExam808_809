package com.wealth.certificate.study_1z0_809.chapter06.Generic03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public interface GenericClasses<E> extends Collection<E> {
    boolean add(E e);
    Iterator<E> iterator();
    
    /*common letters are:
    	- E for element
    	- K for a map key
    	- V for a map value
    	- T, U for data types
    */
    
    //------------Example element-------------
    List<String> list = null; //E is given the value of String, and wherever the type E is defined, String will be used.
}

//---------Example Map Key and Value---------------------------
class KeyAndValue<K,V>{
	Map<K,V> map = new HashMap<K, V>();
	   public static void main(String[] args) {
		  KeyAndValue<Integer, String> testMap = new KeyAndValue<Integer, String>();
		  testMap.genMap(testMap);
	   }
	
	Map <K,V> genMap(KeyAndValue<Integer, String> testMap){
		//do something
		return map;
		
	}	
}

//---------------Example Data type -------------------------
class DataType<T, U> {
	   private T t;
	   private U u;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }
	   
	   public void addU(U u) {
		      this.u = u;
		   }

		   public U getU() {
		      return u;
		   }
	  

	   public static void main(String[] args) {
		  DataType<Integer, String> integerString = new DataType<Integer, String>();
		  DataType<String, Integer> StringInteger = new DataType<String, Integer>();
	    
		  integerString.add(new Integer(10));
		  integerString.addU("Hi");
		  
		  StringInteger.add(new String("Hello World"));
		  StringInteger.addU(new Integer(20));
	      
	      System.out.printf("integerString :%d\n\n", integerString.get() + integerString.getU());
	      System.out.printf("StringInteger :%s\n", StringInteger.get() + StringInteger.getU());
	   }
	}

//----------Example Class Holder String----------------
class HolderString {
    private String s;
    public HolderString(String s) {
        this.s = s;
    }
    public String getObject() {
        return s;
    }
    public void printObject() {
        System.out.println(s);
    }
}
// Change to Generic
class Holder<T> {
    private T t;
    public Holder(T t) {
        this.t = t;
    }
    public T getObject() {
        return t;
    }
    public void printObject() {
        System.out.println(t);
    }
}

