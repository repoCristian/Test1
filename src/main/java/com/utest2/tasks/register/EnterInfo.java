package com.utest2.tasks.register;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.ui.Dropdown;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static com.utest2.ui.RegisterUi.*;


public class EnterInfo implements Task {

    private DataTable data;

    public EnterInfo(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> values = data.asMaps(String.class, String.class);

        actor.attemptsTo(

                Enter.theValue(values.get(0).get("FirstName")).into(FIRSTNAME),
                Enter.theValue(values.get(0).get("LastName")).into(LASTNAME),
                Enter.theValue(values.get(0).get("Email")).into(EMAIL),
                SelectFromOptions.byVisibleText(values.get(0).get("Month")).from(MONTH),
                SelectFromOptions.byVisibleText(values.get(0).get("Day")).from(DAY),
                SelectFromOptions.byVisibleText(values.get(0).get("Year")).from(YEAR),
                Enter.theValue(values.get(0).get("Language")).into(LANGUAGE),
                Hit.the(Keys.ENTER).into(LANGUAGE),
                Click.on(NEXT_LOCATION)


        );
    }

    public static EnterInfo Form(DataTable data) {
        return Tasks.instrumented(EnterInfo.class, data);
    }
}
