import cn.lhl.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by datou on 2017/1/10.
 */
public class text2 {

    public static void main(String[] args) {

        Session session =  tool.getSession();
        //开始事务（怎删改操作必须，查询可选）
        Transaction ts= session.beginTransaction();
        //数据库操作
        //第一次修改数据库数据
        User user1 = session.load(User.class,3);
        System.out.println(user1);
        ts.commit();
        tool.sessionClose();
    }
}
