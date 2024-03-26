package Patterns.Creational.Factory.impl.creator;

import Patterns.Creational.Factory.impl.product.Button;
import Patterns.Creational.Factory.impl.product.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
