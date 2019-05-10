package junxia.ma.mapper;

import junxia.ma.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 添加用户service
     * @param user
     * @return
     */
    public int addUserMapper(User user)throws Exception;

    public int deleteUserMapper(Integer num)throws Exception;

    public int UpdateUserMapper(User user)throws Exception;

    public User selectUserMapper(Integer num)throws Exception;

}
