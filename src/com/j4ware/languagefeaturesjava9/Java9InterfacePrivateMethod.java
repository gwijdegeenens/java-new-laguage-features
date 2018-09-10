package com.j4ware.languagefeaturesjava9;

public interface Java9InterfacePrivateMethod {
    
    private static String staticPrivate() {
        return "static private";
    }

    private String instancePrivate() {
        return "instance private";
    }

    default void check() {
        String result = staticPrivate();
        System.out.println(result);
        Java9InterfacePrivateMethod pvt = new Java9InterfacePrivateMethod() {
            // anonymous class
        };
        System.out.println(pvt.instancePrivate());
    }
}
