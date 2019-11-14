package service;

import entity.Pet;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 11:25
 * @Description: 宠物工厂接口
 */
public interface PetFactory {
    /**
     * 培育新品种的宠物
     * @param petParam 宠物昵称
     * @return 宠物对象
     */
    Pet breadNewPet(String[] petParam);
}
