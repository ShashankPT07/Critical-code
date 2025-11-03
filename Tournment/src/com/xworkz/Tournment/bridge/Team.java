package com.xworkz.Tournment.bridge;

import com.xworkz.Tournment.external.*;

public interface Team {
    TournamentInfo TournamentName(TournamentInfo tournamentInfo);
    TournamentTeam Team(TournamentTeam tournamentTeam);
    TournamentTotal Total(TournamentTotal tournamentTotal);
    TournamentPlayer Player(TournamentPlayer tournamentPlayer);
    TournamentScore Score(TournamentScore tournamentScore);

    com.xworkz.Tournment.internal.TournamentInfo TournamentName(com.xworkz.Tournment.internal.TournamentInfo tournamentInfo);

    com.xworkz.Tournment.internal.TournamentTeam Team(com.xworkz.Tournment.internal.TournamentTeam tournamentTeam);

    com.xworkz.Tournment.internal.TournamentTotal Total(com.xworkz.Tournment.internal.TournamentTotal tournamentTotal);

    com.xworkz.Tournment.internal.TournamentPlayer Player(com.xworkz.Tournment.internal.TournamentPlayer tournamentPlayer);

    com.xworkz.Tournment.internal.TournamentScore Score(com.xworkz.Tournment.internal.TournamentScore tournamentScore);
}
