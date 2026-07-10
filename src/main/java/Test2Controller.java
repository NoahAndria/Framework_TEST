package controllers;

import annotations.Controller;
import annotations.UrlMapping;
import jdk.jfr.Category;

@Controller
public class Test2Controller {

    @UrlMapping(name = "/youaregoodenough", method="POST")
    public String test() {
        System.out.println("\n test of test2controller in post ");

        return "test";
    }


}