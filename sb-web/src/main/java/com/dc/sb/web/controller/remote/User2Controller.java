package com.dc.sb.web.controller.remote;
import com.alibaba.dubbo.config.annotation.Reference;
import com.dc.sb.entity.User;
import com.dc.sb.service.User2Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class User2Controller {

    @Reference(version = "1.0.0")
    private User2Service user2Service;

    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("user")
    public String addUser(@RequestBody User user){
        try {
            user2Service.addUser(user);
            return "添加成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "添加失败";
    }

    /**
     * 冻结用户
     * @param userId
     * @return
     */
    @GetMapping("{userId}")
    public String Freeze(@PathVariable Integer userId){
        try {
            user2Service.updateState(userId);
            return "冻结成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "冻结失败";
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @PutMapping("updateUser")
    public String UpdateUser(@RequestBody User user){
        try {
            user2Service.updateUser(user);
            return "修改成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "修改失败";
    }

    /**
     * 逻辑删除用户
     * @param userId
     * @return
     */
    @GetMapping("/logicDel/{userId}")
    public String logicDel(@PathVariable Integer userId){
        try {
            user2Service.logicDel(userId);
            return "逻辑删除成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "逻辑删除失败";
    }

    /**
     * 物理删除用户
     * @param userId
     * @return
     */
    @PutMapping("/PhysicsDel/{userId}")
    public String PhysicsDel(@PathVariable Integer userId){
        try {
            user2Service.physicsDel(userId);
            return "物理删除成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "物理删除失败";
    }

    /**
     * 查询一段时间内的下单总金额
     * @param user
     * @return
     */
    @PostMapping("userStatistics")
    public User statistics(@RequestBody User user){
        User user1=new User();
        try {
            user1= user2Service.statistics(user);
            user1.setStartTime(user.getStartTime());
            user1.setEndTime(user.getEndTime());
            return user1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user1;
    }
}
