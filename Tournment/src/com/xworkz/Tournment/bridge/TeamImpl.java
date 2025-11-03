package com.xworkz.Tournment.bridge;


import com.xworkz.Tournment.internal.*;

public class TeamImpl implements Team {
    @Override
    public TournamentInfo TournamentName(TournamentInfo tournamentInfo) {
        System.out.println("This is TeamImpl: " + TournamentInfo.name + " - " + TournamentInfo.prize);
        return tournamentInfo;
    }

    @Override
    public TournamentTeam Team(TournamentTeam tournamentTeam) {
        System.out.println("This is 2nd in TeamImpl: " + TournamentTeam.teamName + " - " + TournamentTeam.players);
        return tournamentTeam;
    }

    @Override
    public TournamentTotal Total(TournamentTotal tournamentTotal) {
        System.out.println("This is 3rd in TeamImpl: " + TournamentTotal.totalTeams + " - " + TournamentTotal.name);
        return tournamentTotal;
    }

    @Override
    public TournamentPlayer Player(TournamentPlayer tournamentPlayer) {
        System.out.println("This is 4th in TeamImpl: " + TournamentPlayer.playerName + " - " + TournamentPlayer.jerseyNumber);
        return tournamentPlayer;
    }

    @Override
    public TournamentScore Score(TournamentScore tournamentScore) {
        System.out.println("This is 5th in TeamImpl: " + TournamentScore.score + " - " + TournamentScore.matchName);
        return tournamentScore;
    }
}


