package dao;

import entity.PetOwner;

import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:01
 * @Description: 主人信息接口
 */
public interface PetOwnerDao {
    /**
     * 查询所有宠物主人信息
     * @return 宠物主人信息集合
     */
    List<PetOwner> getOwnerList();

    /**
     * 更新宠物主人信息
     * @param sql SQL语句
     * @param params 入参
     * @return 受影响行数
     */
    int updatePetOwner(String sql,Object[] params);

    /**
     * 根据查询条件查询宠物主人信息
     * @param sql SQL语句
     * @param param 入参
     * @return 宠物主人对象
     */
    PetOwner selectOwner(String sql, Object[] param);
}
