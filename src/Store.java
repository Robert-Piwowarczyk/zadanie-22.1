import org.springframework.stereotype.Repository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Repository
public class Store {
    User user1 = new User("Daniel", "Aback", 15);
    User user2 = new User("Adam", "Nowak", 43);
    User user3 = new User("Beata", "Zagórska", 28);

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException,
            IOException {
        PrintWriter out = response.getWriter();

        out.println(request.getParameter(String.valueOf(user1)));
        out.println(request.getParameter(String.valueOf(user2)));
        out.println(request.getParameter(String.valueOf(user3)));
    }
}