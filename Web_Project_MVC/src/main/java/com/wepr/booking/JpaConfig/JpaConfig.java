package com.wepr.booking.JpaConfig;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaConfig {
    public static  EntityManager getEntityManager(){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("heroku_d9d8bf11be93e25");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("heroku_d9d8bf11be93e25");
        EntityManager em = emf.createEntityManager();
        return  em;

    }
}
