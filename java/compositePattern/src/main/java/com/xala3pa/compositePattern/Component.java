package com.xala3pa.compositePattern;

abstract class Component {
    void add(Component formComponent) {
        throw new UnsupportedOperationException();
    }

    void remove(Component formComponent) {
        throw new UnsupportedOperationException();
    }

    Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

    void print() {
        throw new UnsupportedOperationException();
    }
}
