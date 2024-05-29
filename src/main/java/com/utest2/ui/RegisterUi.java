package com.utest2.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUi {
    public static final Target BTN_JOIN = Target.the("btn join today").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target FIRSTNAME = Target.the("input first name").locatedBy("//input[@id='firstName']");
    public final static Target LASTNAME = Target.the("input last name").locatedBy("//input[@id='lastName']");
    public final static Target EMAIL = Target.the("input email").locatedBy("//input[@name='email']");
    public final static Target MONTH = Target.the("select month").locatedBy("//select[@id='birthMonth']");
    public final static Target DAY = Target.the("select day").locatedBy("//select[@id='birthDay']");

    public final static Target YEAR = Target.the("select year").locatedBy("//select[@id='birthYear']");
    public final static Target LANGUAGE = Target.the("input language").locatedBy("//input[@type='search']");
    public final static Target NEXT_LOCATION = Target.the("button next location").locatedBy(".btn-blue");


    //select[@id='birthYear']
}
