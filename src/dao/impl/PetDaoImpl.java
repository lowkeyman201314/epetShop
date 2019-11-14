package dao.impl;

import dao.BaseDao;
import dao.PetDao;
import entity.Pet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:46
 * @Description: 宠物实现类
 */
public class PetDaoImpl extends BaseDao implements PetDao {
    private Connection conn;
    private PreparedStatement pstmt=null;
    private ResultSet rs;
    @Override
    public List<Pet> getAllPet() {
        List<Pet> petList=new ArrayList<Pet>();
        conn=this.getConn();
        String sql="select * from pet";
        try {
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()) {
                Pet pet=new Pet();
                pet.setId(rs.getInt(1));
                pet.setName(rs.getString(2));
                pet.setTypeName(rs.getString(3));
                pet.setHealth(rs.getInt(4));
                pet.setLove(rs.getInt(5));
                pet.setBirthday(rs.getDate(6));
                pet.setOwnerId(rs.getInt(7));
                pet.setStoreId(rs.getInt(8));
                petList.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return petList;
    }

    @Override
    public Pet selectPet(String sql, Object[] params) {

        return null;
    }

    @Override
    public int updatePet(String sql, Object[] params) {
        return 0;
    }
}
