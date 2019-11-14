package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 9:38
 * @Description: 账目类
 */
public class Account implements Serializable{
    public Account() {
    }

    public Account(int dealType, long petId, long sellerId, long buyerId, double price, Date dealTime) {
        this.dealType = dealType;
        this.petId = petId;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.price = price;
        this.dealTime = dealTime;
    }

    //账目编号
    private long id;
    //交易类型，1--代表商店卖给宠物主人
    // 2--代表宠物主人卖给商店
    // 3---宠物主人之间交易
    private int dealType;
    //宠物编号
    private long petId;
    //卖家标识符
    private long sellerId;
    //买家标识符
    private long buyerId;
    //交易价格
    private double price;
    //交易时间
    private Date dealTime;

    public void setId(long id) {
        this.id = id;
    }

    public void setDealType(int dealType) {
        this.dealType = dealType;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
}
