import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by datou on 2017/1/12.
 */
public class tool {
    private  static ThreadLocal sessionTl=new ThreadLocal();
    private  static Configuration cfg=new Configuration().configure();
    private  static SessionFactory sf=cfg.buildSessionFactory();
    public static Session getSession(){
        Session session=(Session) sessionTl.get();
        if(session==null){
            //aaa
            session=sf.openSession();
            sessionTl.set(session);
        }
    return session;
    }
    public  static void sessionClose(){
        Session session=(Session) sessionTl.get();
        sessionTl.set(null);
        session.close();
    }
}
