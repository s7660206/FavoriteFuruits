package com.example.favoritefruits.controller;

import com.example.favoritefruits.domain.Fruit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class FavoriteFruitsController {

    @RequestMapping ("/list")

    public String list(Model model) {
        List<Fruit> fruitsList = new ArrayList<>();
        fruitsList.add(new Fruit (1, "もも", "説明"));
        fruitsList.add(new Fruit (2, "バナナ", "説明"));
        model.addAttribute("fruitsList",fruitsList);

        return "list";
    }

}
