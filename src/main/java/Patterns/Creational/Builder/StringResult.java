package Patterns.Creational.Builder;

public class StringResult {

    private String result;

    public StringResult(){
       this.result = "" ;
    }

    public void append(String str){
        result += str;
    }

    @Override
    public String toString(){
        return result;
    }
}
