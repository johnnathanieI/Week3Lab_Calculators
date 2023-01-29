package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author johnn
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String numoutput = this.getServletConfig().getInitParameter("numoutput");
        request.setAttribute("numoutput", numoutput);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");

        //Verify if textboxes are empty
        if (first == null || first.equals("") || second == null || second.equals("")) {
            String numoutput = "invalid<br>";
            request.setAttribute("numoutput", numoutput);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        /*
            Two step validation process
            Verify first if input is numeric
            Verify which button was pressed
        */
        if (isNumeric(first) || isNumeric(second)) {
            
            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);
            int temp;
            String numoutput;
            
            //Button variable
            String button = request.getParameter("submit");
            
            switch (button) {
                case "+":
                    temp = a + b;
                    
                    numoutput = temp + "<br>";
                    request.setAttribute("numoutput", numoutput);
                    
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                    break;
                case "-":
                    temp = a - b;
                    
                    numoutput = temp + "<br>";
                    request.setAttribute("numoutput", numoutput);
                    
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                    
                    break;
                case "*":
                    temp = a * b;
                    
                    numoutput = temp + "<br>";
                    request.setAttribute("numoutput", numoutput);
                    
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                    
                    break;
                case "%":
                    temp = a / b;
                    
                    numoutput = temp + "<br>";
                    request.setAttribute("numoutput", numoutput);
                    
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                        
                    break;
            }
        }
        else {
            String numoutput = "invalid<br>";
            request.setAttribute("numoutput", numoutput);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
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
