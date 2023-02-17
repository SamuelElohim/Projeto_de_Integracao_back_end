package hibernate.util;

import org.hibernate.Session;

public final class HibernateSession {
    private static Session sessionInstance;

    private HibernateSession() {}

    public static Session getSessionInstance() {
        if(sessionInstance == null) {
            sessionInstance = HibernateSessionFactory.getSessionFactory().openSession();
        }

        return sessionInstance;
    }
}
