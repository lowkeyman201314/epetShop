package service;

import entity.Pet;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 11:02
 * @Description: 卖宠物的接口
 */
public interface Sellable {

    /**
     * 卖宠物
     * @param pet 宠物对象
     */
    void sell(Pet pet);
}
