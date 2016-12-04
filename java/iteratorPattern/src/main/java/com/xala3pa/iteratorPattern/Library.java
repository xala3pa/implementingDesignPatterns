package com.xala3pa.iteratorPattern;

public class Library {
    public static void main(String[] args) {
        ITBookRepository itBookRepository = new ITBookRepository();

        for(Iterator iter = itBookRepository.getIterator(); iter.hasNext();){
            String book = (String)iter.next();
            System.out.println("Book : " + book);
        }
    }
}
