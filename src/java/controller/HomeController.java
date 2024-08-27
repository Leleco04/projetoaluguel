/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Carros;
import model.bean.Usuarios;
import model.dao.CarrosDAO;
import model.dao.UsuariosDAO;

/**
 *
 * @author Senai
 */
@WebServlet(name = "HomeController", urlPatterns = {"/HomeController", "/login", "/cadastro", "/home", "/cadastro-carro", "/carros"})
public class HomeController extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HomeController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HomeController at " + request.getContextPath() + "</h1>");
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
        String pagina = request.getServletPath();
        CarrosDAO carrosDAO = new CarrosDAO();
        Usuarios usuario = new Usuarios();

        if (pagina.equals("/login")) {
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        } else if (pagina.equals("/home")) {
            request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
        } else if (pagina.equals("/cadastro")) {
            request.getRequestDispatcher("/WEB-INF/jsp/cadastro.jsp").forward(request, response);
        } else if (pagina.equals("/cadastro-carro")) {
            request.getRequestDispatcher("/WEB-INF/jsp/cadastro-carro.jsp").forward(request, response);
        } else if (pagina.equals("/carros")) {
            List<Carros> carros = carrosDAO.lerCarros();
            request.setAttribute("carros", carros);
            request.getRequestDispatcher("/WEB-INF/jsp/carros.jsp").forward(request, response);
        }
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
        String pagina = request.getServletPath();
        Usuarios usuario = new Usuarios();
        UsuariosDAO usuariosDAO = new UsuariosDAO();

        if (pagina.equals("/cadastro")) {
            usuario.setNome(request.getParameter("nome"));
            usuario.setEmail(request.getParameter("email"));
            usuario.setSenha(request.getParameter("senha"));

            usuariosDAO.cadastrarUsuario(usuario);

            response.sendRedirect("./login");
        } else if (pagina.equals("/login")) {
            usuario.setEmail(request.getParameter("email"));
            usuario.setSenha(request.getParameter("senha"));

            usuario = usuariosDAO.verificarLogin(usuario);

            if (usuario.getId_usuario() > 0) {
                response.sendRedirect("./carros");
            } else {
                response.sendRedirect("./login");
            }
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

}
