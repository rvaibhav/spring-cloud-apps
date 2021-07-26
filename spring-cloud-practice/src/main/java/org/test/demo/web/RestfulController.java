package org.test.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.test.demo.domain.Player;
import org.test.demo.domain.Team;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Controller
public class RestfulController {

    private Team team;

    @PostConstruct
    public void init() {
        Set<Player> players = new HashSet<>();
        players.add(new Player("KL Rahul", "Opener"));
        players.add(new Player("Rishabh Pant", "Keeper"));
        team = new Team("Team India", "Delhi", players);
    }

    @RequestMapping("/hi")
    public @ResponseBody Team hiThere() {
        return team;
    }

}
