package com.example.randomnumbergenerator.controller;

import com.example.randomnumbergenerator.model.NumberRange;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller
public class RandomNumberController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("numberRange", new NumberRange());
        return "index";
    }

    @PostMapping("/generate")
    public String generateRandomNumber(@ModelAttribute NumberRange numberRange, Model model) {
        int min = numberRange.getMin();
        int max = numberRange.getMax();

        // Validate input
        if (min >= max) {
            model.addAttribute("error", "Minimum must be less than maximum");
            return "index";
        }

        // Generate random number
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        model.addAttribute("randomNumber", randomNumber);
        model.addAttribute("numberRange", numberRange);
        return "index";
    }
}