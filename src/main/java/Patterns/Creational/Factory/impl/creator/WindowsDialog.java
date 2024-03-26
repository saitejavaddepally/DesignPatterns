package Patterns.Creational.Factory.impl.creator;

import Patterns.Creational.Factory.impl.product.Button;
import Patterns.Creational.Factory.impl.product.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
