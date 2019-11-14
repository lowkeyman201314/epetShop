package dao.impl;

import dao.BaseDao;
import dao.PetOwnerDao;
import entity.Pet;
import entity.PetOwner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:41
 * @Description: 主人实现类
 */
public class PetOwnerDaoImpl extends BaseDao implements PetOwnerDao {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    @Override
    public List<PetOwner> getOwnerList() {
        conn = getConn();
        List<PetOwner> petOwners = new ArrayList<PetOwner>();
        try {

            pstmt = conn.prepareStatement("SELECT * FROM petowner");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                PetOwner petOwner = new PetOwner();
                petOwner.setId(rs.getInt(1));
                petOwner.setName(rs.getString(2));
                petOwner.setPassword(rs.getString(3));
                petOwner.setMoney(rs.getInt(4));
                petOwners.add(petOwner);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return petOwners;
    }

    @Override
    public int updatePetOwner(String sql, Object[] params) {
        return 0;
    }

    @Override
    public PetOwner selectOwner(String sql, Object[] param) {
        PetOwner petOwner = null;
        try {
            //获取数据库连接对象
            conn = this.getConn();
            //获取PreparedStatement对象
            pstmt = conn.prepareStatement(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    pstmt.setString(i + 1, param[i].toString()); // 为预编译sql设置参数
                }
            }
            //执行SQL语句
            rs = pstmt.executeQuery();
            //处理结果集
            if (rs.next()) {
                //实例化petOwner对象
                petOwner = new PetOwner();
                petOwner.setMoney(rs.getInt("money"));
                petOwner.setPassword(rs.getString("password"));
                petOwner.setName(rs.getString("name"));
                petOwner.setId(rs.getInt("id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(rs, pstmt, conn);
        }
        return petOwner;
    }
}
