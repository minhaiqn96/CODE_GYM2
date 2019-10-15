import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet ", urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Xin chào");
        dictionary.put("Apple", "Quả táo");
        dictionary.put("University", "Đại học");
        dictionary.put("Love", "Tình yêu");
        dictionary.put("Romantic", "Lãng mạn");

        String seach = request.getParameter("txtSeach");
        PrintWriter writer = response.getWriter();
        String result = dictionary.get(seach);

        if (result != null) {
            writer.println("Word: " + seach + "<br>");
            writer.println("Result: " + result + "<br>");
        } else {
            writer.println("Not found");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
