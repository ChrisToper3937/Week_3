import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Chris
 */
@WebServlet(value = "/getuser")
public class AjaxServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userid = req.getParameter("uid");
        resp.setContentType("text/html;charset=utf-8");
        int uid = Integer.parseInt(userid);
        Users users = new Users();
        switch (uid){
            case 1:users.setUserName("春天");break;
            case 2:users.setUserName("夏天");break;
            case 3:users.setUserName("秋天");break;
        }

        Gson gson=new Gson();
        String json = gson.toJson(users);
        Users fromJson = gson.fromJson(json, Users.class);
        PrintWriter writer = resp.getWriter();
        writer.print(fromJson);
    }
}

