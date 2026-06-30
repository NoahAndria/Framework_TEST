package controllers;

import annotations.Controller;
import annotations.UrlMapping;

@Controller
public class Test1Controller {

    @UrlMapping(name = "/dobescoobdanoobooo", method="GET")
    public String test() {
        System.out.println("\n test of test1controller in get ");
        return "test";
    }
}