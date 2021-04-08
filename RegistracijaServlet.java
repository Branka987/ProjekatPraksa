/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Korisnik;

/**
 *
 * @author PC
 */
public class RegistracijaServlet extends HttpServlet {

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
        Korisnik korisnik = new Korisnik();
        korisnik.setIme_prezime(request.getParameter("ime_prezime"));
        korisnik.setUsername(request.getParameter("username"));
        korisnik.setPassword(request.getParameter("password"));
        korisnik = (Korisnik)korisnik.save();
        if (korisnik.getId() > 0) {
            response.sendRedirect("prijava.jsp");
        } else {
            response.sendRedirect("registracija.jsp");
        }
        
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
    
    public int power(int broj, int eksp) {
        if (eksp > 1)
            return broj * power(broj, eksp-1);
        else
            return broj;
    }

}