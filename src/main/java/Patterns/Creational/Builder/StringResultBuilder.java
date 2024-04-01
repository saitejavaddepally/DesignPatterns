package Patterns.Creational.Builder;

public interface StringResultBuilder {
    void append(String str);
    MyStringBuilder build();
}
