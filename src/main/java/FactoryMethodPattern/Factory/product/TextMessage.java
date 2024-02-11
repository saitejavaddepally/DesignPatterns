package FactoryMethodPattern.Factory.product;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "text";
    }
}
