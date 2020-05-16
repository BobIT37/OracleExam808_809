package com.wealth.certificate.study_1z0_809.chapter09.lembdatest;

@FunctionalInterface
interface SimpleInterface {
    public String retrieveValue();
}

public class LambdaThis {
    String value="default value";
     
    public SimpleInterface createLambdaInterface(){
        SimpleInterface si=()->{
            String value="lambda value";
            return this.value;
        };
         
        return si;
    }
     
    public SimpleInterface createAnonymousInterface(){
        SimpleInterface si=new SimpleInterface(){
            String value="anonymous value";
             
            public String retrieveValue(){
                return this.value;
            }
        };
         
        return si;
    }
     
    public static void main(String[] args){
        LambdaThis lt=new LambdaThis();
         
        SimpleInterface lambdaInterface=lt.createLambdaInterface();
        SimpleInterface anonymousInterface=lt.createAnonymousInterface();
         
        System.out.println("Lambda interface value : "+lambdaInterface.retrieveValue());
        System.out.println("Anonymous interface value : "+anonymousInterface.retrieveValue());
    }
}
