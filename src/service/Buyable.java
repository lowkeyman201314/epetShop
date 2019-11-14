package service;

import entity.Pet;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 11:00
 * @Description: 购买宠物的接口
 */
public interface Buyable {

    /**
     * 宠物主人购买库存宠物
     * @param pet 宠物对象
     */
    void buy(Pet pet);
}
