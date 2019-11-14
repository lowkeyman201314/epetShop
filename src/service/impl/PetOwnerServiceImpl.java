package service.impl;

import dao.PetOwnerDao;
import dao.impl.PetOwnerDaoImpl;
import entity.Pet;
import entity.PetOwner;
import service.Buyable;
import service.PetOwnerService;
import service.Sellable;

import java.util.Scanner;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 11:10
 * @Description:
 */
public class PetOwnerServiceImpl implements PetOwnerService, Buyable, Sellable {
    
    private PetOwnerDao petOwnerDao=new PetOwnerDaoImpl();
    
    @Override
    public PetOwner login() {
        Scanner input = new Scanner(System.in);
            System.out.println("请先登录，请输入主人的名字：");
            String userName = input.next();
            System.out.println("请输入主人的密码：");
            String password = input.next();

            //验证用户名和密码的方法
            String sql="select * from petowner where name=? and password=?";
            Object[] param = {userName,password};
            PetOwner petOwner = petOwnerDao.selectOwner(sql, param);
            if (null != petOwner) {
            System.out.println("-------恭喜您成功登录-------");
            System.out.println("-------您的基本信息：-------");
            System.out.println("名字：" + petOwner.getName());
            System.out.println("元宝数：" + petOwner.getMoney());
        }
        return petOwner;
    }

    @Override
    public void buy(Pet pet) {

    }

    @Override
    public void sell(Pet pet) {

    }
}
