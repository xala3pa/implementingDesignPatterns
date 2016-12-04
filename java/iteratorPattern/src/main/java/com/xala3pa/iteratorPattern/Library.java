package com.xala3pa.iteratorPattern;

public class Library {
    public static void main(String[] args) {
        ITBookRepository itBookRepository = new ITBookRepository();
        NovelRepository novelRepository = new NovelRepository();

        for(Iterator iter = itBookRepository.getIterator(); iter.hasNext();){
            String book = (String)iter.next();
            System.out.println("IT Book : " + book);
        }

        for(Iterator iter = novelRepository.getIterator(); iter.hasNext();){
            String book = (String)iter.next();
            System.out.println("Novel : " + book);
        }

    }
}
