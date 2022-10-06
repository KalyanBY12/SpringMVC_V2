package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PlayerController {

    @RequestMapping(value="/searchPlayerForm")

    public String searchPlayerForm()
    {
        return "show-player-form";
    }

    @RequestMapping(value = "/showPlayerDetails")
    public String showPlayerDetails(HttpServletRequest request, Model model)
    {
        String pName = request.getParameter("playerName");
        model.addAttribute("name",pName);
        return "player-details";
    }


}
