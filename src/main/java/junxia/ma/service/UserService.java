package junxia.ma.service;

import junxia.ma.model.User;

public interface UserService {

    /**
     * 添加用户service
     * @param user
     * @return
     */
    public int addUserService(User user) throws Exception;

    public int deleteUserService(Integer num) throws Exception;

    public int UpdateUserService(User user) throws Exception;

    public User selectUserService(Integer num) throws Exception;





}
