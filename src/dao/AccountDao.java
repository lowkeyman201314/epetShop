package dao;

import entity.Account;

import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:15
 * @Description: 账目接口
 */
public interface AccountDao {

    /**
     * 更新台帐信息
     * @param sql
     * @param param
     * @return
     */
    int updateAccount(String sql, Object[] param);

    /**
     * 根据查询条件查询出宠物商店帐单
     * @param sql
     * @param param
     * @return
     */
    List<Account> getPetStoreAccount(String sql, String[] param);
}
