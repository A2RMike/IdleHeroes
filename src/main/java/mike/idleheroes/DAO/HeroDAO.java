/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mike.idleheroes.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import mike.idleheroes.DTO.HeroDTO;
import mike.idleheroes.Entities.HeroEntity;

/**
 *
 * @author miche
 */
public class HeroDAO {
    
    public List<HeroDTO> getHeroList() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ih_pu");
        EntityManager em = emf.createEntityManager();

        TypedQuery<HeroEntity> query = em.createNamedQuery("query_hero", HeroEntity.class);
        List<HeroEntity> list = query.getResultList();
        List<HeroDTO> heroes = new ArrayList();
        //heroes = list.stream().map(hero -> {
        //    return new HeroDTO(hero.getID(), hero.getID_Class(), hero.getID_Faction(), hero.getID_Tier(),
        //            hero.getAutore(), hero.getData(), hero.isVisibile(), hero.getVisite());
        //}).collect(Collectors.toList());
        
        //List<HeroDTO> hero = new ArrayList(); ***added later
        list.forEach((hero) -> {
            HeroDTO Hero = new HeroDTO(hero.getID(), hero.getID_Class(), hero.getID_Faction(), hero.getID_Tier(), hero.getName(), hero.getDescription(), hero.getImage(), hero.getSkill_1(), hero.getSkill_2(), hero.getSkill_3(), hero.getSkill_4());
            heroes.add(Hero);
        });
        
        em.close();
        emf.close();

        return heroes;
    }
    
}
