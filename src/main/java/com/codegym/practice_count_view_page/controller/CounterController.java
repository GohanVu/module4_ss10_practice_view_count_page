package com.codegym.practice_count_view_page.controller;

import com.codegym.practice_count_view_page.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CounterController {

    @ModelAttribute("counter")
    public Counter setUpCounter() {
        return new Counter();
    }

    @GetMapping
    public String get(@ModelAttribute("counter") Counter counter) {
        counter.increment();
        return "views/index";
    }
}