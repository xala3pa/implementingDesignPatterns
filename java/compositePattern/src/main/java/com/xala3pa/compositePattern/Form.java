package com.xala3pa.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Form extends Component {
    private List<Component> formComponents = new ArrayList<>();

    @Override
    void add(Component formComponent) {
        formComponents.add(formComponent);
    }

    @Override
    void remove(Component formComponent) {
        formComponents.remove(formComponent);
    }

    @Override
    Component getChild(int index) {
       return formComponents.get(index);
    }

    @Override
    void print() {
       for (Component component: formComponents) {
           component.print();
       }
    }
}
