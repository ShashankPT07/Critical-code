package com.xworkz.Tournment.bridge;


import com.xworkz.Tournment.external.*;

public class PlayerImpl implements Player {
    @Override
    public TournamentInfo TournamentName(TournamentInfo tournamentInfo) {
        System.out.println("This is PlayerImpl: " + TournamentInfo.name + " - " + TournamentInfo.prize);
        return tournamentInfo;
    }

    @Override
    public TournamentTeam Team(TournamentTeam tournamentTeam) {
        System.out.println("This is 2nd in PlayerImpl: " + TournamentTeam.teamName + " - " + TournamentTeam.players);
        return tournamentTeam;
    }

    @Override
    public TournamentTotal Total(TournamentTotal tournamentTotal) {
        System.out.println("This is 3rd in PlayerImpl: " + TournamentTotal.totalTeams + " - " + TournamentTotal.name);
        return tournamentTotal;
    }

    @Override
    public TournamentPlayer Player(TournamentPlayer tournamentPlayer) {
        System.out.println("This is 4th in PlayerImpl: " + TournamentPlayer.playerName + " - " + TournamentPlayer.jerseyNumber);
        return tournamentPlayer;
    }

    @Override
    public TournamentScore Score(TournamentScore tournamentScore) {
        System.out.println("This is 5th in PlayerImpl: " + TournamentScore.score + " - " + TournamentScore.matchName);
        return tournamentScore;
    }
}
