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

        ModelView mv = new ModelView("random");

        List<String> names = Arrays.asList("Jean", "Rakoto", "Tahiry", "Noah", "TEST");

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

    @UrlMapping(name = "/testapi", method = "GET")
    @RestAPI
    public List<Jouet> hi() {
        System.out.println("\n test of test1controller in get ");

        List<Jouet> jouets = Arrays.asList(
            new Jouet("Voiture", 10.0, "Une voiture en plastique"),
            new Jouet("Puzzle", 15.0, "Un puzzle de 1000 pièces"),
            new Jouet("Ballon", 5.0, "Un ballon rouge")
        );

        return jouets;
    }
}