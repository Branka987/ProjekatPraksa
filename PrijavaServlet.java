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

/**
 *
 * @author PC
 */
public class PrijavaServlet extends HttpServlet {

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
        ArrayList<Model> korisnici = Korisnik.all(Korisnik.class);
        for (Model korisnik: korisnici) {
            Korisnik k = (Korisnik)korisnik;
            if (k.getUsername().equals(request.getParameter("username"))
                && k.getPassword().equals(request.getParameter("password"))) {
                // Prijaviti korisnika
                HttpSession sesija = request.getSession();
                sesija.setAttribute("korisnik_id", k.getId());
                response.sendRedirect("prijavljen");
                return;
            }
            
        }
        response.sendRedirect("prijava.jsp");
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
