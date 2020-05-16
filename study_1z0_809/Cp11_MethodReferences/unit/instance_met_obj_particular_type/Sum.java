package com.wealth.certificate.study_1z0_809.chapter11.unit.instance_met_obj_particular_type;

public class Sum {
	Integer doSum(String s1, String s2) {
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
	public static void main(String[] args) {
		TriFunction<Sum, String, String, Integer> anon =
		    new TriFunction<Sum, String, String, Integer>() {
		        @Override
		        public Integer apply(Sum s, String arg1, String arg2) {
		           return s.doSum(arg1, arg2);
		        }
		    };
		System.out.println(anon.apply(new Sum(), "1", "4"));
		
		TriFunction<Sum, String, String, Integer> lambda =
			    (Sum s, String arg1, String arg2) -> s.doSum(arg1, arg2);
		System.out.println(lambda.apply(new Sum(), "1", "4"));
			
		TriFunction<Sum, String, String, Integer> mRef = Sum::doSum;
		System.out.println(mRef.apply(new Sum(), "1", "4"));
	}
}
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}