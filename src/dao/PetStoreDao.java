package dao;

import entity.PetStore;

import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:08
 * @Description: 宠物商店接口
 */
public interface PetStoreDao {
    /**
     * 查询所有商店信息
     * @return 商店信息集合
     */
    List<PetStore> getPetStoreList();

    /**
     * 查询指定商店信息
     * @param sql SQL语句
     * @param params 入参
     * @return
     */
    PetStore selectPetStore(String sql,Object[] params);

    /**
     * 更新商店信息
     * @param sql SQL语句
     * @param params 入参
     * @return
     */
    int updatePetStore(String sql,Object[] params);

}
