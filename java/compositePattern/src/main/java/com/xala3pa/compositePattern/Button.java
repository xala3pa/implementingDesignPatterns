package com.xala3pa.compositePattern;

public class Button extends Component {
    String caption;

    public Button(String caption) {
        this.caption = caption;
    }

    @Override
    void print() {
        System.out.println("Printing " + caption + " button");
    }
}
