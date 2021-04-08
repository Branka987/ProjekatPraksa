/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Korisnik;
import models.Model;
import models.Poruka;

/**
 *
 * @author Branka
 */
public class PosaljiPorukuServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesija = request.getSession();
     
    ArrayList<Model>poruke = Poruka.all(Poruka.class);
         if (sesija.getAttribute("korisnik_id") != null) {
             
            long id = (long) sesija.getAttribute("korisnik_id");
             
             Poruka p = new Poruka();
           p.setKorisnik_id(id);
           p.setPoruka(request.getParameter("poruka"));
           p = (Poruka)p.save();
              
            request.setAttribute("korisnik_id",p.getKorisnik_id());
            
              
            
               
                response.sendRedirect("prijava.jsp");
             
                return;
         }
            else{
                response.sendRedirect("prijavljen");
            }
    }

       // processRequest(request, response);
    
        

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}