package dao;

import entity.Pet;

import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:13
 * @Description:
 */
public interface PetDao {

    /**
     * 查询所有宠物信息
     * @return 宠物信息集合
     */
    List<Pet> getAllPet();

    /**
     * 根据已知宠物的信息查询宠物信息
     * @param sql SQL语句
     * @param params 入参
     * @return 宠物对象
     */
    Pet selectPet(String sql, Object[] params);

    /**
     * 更新宠物信息
     * @param sql SQL语句
     * @param params 入参
     * @return
     */
    int updatePet(String sql, Object[] params);
}
