package com.example.favoritefruits.mapper;

import com.example.favoritefruits.domain.FavoriteFruitCondition;
import com.example.favoritefruits.domain.Fruit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FavoriteFruitsMapper {
    public List<Fruit> selectAll();

    public List<Fruit> selectByCondition(FavoriteFruitCondition condition);

}
