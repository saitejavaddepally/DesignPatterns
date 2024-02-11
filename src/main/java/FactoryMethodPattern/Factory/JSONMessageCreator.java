package FactoryMethodPattern.Factory;

import FactoryMethodPattern.Factory.product.JSONMessage;
import FactoryMethodPattern.Factory.product.Message;

public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
