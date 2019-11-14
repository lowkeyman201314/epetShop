package service;

import entity.Pet;
import entity.PetStore;

import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:53
 * @Description: 宠物商店业务接口
 */
public interface PetStoreService {
    /**
     * 查询出所有库存宠物
     * @param storeId 商店编号
     * @return 宠物集合
     */
    List<Pet> getPetsInstock(long storeId);

    /**
     * 查询出所有新培育的宠物
     * @return 宠物集合
     */
    List<Pet> getPetsBread();

    /**
     * 为宠物定价
     * @param pet
     * @return 宠物定价
     */
    double charge(Pet pet);

    /**
     * 宠物商店登录
     * @return 商店对象
     */
    PetStore login();
}
