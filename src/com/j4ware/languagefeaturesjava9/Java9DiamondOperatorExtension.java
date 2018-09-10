package com.j4ware.languagefeaturesjava9;

public class Java9DiamondOperatorExtension {
    
    public static void main(String... args) {
        
        FooClass<Integer> fc = new FooClass<>(1);

        System.out.println(fc.value());
        System.out.println(fc.value().getClass());
                
        FooClass<? extends Integer> fc0 = new FooClass<>(2);

        System.out.println(fc0.value());
        System.out.println(fc0.value().getClass());

        FooClass<?> fc1 = new FooClass<>(3);

        System.out.println(fc1.value());
        System.out.println(fc1.value().getClass());
    }
}


class FooClass<T>{

    private T value;
            
    public FooClass(T value) {
        this.value = value;
    }

    public T value() {
        return value;
    }
}

