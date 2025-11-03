package com.xworkz.Tournment.bridge;

import com.xworkz.Tournment.internal.*;

public class ScoreImpl implements Score {
    @Override
    public TournamentInfo TournamentName(TournamentInfo tournamentInfo) {
        System.out.println("This is ScoreImpl: " + TournamentInfo.name + " - " + TournamentInfo.prize);
        return tournamentInfo;
    }

    @Override
    public TournamentTeam Team(TournamentTeam tournamentTeam) {
        System.out.println("This is 2nd in ScoreImpl: " + TournamentTeam.teamName + " - " + TournamentTeam.players);
        return tournamentTeam;
    }

    @Override
    public TournamentTotal Total(TournamentTotal tournamentTotal) {
        System.out.println("This is 3rd in ScoreImpl: " + TournamentTotal.totalTeams + " - " + TournamentTotal.name);
        return tournamentTotal;
    }

    @Override
    public TournamentPlayer Player(TournamentPlayer tournamentPlayer) {
        System.out.println("This is 4th in ScoreImpl: " + TournamentPlayer.playerName + " - " + TournamentPlayer.jerseyNumber);
        return tournamentPlayer;
    }

    @Override
    public TournamentScore Score(TournamentScore tournamentScore) {
        System.out.println("This is 5th in ScoreImpl: " + TournamentScore.score + " - " + TournamentScore.matchName);
        return tournamentScore;
    }
}
