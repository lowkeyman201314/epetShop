package dao.impl;

import dao.BaseDao;
import dao.PetStoreDao;
import entity.PetStore;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:45
 * @Description: 商店实现类
 */
public class PetStoreDaoImpl extends BaseDao implements PetStoreDao {
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    @Override
    public List<PetStore> getPetStoreList() {
        List<PetStore> petStoreList=new ArrayList<PetStore>();
        conn=getConn();
        PetStore petStore=null;
        try {
            pstmt= conn.prepareStatement("select * from petstore");
            rs=pstmt.executeQuery();
            while (rs.next()) {
                petStore=new PetStore();
                petStore.setId(rs.getInt(1));
                petStore.setName(rs.getString(2));
                petStore.setPassword(rs.getString(3));
                petStore.setBalance(rs.getInt(4));
                petStoreList.add(petStore);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return petStoreList;
    }

    @Override
    public PetStore selectPetStore(String sql, Object[] params) {
        PetStore petStore=null;
        try {
            //获取数据库连接对象
            conn = this.getConn();
            //获取PreparedStatement对象
            pstmt = conn.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    pstmt.setString(i + 1, params[i].toString()); // 为预编译sql设置参数
                }
            }
            //执行SQL语句
            rs = pstmt.executeQuery();
            //处理结果集
            if (rs.next()) {
                //实例化petOwner对象
                petStore = new PetStore();
                petStore.setId(rs.getInt("id"));
                petStore.setName(rs.getString("name"));
                petStore.setBalance(rs.getInt("balance"));
                petStore.setPassword(rs.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(rs, pstmt, conn);
        }
        return petStore;
    }

    @Override
    public int updatePetStore(String sql, Object[] params) {
        return 0;
    }
}
