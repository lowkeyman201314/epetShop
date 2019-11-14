package dao.impl;

import dao.AccountDao;
import dao.BaseDao;
import entity.Account;

import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:47
 * @Description: 账目实现类
 */
public class AccountDaoImpl extends BaseDao implements AccountDao {
    @Override
    public int updateAccount(String sql, Object[] param) {
        return 0;
    }

    @Override
    public List<Account> getPetStoreAccount(String sql, String[] param) {

        return null;
    }
}
