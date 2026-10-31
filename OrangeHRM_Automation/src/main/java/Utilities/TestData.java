package Utilities;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "login")
    public Object[][] login(){
        return new Object[][]{
                {"newuser6886@yopmail.com", "Password123"},
                {"yeneupopummou-7135@yopmail.com", "Password1234"},
                {"nevoceinoiju-8806@yopmail.com", "Password123"},
                {"20Novtest05@yopmail.com", "Password123"}
        };
    }
}
