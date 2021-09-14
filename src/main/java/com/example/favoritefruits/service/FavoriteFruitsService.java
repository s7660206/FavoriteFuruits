package com.example.favoritefruits.service;

import com.example.favoritefruits.domain.Fruit;
import com.example.favoritefruits.mapper.FavoriteFruitsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteFruitsService {

    @Autowired
    FavoriteFruitsMapper mapper;

    public FavoriteFruitsService(){
        System.out.println("サービスのコンストラクタ呼ばれました");
    }

    public List<Fruit> getFavoriteFruits(){
        return mapper.selectAll();
    }
}
