package com.xala3pa.decorator.decorators;

import com.xala3pa.decorator.Form;

public class FormDecorator implements Form {
    protected Form formToBeDecorated;

    public FormDecorator(Form formToBeDecorated) {
        this.formToBeDecorated = formToBeDecorated;
    }

    @Override
    public void draw() {
        formToBeDecorated.draw();
    }

    @Override
    public String getDescription() {
        return formToBeDecorated.getDescription();
    }
}
