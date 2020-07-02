import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import javax.servlet.http.HttpServletRequest;

@Controller
@Repository
public class ConstructorController {

    @ResponseBody
    @ReqestMapping("/users")
    public String usersList(HttpServletRequest request) {
        String firstName = request.getParameter("imię");
        String lastName = request.getParameter("nazwisko");
        String ageString = request.getParameter("wiek");
        int age = Integer.parseInt(ageString);

        return "imię " + firstName + "" + "nazwisko" + lastName + "" + "wiek" + age;
    }
}