import cn.lhl.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by datou on 2017/1/10.
 */
public class text1 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        //创建session工厂对象
        SessionFactory sf = configuration.buildSessionFactory();
        //打开sessionn
        Session session = sf.getCurrentSession();
        //开始事务（怎删改操作必须，查询可选）
       Transaction ts= session.beginTransaction();
        //数据库操作
        //第一次修改数据库数据
        User user= session.get(User.class,3);
        user.setName("ww");
        session.update(user);
        User user1=session.get(User.class,3);
        session.update(user1);

        ts.commit();


    }
}
