import hibernate.HibernateUtil;
import model.*;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        String lineSelected = "Cronos";
        List<Category> categoryList= session.
                createQuery(String.format("FROM Category WHERE line_id = '%s'", lineSelected)).list();

        categoryList.forEach(x -> System.out.println(x));


        session.close();


    }
}




