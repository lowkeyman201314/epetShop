package service;

import entity.Account;
import entity.Pet;
import entity.PetOwner;

import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 11:05
 * @Description: 账目接口
 */
public interface Accountable {
    /**
     * 查询宠物商店台帐信息
     * @param storeId 商店编号
     * @return 账目集合
     */
    List<Account> getAccount(long storeId);

    /**
     * 修改宠物商店台帐信息
     * @param pet 宠物对象
     * @param owner 宠物主人
     * @return 受影响行数
     */
    int modifyAccount(Pet pet, PetOwner owner);
}
