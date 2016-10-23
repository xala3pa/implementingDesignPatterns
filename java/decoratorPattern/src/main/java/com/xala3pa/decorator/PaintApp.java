package com.xala3pa.decorator;

import com.xala3pa.decorator.decorators.CheckboxDecorator;
import com.xala3pa.decorator.decorators.InputFieldDecorator;

public class PaintApp {
    public static void main(String[] args) {
        Form simpleFormDecorated = new CheckboxDecorator(new InputFieldDecorator(new SimpleForm()));

        System.out.println(simpleFormDecorated.getDescription());
    }
}
