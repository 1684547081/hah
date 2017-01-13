import cn.lhl.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Created by datou on 2017/1/8.
 */
public class test {
    public static void main(String[] args) {
        Session session= tool.getSession();
        //zzzzzzzzzzzzzzz
       Transaction ts= session.beginTransaction();
        //数据库操作sadad
        //修改哈哈
//        User user= session.get(User.class,3);
//        user.setName("wwwww");
//        session.update(user);
        //添加
        User user =new User();
        user.setName("1");
        user.setPwd("a");
        System.out.println("瞬时状态");
        session.save(user);
        System.out.println("持久状态");
        //删除
//        User user=new User();
//        user.setId(2);
//        session.delete(user);
        //查询
//        User user= session.get(User.class,3);
//        System.out.println(user.getName());
        //提交事务
        ts.commit();
        System.out.println("游离状态");



    }
}
