package service;

import entity.Pet;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 11:03
 * @Description: 繁殖宠物的接口
 */
public interface Breadable {
    /**
     * 繁殖宠物
     * @param pet 宠物昵称
     * @return 宠物对象
     */
    Pet bread(String pet);
}
