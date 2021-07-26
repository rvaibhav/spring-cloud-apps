package org.test.demo.domain;

import java.util.Set;

public class Team {

    private String name;

    private String location;

    private String mascottte;

    private Set<Player> players;

    public Team() {
    }

    public Team(String name, String location, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascottte() {
        return mascottte;
    }

    public void setMascottte(String mascottte) {
        this.mascottte = mascottte;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
