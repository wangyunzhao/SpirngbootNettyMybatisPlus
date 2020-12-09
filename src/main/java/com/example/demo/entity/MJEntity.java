package com.example.demo.entity;

/**
 * @program: demo
 * @description:
 * @author: YunZhao.Wang
 * @create: 2020-12-09 13:54
 **/
public class MJEntity {
    public MJEntity.pubDateEnum getPubDateEnum() {
        return pubDateEnum;
    }

    public void setPubDateEnum(MJEntity.pubDateEnum pubDateEnum) {
        this.pubDateEnum = pubDateEnum;
    }

    private pubDateEnum pubDateEnum;
    public int id;
    public String card;
    public enum pubDateEnum{
        Null,
        PUBDATEASC,
        PUBDATEDESC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
