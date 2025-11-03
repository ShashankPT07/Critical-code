package com.xworkz.Tournment.external;

import com.xworkz.Tournment.bridge.*;
import com.xworkz.Tournment.internal.*;

public class TournamentRunner {
    public static void main(String[] args) {
        Tournament tournament = new TournamentImpl();
        TournamentInfo info = new TournamentInfo("Champions Cup", 50000);
        tournament.TournamentName(info);

        TournamentTeam team = new TournamentTeam("Warriors", 11);
        tournament.Team(team);

        TournamentTotal total = new TournamentTotal(8, "Championship");
        tournament.Total(total);

        TournamentPlayer player = new TournamentPlayer("John Doe", 10);
        tournament.Player(player);

        TournamentScore score = new TournamentScore(250, "Final Match");
        tournament.Score(score);

        System.out.println("---------------------------------");
    }
}