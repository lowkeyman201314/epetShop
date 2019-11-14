package service;

import entity.Pet;
import entity.PetOwner;

import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2019/11/11 10:52
 * @Description: 宠物主人业务接口
 */
public interface PetOwnerService {

    /**
     * 主人登录
     * @return 主人对象
     */
    PetOwner login();
}
