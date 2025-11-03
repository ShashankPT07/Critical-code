package com.xworkz.Tournment.bridge;

import com.xworkz.Tournment.internal.*;

public interface Tournament {
    TournamentInfo TournamentName(TournamentInfo tournamentInfo);
    TournamentTeam Team(TournamentTeam tournamentTeam);
    TournamentTotal Total(TournamentTotal tournamentTotal);
    TournamentPlayer Player(TournamentPlayer tournamentPlayer);
    TournamentScore Score(TournamentScore tournamentScore);
}



