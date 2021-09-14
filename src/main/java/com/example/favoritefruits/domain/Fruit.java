package com.example.favoritefruits.domain;

public class Fruit {

    private Integer id;        //果物ID
    private String fruitName;  //果物名
    private String memo;

    public Fruit(Integer id, String fruitName, String memo){
        this.id = id;
        this.fruitName = fruitName;
        this.memo = memo;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
