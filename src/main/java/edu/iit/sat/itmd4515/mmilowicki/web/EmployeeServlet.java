package edu.iit.sat.itmd4515.mmilowicki.web;

import edu.iit.sat.itmd4515.mmilowicki.domain.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maciej milowicki
 */
@WebServlet(name = "EmployeeServlet", urlPatterns = {"/emp"})
public class EmployeeServlet extends HttpServlet {

    private static final Logger LOG = Logger.getLogger(EmployeeServlet.class.getName());

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
        LOG.info("Inside EmployeeServlet.doGet");
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
        LOG.info("Inside EmployeeServlet.doPost");

        // REMEBER: ALL user input from HTML form is text, text, text.
        String empIdParam = request.getParameter("id");
        String firstNameParam = request.getParameter("firstName");
        String lastNameParam = request.getParameter("lastName");
        String titleParam = request.getParameter("title");
        String titleOfCourtesyParam = request.getParameter("titleOfCourtesy");
        String birthDateParam = request.getParameter("birthDate");
        String hireDateParam = request.getParameter("hireDate");
        String addressParam = request.getParameter("address");
        String cityParam = request.getParameter("city");
        String postalCodeParam = request.getParameter("postalCode");
        String countryParam = request.getParameter("country");
        String phoneParam = request.getParameter("phone");

        // pre-checks before Bean Validation - you can think of these as "conversion" checks
        Integer empId = null;
        if( empIdParam != null && !empIdParam.isBlank()){
            empId = Integer.valueOf(empIdParam);
        }

        Employee emp = new Employee();
        emp.setEmpId(Integer.valueOf(empIdParam));
        emp.setFirstName(firstNameParam);
        emp.setLastName(lastNameParam);
        emp.setTitle(titleParam);
        emp.setTitleOfCourtesy(titleOfCourtesyParam);
        //emp.setBirthDate(birthDateParam);
        //emp.setHireDate(hireDateParam);
        emp.setAddress(addressParam);
        emp.setCity(cityParam);
        emp.setPostalCode(Integer.valueOf(postalCodeParam));
        emp.setCountry(countryParam);
        emp.setPhone(phoneParam);

        LOG.info(emp.toString());
    }

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
