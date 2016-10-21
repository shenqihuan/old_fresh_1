package com.cn.hys.service.impl;  
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;

import com.cn.hys.dao.IUserDao;
import com.cn.hys.pojo.User;
import com.cn.hys.service.IUserService;  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        return this.userDao.selectByPrimaryKey(userId);  
    }
}