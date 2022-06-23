/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mx.org.web;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.org.dto.RepEstadisticasxTipoVisitante;
import mx.org.poi.ReporteXLS;

/**
 *
 * @author elopez
 */
@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {

    private final int ARBITARY_SIZE = 1048;

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

        {
            String proyecto = "POI-1.0" + File.separator + "template";

            Path file = Paths.get(proyecto);

            String absolutePath = file.toAbsolutePath().toFile().getAbsolutePath().replaceAll("config", "applications");

            String template = absolutePath + File.separator + "estadisticaVisitante.xls";

            String destFilePath = absolutePath + File.separator + "estadisticaVisitante_COPY.xls";

            //String template = "D:\\Desarrollo\\Workspace\\NetBeansProjects\\POI\\src\\main\\java\\estadisticaVisitante.xls";
            Map beanParams = this.logica_negocio();
            //String destFilePath = "D:\\Desarrollo\\Workspace\\NetBeansProjects\\POI\\src\\main\\java\\estadisticaVisitante_COPY.xls";

            ReporteXLS repXls = new ReporteXLS();

            boolean result = repXls.generate(template, beanParams, destFilePath);

            if (result) {

                byte[] bytes = Files.readAllBytes(Paths.get(destFilePath));

                //indicamos el tipo de respuesta al navegador
                response.setContentType("application/vnd.ms-excel");
                response.setHeader("Content-Disposition", "attachment;filename=excel.xls");
                //para un uso mas profesional de excel poi.apache.org

                //indicar al navegador que no guarde cache
                response.setHeader("Pragma", "no-cache");
                response.setHeader("Cache-Control", "no-store");
                response.setDateHeader("Expires", -1);

                try ( InputStream in = new ByteArrayInputStream(bytes); /*InputStream in = request.getServletContext().getResourceAsStream("/WEB-INF/sample.txt");*/  OutputStream out = response.getOutputStream()) {

                    byte[] buffer = new byte[ARBITARY_SIZE];

                    int numBytesRead;

                    while ((numBytesRead = in.read(buffer)) > 0) {
                        out.write(buffer, 0, numBytesRead);
                    }
                }

            }

        }
    }

    /**
     *
     * @return
     */
    private Map logica_negocio() {

        Map mapa = new HashMap();

        RepEstadisticasxTipoVisitante bean = new RepEstadisticasxTipoVisitante(
                new Long(9187046), new Long(8440), new Long(241667), new Long(1900777), new Long(1114915), new Long(497253),
                new Long(14647), new Long(2252441), new Long(3156906), new Long(47806), new Long(107834), new Long(82612),
                new Long(105870), new Long(1064), new Long(2410719), new Long(2755905));

        List lista = new ArrayList();
        lista.add(bean);

        mapa.put("BEAN", lista);
        mapa.put("TOTAL", (bean.getTotal_nacional() + bean.getTotal_extranjero()));

        return mapa;
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
