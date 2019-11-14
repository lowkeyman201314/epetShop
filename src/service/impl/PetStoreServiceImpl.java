package service.impl;

import dao.PetStoreDao;
import dao.impl.PetStoreDaoImpl;
import entity.Account;
import entity.Pet;
import entity.PetOwner;
import entity.PetStore;
import service.*;

import java.util.List;
import java.util.Scanner;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 11:27
 * @Description:
 */
public class PetStoreServiceImpl implements Buyable, Sellable, PetStoreService, Breadable, Accountable {
    private PetStoreDao petStoreDao = new PetStoreDaoImpl();
    @Override
    public List<Pet> getPetsInstock(long storeId) {
        return null;
    }

    @Override
    public List<Pet> getPetsBread() {
        return null;
    }

    @Override
    public double charge(Pet pet) {
        return 0;
    }

    @Override
    public PetStore login() {
        Scanner input = new Scanner(System.in);
        System.out.println("请先登录，请输入宠物商店的名字：");
        String userName = input.next();
        System.out.println("请输入商店的密码：");
        String password = input.next();

        //验证用户名和密码的方法
        String sql="select * from petstore where name=? and password=?";
        Object[] param = {userName,password};
        PetStore petStore = petStoreDao.selectPetStore(sql,param);
        if (null != petStore) {
            System.out.println("-------恭喜成功登录-------");
            System.out.println("-------宠物商店的基本信息：-------");
            System.out.println("名字：" + petStore.getName());
            System.out.println("元宝数：" + petStore.getBalance());
        }
        return petStore;
    }

    @Override
    public void buy(Pet pet) {

    }

    @Override
    public void sell(Pet pet) {

    }

    @Override
    public List<Account> getAccount(long storeId) {
        return null;
    }

    @Override
    public int modifyAccount(Pet pet, PetOwner owner) {
        return 0;
    }

    @Override
    public Pet bread(String pet) {
        return null;
    }
}
