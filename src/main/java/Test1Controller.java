package controllers;

import annotations.Controller;
import annotations.UrlMapping;
import myframework.utils.ModelView;

import java.util.Arrays;
import java.util.List;

@Controller
public class Test1Controller {

    @UrlMapping(name = "/dobe", method = "GET")
    public ModelView test() {
        System.out.println("\n test of test1controller in get ");

        ModelView mv = new ModelView("random");

        List<String> names = Arrays.asList("Jean", "Rakoto", "Tahiry", "Noah");

        mv.addAttribute("names", names);

        return mv;
    }

    @UrlMapping(name = "/andrana", method = "GET")
    public ModelView hehe() {
        System.out.println("\n test of test1controller in get ");

        ModelView mv = new ModelView("random2");

        List<String> names = Arrays.asList("Jean", "Rakoto", "Tahiry", "Noah");

        mv.addAttribute("names", names);

        return mv;
    }
}