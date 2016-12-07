package com.xala3pa.compositePattern

import spock.lang.Specification


class BrowserSpec extends Specification {

    Form form = new Form()
    Window browserWindow = new Window()

    def "should traverse all composite structure to print elements"(){
        given: "a button and a checkbox"
        Button button = Mock()
        Checkbox checkbox = Mock()

        when: "we add to a composite form in the browser window"
        form.add(button)
        form.add(checkbox)
        browserWindow.add(form)
        browserWindow.print()

        then: "the button and checkbox are printed"
        1 * checkbox.print()
        1 * button.print()
    }

    def "should traverse only elements added to the structure to print these elements"(){
        given: "a button and a checkbox"
        Button button = Mock()
        Checkbox checkbox = Mock()

        when: "we add to a composite form in the browser window"
        form.add(button)
        browserWindow.add(form)
        browserWindow.print()

        then: "the button and checkbox are printed"
        0 * checkbox.print()
        1 * button.print()
    }
}