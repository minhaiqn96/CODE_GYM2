import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/productcaculator")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDesciption = request.getParameter("description");
        float listPrice = Float.parseFloat(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount_percent"));

        float result = ((listPrice * discountPercent) / 100);

        PrintWriter writer = response.getWriter();

        writer.println("<h1>Product Discount Calculator");
        writer.println("<h3>Product Description: " + productDesciption);
        writer.println("<h3>Price: $" + listPrice);
        writer.println("<h3>Discount Percent: " + discountPercent + " %");
        writer.println("<h3>Discount Amount: $" + result);
        writer.println("<h3>Discount Price: $" + (listPrice - result));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
