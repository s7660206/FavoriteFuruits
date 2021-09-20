package com.example.favoritefruits.controller;

import com.example.favoritefruits.domain.FavoriteFruitCondition;
import com.example.favoritefruits.domain.Fruit;
import com.example.favoritefruits.service.FavoriteFruitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class FavoriteFruitsController {

    @Autowired
    FavoriteFruitsService service;

    @RequestMapping ("/list")
    public String list(Model model) {

        List<Fruit> fruitsList = service.getFavoriteFruits();
        model.addAttribute("favoriteFruitCondition",new FavoriteFruitCondition());
        model.addAttribute("fruitsList",fruitsList);

        return "list";
    }

    @RequestMapping ("/search")
    public String search(@Validated FavoriteFruitCondition condition, Model model) {
        //FavoriteFruitCondition condition = new FavoriteFruitCondition();
        //condition.setFruitName("メロ");
        List<Fruit> fruitsList = service.getFavoriteFruitsByCondition(condition);
        model.addAttribute("fruitsList",fruitsList);

        return "list";
    }
}
