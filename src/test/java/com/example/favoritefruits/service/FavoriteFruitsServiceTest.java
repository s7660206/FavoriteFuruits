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

        Fruit fruit1 = result.get(0);
        assertThat(fruit1.getFruitName()).isEqualTo("メロン");
        assertThat(fruit1.getMemo()).isEqualTo("高い");

    }

    @Test
    void 検索条件に入力がない場合全件検索されること() {

        FavoriteFruitCondition condition = new FavoriteFruitCondition();

        List<Fruit> result = target.getFavoriteFruitsByCondition(condition);
        assertThat(result.size()).isEqualTo(3);

        Fruit fruit1 = result.get(0);
        assertThat(fruit1.getFruitName()).isEqualTo("メロン");
        assertThat(fruit1.getMemo()).isEqualTo("高い");

        Fruit fruit2 = result.get(1);
        assertThat(fruit2.getFruitName()).isEqualTo("さくらんぼ");
        assertThat(fruit2.getMemo()).isEqualTo("赤い");

        Fruit fruit3 = result.get(2);
        assertThat(fruit3.getFruitName()).isEqualTo("マスカット");
        assertThat(fruit3.getMemo()).isEqualTo("丸いよ");
    }
}