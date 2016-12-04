package com.xala3pa.iteratorPattern;

import java.util.Stack;

public class NovelRepository implements Iterable{
    Stack<String> novels = new Stack<String>();

    public NovelRepository() {
        novels.add("To Kill a Mockingbird");
        novels.add("Animal Farm");
        novels.add("Fahrenheit 451");
        novels.add("A Game of Thrones");
    }

    public Iterator getIterator() {
        return new NovelIterator();
    }

    private class NovelIterator implements Iterator {

        public boolean hasNext() {
            return !novels.isEmpty();
        }

        public Object next() {
            if (hasNext()) {
                return novels.pop();
            }

            return new Stack<String>();
        }
    }
}
