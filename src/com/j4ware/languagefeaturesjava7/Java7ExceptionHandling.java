package com.j4ware.languagefeaturesjava7;

public class Java7ExceptionHandling {
    
    public static void main(String... args) {

        try {
            aMethod();
        } catch (MyExceptionType1 | MyExceptionType2 e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
        
    }
    
    private static void aMethod() throws MyExceptionType1, MyExceptionType2{
        throw new MyExceptionType2("fout");
    }
}
