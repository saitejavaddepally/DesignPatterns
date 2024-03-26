package Patterns.Creational.Factory.impl.creator;


import Patterns.Creational.Factory.impl.product.Button;

// creator
public abstract class Dialog {

    public void render(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton() ;
}
