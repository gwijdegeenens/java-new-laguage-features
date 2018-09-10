package com.j4ware.languagefeaturesjava9;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Optional.*;

public class Java9NewAPI {
    
    public static void main(String... arg) {
        Set<String> strKeySet = Set.of("key1", "key2", "key3");
        System.out.println(strKeySet);

        List<String> strList = List.of("key1", "key2", "key3");
        System.out.println(strList);


        List<Optional<String>> listOfOptionals = List.of(of("key1"), empty(), of("key2"), empty(), of("key3"));
        List<String> filteredListInJava8 = listOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        System.out.println(filteredListInJava8);
        
        
        List<String> filteredListInJava9 = listOfOptionals.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        System.out.println(filteredListInJava9);
    }
}
