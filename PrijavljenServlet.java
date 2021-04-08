/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
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
 * @author PC
 */
public class PrijavljenServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesija = request.getSession();
        if (sesija.getAttribute("korisnik_id") != null) {
           // RequestDispatcher rd = request.getRequestDispatcher("poruka.jsp");
            Korisnik k = new Korisnik();
            k = (Korisnik)k.find((Integer)sesija.getAttribute("korisnik_id"));
            request.setAttribute("korisnik", k);
        
            Poruka por = new Poruka();
            long id = k.getId();
            por.setKorisnik_id(id);
            
            if (por.getKorisnik_id() == k.getId()){
                 sesija.setAttribute("poruka", por.getPoruka());
               
                por.setKorisnik_id(id);
              sesija.setAttribute("korisnik_id",por.getKorisnik_id());
             
                  response.sendRedirect("poruka.jsp");
            }
            else{
                  response.sendRedirect("prijava.jsp");
            }
            
            ArrayList<Model> poruke = Poruka.all(Poruka.class);
          
             sesija.setAttribute("korisnik_id",por.getKorisnik_id());
       
           // rd.forward(request, response);
        } else {
            response.sendRedirect("prijava.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
