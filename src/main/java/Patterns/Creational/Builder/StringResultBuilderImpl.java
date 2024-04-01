package Patterns.Creational.Builder;

public class StringResultBuilderImpl implements StringResultBuilder{

    MyStringBuilder result;

    public StringResultBuilderImpl() {
        this.result = new MyStringBuilder();
    }

    @Override
    public void append(String str) {
        result.append(str);
    }

    @Override
    public MyStringBuilder build() {
        return result;
    }

}
