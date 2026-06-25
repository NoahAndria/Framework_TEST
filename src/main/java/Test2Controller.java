package controllers;

import annotations.Controller;
import annotations.UrlMapping;
import jdk.jfr.Category;

@Controller
public class Test2Controller {

    @UrlMapping(name = "/youaregoodenough", method="POST")
    public String test() {
        return "test";
    }

    @UrlMapping(name = "/andrana", method="GET")
    public String andrana() {
        return "test";
    }
}