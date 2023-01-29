package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author johnn
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age= request.getParameter("age");
        
        //Empty text verification
        if (age == null || age.equals("")) {
            String ageouput = "You must give your current age.<br>";
            
            request.setAttribute("ageoutput", ageouput);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
            return;
        }
        //String verification
        else if (isNumeric(age)) {
            int temp = Integer.parseInt(age);
            temp++;
            
            String ageouput = "Your age next birthday will be " + temp + "<br>";
            
            request.setAttribute("ageoutput", ageouput);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
            return;
        }
        else {
            String ageouput = "You must enter a number.<br>";
            
            request.setAttribute("ageoutput", ageouput);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
            return;
        }
    }
    
    //Created my own verification if input is numeric
    public static boolean isNumeric(String x) {
        try {
            Integer.parseInt(x);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }
}
