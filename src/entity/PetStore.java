package entity;

import java.io.Serializable;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 9:39
 * @Description: 宠物商店类
 */
public class PetStore implements Serializable{
    public PetStore() {
    }

    public PetStore(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    //商店编号
    private int id;
    //商店名称
    private String name;
    //密码
    private String password;
    //余额
    private int balance;

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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
