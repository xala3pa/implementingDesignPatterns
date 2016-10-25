package com.xala3pa

import com.xala3pa.decorator.Form
import com.xala3pa.decorator.decorators.CheckboxDecorator
import com.xala3pa.decorator.decorators.FormDecorator
import com.xala3pa.decorator.decorators.InputFieldDecorator
import spock.lang.Specification

class PaintAppSpec extends Specification {

    Form formToBeDecorated = Mock()

    def "Should decorate a Form with a formDecorator "() {
        given: "a generic form decorator"
        FormDecorator formDecorator = new FormDecorator(formToBeDecorated)

        when: "the form is drawn"
        formDecorator.draw()

        then: "the form to be decorated is drawn too"
        1 * formToBeDecorated.draw()
    }

    def "Should decorate a Form with checkbox and input field"() {
        given: "a checkbox decorator and a input filed decorator"
        FormDecorator checkboxDecorator = new CheckboxDecorator(formToBeDecorated)
        FormDecorator inputFieldDecorator = new InputFieldDecorator(checkboxDecorator)

        when: "the form is decorated"
        inputFieldDecorator.draw()

        then: "the form to be decorated is drawn too"
        1 * formToBeDecorated.draw()
    }
}