package com.xworkz.Tournment.bridge;

import com.xworkz.Tournment.internal.*;

public class TournamentImpl implements Tournament {
    @Override
    public TournamentInfo TournamentName(TournamentInfo tournamentInfo) {
        System.out.println("This is TournamentImpl: " + TournamentInfo.name + " - " + TournamentInfo.prize);
        return tournamentInfo;
    }

    @Override
    public TournamentTeam Team(TournamentTeam tournamentTeam) {
        System.out.println("This is 2nd in TournamentImpl: " + TournamentTeam.teamName + " - " + TournamentTeam.players);
        return tournamentTeam;
    }

    @Override
    public TournamentTotal Total(TournamentTotal tournamentTotal) {
        System.out.println("This is 3rd in TournamentImpl: " + TournamentTotal.totalTeams + " - " + TournamentTotal.name);
        return tournamentTotal;
    }

    @Override
    public TournamentPlayer Player(TournamentPlayer tournamentPlayer) {
        System.out.println("This is 4th in TournamentImpl: " + TournamentPlayer.playerName + " - " + TournamentPlayer.jerseyNumber);
        return tournamentPlayer;
    }

    @Override
    public TournamentScore Score(TournamentScore tournamentScore) {
        System.out.println("This is 5th in TournamentImpl: " + TournamentScore.score + " - " + TournamentScore.matchName);
        return tournamentScore;
    }
}
