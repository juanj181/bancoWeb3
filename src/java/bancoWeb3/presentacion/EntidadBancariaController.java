/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bancoWeb3.presentacion;

import bancoWeb3.datos.EntidadBancariaDAO;
import bancoWeb3.negocio.EntidadBancaria;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alumno
 */
@Controller
public class EntidadBancariaController {
    
    @Autowired
    EntidadBancariaDAO entidadBancariaDAO;
    
    //Lee una entidad a la que le pasamos un ID
    @RequestMapping(value = {"/EntidadBancaria/{idEntidadBancaria}"}, method = RequestMethod.GET)
    public void read(HttpServletRequest request, HttpServletResponse response, @PathVariable("idEntidadBancaria") int idEntidadBancaria){
        
        try{
            
            EntidadBancaria entidadBancaria = entidadBancariaDAO.read(idEntidadBancaria);
            
            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType("application/json; charset=UTF-8");
            
            ObjectMapper objetctMapper = new ObjectMapper();
            String json = objetctMapper.writeValueAsString(entidadBancaria);
            response.getWriter().printf(json);
            
        }catch (Exception ex){
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.setContentType("text/plain; charset=UTF-8;");
            try{
                
                ex.printStackTrace(response.getWriter());
                
            }catch (IOException ex1){
                
            }
        }
        
    }
    
    
}
