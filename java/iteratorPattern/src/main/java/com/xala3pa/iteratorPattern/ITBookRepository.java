package com.xala3pa.iteratorPattern;

public class ITBookRepository implements Iterable {
    String[] itBooks = {"Code Complete 2", "The Mythical Man-Month",
            "Peopleware", "The Pragmatic Programmer: From Journeyman to Master"};

    public Iterator getIterator() {
        return new ITBooksIterator();
    }

    private class ITBooksIterator implements Iterator {
        int index;

        public boolean hasNext() {
            return index < itBooks.length;

        }

        public Object next() {
            if (hasNext()){
                return itBooks[index++];
            }
            return new String[]{};
        }
    }
}
