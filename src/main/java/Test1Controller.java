package controllers;

import annotations.Controller;
import annotations.UrlMapping;

@Controller
public class Test1Controller {

    @UrlMapping(name = "/dobescoobdanoobooo")
    public String test() {
        return "test";
    }
}