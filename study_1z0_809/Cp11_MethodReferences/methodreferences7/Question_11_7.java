package com.wealth.certificate.study_1z0_809.chapter11.methodreferences7;

public class Question_11_7 {
   private Question_11_7() {}
   public static Question_11_7 create() {
       return new Question_11_7();
   }
   public static void main(String args[]) {
       // 1
   }
}

/*
Which of the following method references can be used to get instances of class Question_11_7 at line // 1?
	xA. Supplier<Question_11_7> s = Question_11_7::new;
	B. UnaryOperator<Question_11_7> u = Question_11_7::create;
	C. Consumer<Question_11_7> c = Question_11_7::create;
	xD. Supplier<Question_11_7> s = Question_11_7::create;
*/