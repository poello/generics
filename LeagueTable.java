package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team>{ //cannot write Team<Sport> after extends
                                //unless <T extends Sport, U extends Team<T>>
    private String name;
    ArrayList<T> table;

    public LeagueTable(String name) {
        this.name = name;
        this.table = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if(!table.contains(team)) {
            table.add(team);
            return true;
        }
        System.out.println("Cannot add team to " + this.name);
        return false;
    }

    public void printLeague() {
        Collections.sort(table);
        for(T t : table) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
