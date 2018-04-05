/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectpoomars;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author renob
 */
public class ServletTraitement02 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            //Traitement des zones de saisies
            int inbvaleur = 0;
            HttpSession sess = request.getSession();
            List<Double> listedesvaleurs = new ArrayList<Double>();
            if (sess.getAttribute("NbValeur") != null) {
                inbvaleur = (int) sess.getAttribute("NbValeur");
            }//END if
            
            for(int i=0;i<inbvaleur;i++) {
                if (sess.getAttribute("sval"+i) != null) {
                    listedesvaleurs.add(new Double(
                            request.getParameter("sval"+i)
                    ));
                
                }//END if
               
            }//END for
            
            //Calcul de la Somme
            Double resultatSomme;
            for (String item : listedesvaleurs) {
               resultatSomme = resultatSomme + (Double) item;
            }
            
        
            
            //Calcul de la Moyenne
            Double resultatMoyenne;
            resultatMoyenne = resultatSomme / inbvaleur;
            
            //Afficher les variables en HTML
            
            out.println("<p>La Somme des valeurs vaut : "+resultatSomme+"</p>");
            out.println("<p>La Moyenne des valeur vaut : "+resultatMoyenne+"</p>");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletTraitement02</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Somme = " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
