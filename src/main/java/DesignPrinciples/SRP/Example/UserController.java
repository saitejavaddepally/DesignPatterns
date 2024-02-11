package DesignPrinciples.SRP.Example;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	//Store used by controller
    private Store store = new Store();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {

        if(userJson == null) {
            return "ERROR";
        }


        return "SUCCESS";
    }



}