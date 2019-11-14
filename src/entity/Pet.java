package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 9:38
 * @Description: 宠物类
 */
public class Pet implements Serializable{
    public Pet() {
    }

    public Pet(String name, String typeName, int health, int love, Date birthday, int ownerId, int storeId) {
        this.name = name;
        this.typeName = typeName;
        this.health = health;
        this.love = love;
        this.birthday = birthday;
        this.ownerId = ownerId;
        this.storeId = storeId;
    }

    //宠物编号
    private long id;
    //宠物昵称
    private String name;
    //宠物类型
    private String typeName;
    //健康值
    private int health;
    //亲密度
    private int love;
    //出生日期
    private Date birthday;
    //所属主人
    private int ownerId;
    //所属商店
    private int storeId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
}
