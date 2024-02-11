package FactoryMethodPattern.Factory;

import FactoryMethodPattern.Factory.product.Message;

public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    public abstract Message createMessage();
}
