package com.utest2.tasks.register;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static com.utest2.ui.RegisterUi.BTN_JOIN;


public class JoinToday implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_JOIN)

        );
    }

    public static JoinToday Click() {
        return Tasks.instrumented(JoinToday.class);
    }
}
