package org.zxl.springdemo.springdaotest.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.zxl.springdemo.springdaotest.dao.IUserDAO;
import org.zxl.springdemo.springdaotest.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@Component
public class UserDAO extends JdbcDaoSupport implements IUserDAO {
//    @Autowired
//    private DataSource dataSource;

    @Override
    public List<User> queryAllUser() {
        String sql = "SELECT userId ,userName ,money from t_user";
        List<Map<String,Object>> list = getJdbcTemplate().queryForList(sql);
        List<User> userList = new ArrayList<User>();
        for(Map<String,Object> row:list){
            User user = new User();
            user.setUserId((Integer) row.get("userId"));
            user.setUserName((String)row.get("userName"));
            user.setMoney((Integer)row.get("money"));
            userList.add(user);
        }
        return userList;
    }

    @Override
    public boolean addUser(int userId, String userName, int money) {
        String sql="insert into t_user (userId ,userName ,money) values (?,?,?)";
        int row=getJdbcTemplate().update(sql, new Object[]{userId,userName,money});
        if(row>0)
        {
            return true;
        }
        return false;
    }


//    @Override
//    protected JdbcTemplate createJdbcTemplate(DataSource dataSource) {
//        return super.createJdbcTemplate(this.dataSource);
//    }
}
