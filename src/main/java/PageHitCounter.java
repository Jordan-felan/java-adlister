import java.io.*;
import java.sql.Date;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="PageHitCounter", urlPatterns = "/count")
public class PageHitCounter extends HttpServlet {

    private int hitCount;

    public void init() {
        // Reset hit counter.
        hitCount = 0;
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        response.setContentType("text/html");

        // This method executes whenever the servlet is loaded or refreshed
        // increment hitCount +1 each time
        hitCount++;
        PrintWriter out = response.getWriter();
        String title = "Total Number of Hits";

        if(request.getParameter("reset") != null) {
            hitCount = 0;
            out.println(
                    "<html>\n" +
                            "<head><title>" + title + "</title></head>\n" +
                            "<body bgcolor = \"#f0f0f0\">\n" +
                            "<h1 align = \"center\">" + title + "</h1>\n" +
                            "<h2 align = \"center\">" + hitCount + "</h2>\n" +
                            "</body> </html>"
            );
        }else {
        out.println(
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<h2 align = \"center\">" + hitCount + "</h2>\n" +
                "</body> </html>"
      );
    }
    }
}
