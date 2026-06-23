package controllers;

import annotations.Controller;
import annotations.UrlMapping;
import jdk.jfr.Category;

@Controller
public class Test2Controller {

    @UrlMapping(name = "/youaregoodenough")
    public String test() {
        return "test";
    }

    @UrlMapping(name = "/andrana")
    public String andrana() {
        return "test";
    }
}