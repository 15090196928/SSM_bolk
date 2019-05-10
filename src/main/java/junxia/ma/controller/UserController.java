package junxia.ma.controller;

import junxia.ma.model.User;
import junxia.ma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public void  addUser() throws Exception {
        User user = new User();
        user.setNum(2);
        user.setHome("b");
        user.setMobile("1111111111");
        user.setName("b");
        user.setSex("男");
        int i = userService.addUserService(user);
    }

    @RequestMapping("/delete")
    public void deleteUser() throws Exception {
        int i = userService.deleteUserService(1);
    }

    @RequestMapping("/update")
    public void updateUser() throws Exception {
        User user = new User();
        user.setNum(2);
        user.setHome("1");
        user.setMobile("1111111111");
        user.setName("b");
        user.setSex("男");
        userService.UpdateUserService(user);
    }


    @RequestMapping("/select")
    public String selectUser(Model model) throws Exception {
        User user = userService.selectUserService(1);
        model.addAttribute("user",user);
        return "index2";
    }

}
