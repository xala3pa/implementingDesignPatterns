package com.xala3pa.compositePattern;

public class Browser {
    public static void main(String[] args) {
        Button payButton = new Button("Pay");
        Button nextButton = new Button("next");

        Checkbox checkbox = new Checkbox();

        Form checkoutForm = new Form();
        Form paymentForm = new Form();

        Window browserWindow = new Window();

        checkoutForm.add(payButton);
        checkoutForm.add(nextButton);

        paymentForm.add(payButton);
        paymentForm.add(nextButton);
        paymentForm.add(checkbox);

        browserWindow.add(checkoutForm);
        browserWindow.add(paymentForm);

        browserWindow.print();
    }
}
