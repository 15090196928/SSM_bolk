package junxia.ma.service.serviceImpl;

import junxia.ma.mapper.UserMapper;
import junxia.ma.model.User;
import junxia.ma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUserService(User user) throws Exception {
        System.out.println(user);
        int i = userMapper.addUserMapper(user);
        return i;
    }

    @Override
    public int deleteUserService(Integer num) throws Exception {
        userMapper.deleteUserMapper(num);
        return 0;
    }

    @Override
    public int UpdateUserService( User user) throws Exception {
        int i = userMapper.UpdateUserMapper(user);
        return 0;
    }

    @Override
    public User selectUserService(Integer num) throws Exception {
        return userMapper.selectUserMapper(num);
    }
}
