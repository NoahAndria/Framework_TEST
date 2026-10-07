package controllers;

import myframework.annotations.Controller;
import myframework.annotations.RestAPI;
import myframework.annotations.UrlMapping;

import myframework.utils.ModelView;

import entities.Jouet;

import java.util.Arrays;
import java.util.List;

@Controller
public class Test1Controller {

    @UrlMapping(name = "/dobe", method = "GET")
    public ModelView test() {
        System.out.println("\n test of test1controller in get ");

        ModelView mv = new ModelView("form");

        // List<String> names = Arrays.asList("Jean", "Rakoto", "Tahiry", "Noah", "TEST");

        // mv.addAttribute("names", names);

        return mv;
    }

    @UrlMapping(name = "/dobe2", method = "GET")
    public ModelView test1(Jouet j, String randomInput) {
        System.out.println("\n test of test1controller in get ");
        ModelView mv = new ModelView("result");
        mv.addAttribute("jouet", j);
        mv.addAttribute("randomInput", randomInput);
        return mv;
    }

    // @UrlMapping(name = "/andrana", method = "GET")
    // public ModelView hehe() {
    //     System.out.println("\n test of test1controller in get ");

    //     ModelView mv = new ModelView("random2");

    //     List<String> names = Arrays.asList("Jean", "Rakoto", "Tahiry", "Noah");

    //     mv.addAttribute("names", names);

    //     return mv;
    // }

    // @UrlMapping(name = "/testapi", method = "GET")
    // @RestAPI
    // public List<Jouet> hi() {
    //     System.out.println("\n test of test1controller in get ");

    //     List<Jouet> jouets = Arrays.asList(
    //         new Jouet("Voiture", 2000, "Fiara kely"),
    //         new Jouet("Puzzle", 12000, "Puzzle 1000 piece"),
    //         new Jouet("Ballon", 5000, "Ballon rouge")
    //     );

    //     return jouets;
    // }

    // @UrlMapping(name = "/testapistr", method = "GET")
    // @RestAPI
    // public String histr() {
    //     System.out.println("\n test of test1controller in get ");


    //     return "test api reussi";
    // }
}