package FactoryMethodPattern.Factory;

import FactoryMethodPattern.Factory.product.Message;
import FactoryMethodPattern.Factory.product.TextMessage;

public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
