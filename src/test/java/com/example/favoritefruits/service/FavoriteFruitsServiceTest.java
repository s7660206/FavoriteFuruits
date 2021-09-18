package com.example.favoritefruits.service;

import com.example.favoritefruits.domain.FavoriteFruitCondition;
import com.example.favoritefruits.domain.Fruit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FavoriteFruitsServiceTest {

    @Autowired
    FavoriteFruitsService target;

    @Test
    void 好きな果物リストが検索できること() {
        List<Fruit> result = target.getFavoriteFruits();
        assertThat(result.size()).isEqualTo(3);

        Fruit fruit1 = result.get(0);
        assertThat(fruit1.getFruitName()).isEqualTo("メロン");
        assertThat(fruit1.getMemo()).isEqualTo("高い");


    }

    @Test
    void 該当する果物リストが検索されること() {

        FavoriteFruitCondition condition = new FavoriteFruitCondition();
        condition.setFruitName("メロ");

        List<Fruit> result = target.getFavoriteFruitsByCondition(condition);
        assertThat(result.size()).isEqualTo(1);

    }
}