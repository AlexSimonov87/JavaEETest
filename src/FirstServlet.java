import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter pw = response.getWriter();



        pw.write("<html>"+"<head>"+"<title> First servlet </title>"+"</head>"+"<body>\n"
                +"<table border=\"2\" cellspacing=\"2\">\n"
                +    "<tr>                              \n"
                +       "<td>PERS_ID</td>               \n"
                +       "<td>DEPART_ID</td>             \n"
                +       "<td>FIRSTNAME</td>             \n"
                +       "<td>SALARY</td>                \n"
                +    "</tr>                             \n"
                +    "<tr>                              \n"
                +       "<td>3045</td>                  \n"
                +       "<td>2</td>                     \n"
                +       "<td>SMIRNOV</td>               \n"
                +       "<td>29000</td>                 \n"
                +    "</tr>                             \n"
                +    "<tr>                              \n"
                +       "<td>4057</td>                  \n"
                +       "<td>6</td>                     \n"
                +       "<td>VASILIEV</td>              \n"
                +       "<td>25000</td>                 \n"
                +    "</tr>                             \n"
                + "</table>"+"</body>"+"</html>");


    }
}


