package com.xala3pa.decorator.decorators;

import com.xala3pa.decorator.Form;

public class CheckboxDecorator extends FormDecorator {
    public CheckboxDecorator(Form formToBeDecorated) {
        super(formToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        drawCheckbox();
    }

    private void drawCheckbox() {
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with a new checkbox";
    }
}
