import cn.lhl.entity.Management;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Created by datou on 2017/1/10.
 */
public class text3 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure();
        SessionFactory sf=configuration.buildSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Management management=new Management();
        management.setModel("4-8");
        management.setPrice(650);
        management.setDate1(new Date());
        session.save(management);
        System.out.println("添加成功");
        management.setModel("CDMA-1");
        System.out.println("修改成功");
        management.setSerialnum(1);
        session.delete(management);
        transaction.commit();
        System.out.println("删除成功");


    }
}
