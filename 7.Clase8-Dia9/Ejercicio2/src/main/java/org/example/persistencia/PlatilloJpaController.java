package org.example.persistencia;


import org.example.logica.Platillo;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

public class PlatilloJpaController implements Serializable {

    public PlatilloJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PlatilloJpaController() {
        //Obtener la unidad de persistencia
        emf = Persistence.createEntityManagerFactory("restaurantePU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    //Mñetodos para interactuar con la BD
    //Crear
    public void create(Platillo platillo) {
        EntityManager em = null;
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(platillo);
            em.getTransaction().commit();

    }

    //Editar
    public void edit(Platillo platillo) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        platillo = em.merge(platillo);
        em.getTransaction().commit();

    }

    //Eliminar
    public void destroy(int id) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Platillo platillo = em.getReference(Platillo.class, id);
        em.remove(platillo);
        em.getTransaction().commit();

    }

    //Listar
    public List<Platillo> findPlatilloEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Platillo.class));
        Query q = em.createQuery(cq);
        return q.getResultList();

    }


}