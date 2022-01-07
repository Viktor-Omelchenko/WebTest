package ru.netology.web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

class WebCardTest {

       @Test
        void shouldSubmitRequest() {

            Configuration.holdBrowserOpen = true;

            open("http://localhost:7777/");
            $$("[data-test-id=name] input").last().setValue("Иван Иванов");
            $$("[data-test-id=phone] input").last().setValue("+79999999999");
            $("[data-test-id=agreement]").click();
            $$("button").find(exactText("Продолжить")).click();


        }
    }
