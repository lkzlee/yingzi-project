package com.yingzixiyin.core.dao;

import com.yingzixiyin.core.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author song.shi
 * @date 2015-07-02
 */

@Repository("userDao")
public interface UserDao {

    /**
     * 增
     * @param user 用户
     * @return 插入记录的主键
     */
    public Integer insert(User user);

    /**
     * 改
     * @param user id必需，通过id去修改
     */
    public void update(User user);

    /**
     * 查询一个用户
     * @param user 查询条件
     * @return User
     */
    public User getUser(User user);

}
