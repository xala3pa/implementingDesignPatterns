package com.xala3pa.iteratorPattern;

import java.util.*;

public class Library {
    public static void main(String[] args) {

        HashMap<String, Iterable> allBooks = new HashMap<String, Iterable>();
        allBooks.put("IT books",  new ITBookRepository());
        allBooks.put("Novels",  new ITBookRepository());

        java.util.Iterator booksIterator = allBooks.entrySet().iterator();
        while (booksIterator.hasNext()) {
            Map.Entry pair = (Map.Entry)booksIterator.next();
            Iterable iterable = (Iterable) pair.getValue();
            for(Iterator iter = iterable.getIterator(); iter.hasNext();){
                String book = (String)iter.next();
                System.out.println(pair.getKey() + " : " + book);
            }
        }
    }
}
