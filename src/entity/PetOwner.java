package entity;

import java.io.Serializable;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 9:39
 * @Description: 宠物主人类
 */
public class PetOwner implements Serializable {
    public PetOwner() {
    }

    public PetOwner(String name, String password, int money) {
        this.name = name;
        this.password = password;
        this.money = money;
    }

    //主人编号
    private int id;
    //主人姓名
    private String name;
    //主人密码
    private String password;
    //元宝数
    private int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
