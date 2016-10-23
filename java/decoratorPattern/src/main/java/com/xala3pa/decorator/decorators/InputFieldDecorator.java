package com.xala3pa.decorator.decorators;

import com.xala3pa.decorator.Form;

public class InputFieldDecorator extends FormDecorator {
    public InputFieldDecorator(Form formToBeDecorated) {
        super(formToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        drawInputField();
    }

    private void drawInputField() {
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", With a new input field";
    }
}
