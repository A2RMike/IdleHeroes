/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mike.idleheroes.REST;

import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import mike.idleheroes.DAO.HeroDAO;
import mike.idleheroes.DTO.HeroDTO;

/**
 *
 * @author miche
 */
@Path("/heroes")
public class HeroREST {
    
    @Path("/")
    @GET()
    @Produces("application/json")
    public List<HeroDTO> getHeroList() {
        HeroDAO hero = new HeroDAO();
        return hero.getHeroList();
    }
}