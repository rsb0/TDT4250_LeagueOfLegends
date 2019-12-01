# TDT4250_LeagueOfLegends

![League of legends logo](lol-logo.jpg)

This is a project delivery for the NTNU course TDT4250, created by Henrik Knudsen, Hallvard EchterMeyer, Stian Mahle and Rune Strøm Brekke.

## Installation guide

The project can be installed and ran by following these instructions:

1. Download the github repository.
2. Install your choice of Eclipse IDE.
3. Install any needed project dependencies:
   1. EMF modelling tools
   2. Sirius
   3. Eclipse Developer tools
4. Import the repository's content into your eclipse workspace.
5. Create a new runtime configuration based on the project and launch a separate eclipse application with it.
6. Import LeagueOfLegends and LeagueOfLegends.project projects into the eclipse application.

The application should now be ready to be tried out:
1. The provided model instance (leagueoflegends.leagueoflegends) can now be inspected within the LeagueOfLegends project.
2. Any new representations can be created through using the Aird editor with representations.aird, within the LeagueOfLegends project (A representation of the League is already provided, found just under the top level League object in leagueoflegends.leagueoflegends, called "league").
3. The ViewPoint specification can be inspected, through utilizing the ViewPoint Specification Editor on project.odesign, found in LeagueOfLegends.project/description.

## Description

The group chose task 1 for the project assignment:

> Find a public or easily available data source with some volume of data and interesting level of complexity. Model the data using Ecore and implement an transformation facility so you can import, view and process the data using EMF. Then create a viewer and editor for the data using (preferably) Sirius or EMF Forms, that can be installed into Eclipse.

We chose to model matchup data for the popular game League of Legends (LOL), utilizing EMF [[1]](https://www.eclipse.org/modeling/emf/). The game is a team-based game, pitting two 5 person teams against each other. The overall game objective is to earn gold, defeat your opponent's champions and destroy their homebase.

 The data was gathered from [Oracle Elixir's Database](https://oracleselixir.com/match-data/.) and focuses on LOL's european division (EULCS). The data has been read from available CSV files and serialized to a XMI format. It contains data from the 2018 regular season, playoffs and regional qualifiers for the LOL world cup.

## Ecore Model

The project's Ecore model follows a hierarchical structure, with League as its top element, containing data related to a single competitive division. The model has a set of related constraints, to ensure the integrity of its data source.

### League

League has a associated name as well as a set of Seasons, Teams and Champions. It also has a LeagueStats object, an aggregate of selective matchup data, gathered throughout its seasons.

#### LeagueStats

LeagueStats is contained by a league and holds aggregate data (ie. total kills and deaths) for the league, as well as player and champion data (ie. player with most assists, champion with highest Kill/Death/Assist ratio).

### Season

Season represents a unique period of play within a league. There are traditionally three distinct types of seasons: Regular season, playoffs and regional qualifiers. This is indicated by the Season's split type.

Each Season has a name (based on split type and year), is contained within a specific league, and contains a set of matches played between different Teams.

### Match

Match represents a unique matchup between two Teams. A Match contains one or more games. The winner of the match is decided based on how many games each team won and the match's BestOf format.

Each Match also has a unique match id and is contained within a specific season.

#### BestOf

BestOf is an EEnum, depicting the format of a match. A regular season is played with single elimination matches, while all other seasons (playoff and regionals) are played best of 5.

### Game

Game represents a unique game between two Teams. The two teams are identified as either the red or the blue team, with one of them being the winner of the game.

Each Game has a unique game id, is contained within a specific Match and contains a multitude of Stats object, specifically GameStats, GameTeamStats and GamePlayerStats.

#### GamePlayerStats

GamePlayerStats represents a player's stats for a specific game, holding information about their amount of kills, deaths, gold acquired, among other data. As a game is played by a minimum of 10 players, Game contains a minimum of 10 GamePlayerStats objects. 

#### GameTeamStats

GameTeamStats represents a team's stats for a specific game, holding aggregate information based on their player's GamePlayerStats objects.

#### GameStats

GameStats holds aggregate information, based on the participating teams' GameTeamStats objects.

### Team

Team represents a unique team, participating in the league. It has a name, is contained within a specific league and contains a set of players, playing for the team. Its also related to a TeamStats object, containing information about the team's stats throughout the league.

#### TeamStats

TeamStats represents a team's stats throughout the league, holding aggregate information from the team's GameTeamStats, as well as unique team information (ie. which team member had the most kills etc.). 

### Player

Player represents a unique player, participating in the league. The player has a name (Player alias/gamer tag) and is contained within a specific team. They are also related to a PlayerStats object, containing information about the player's stats throughout the league. 

#### PlayerStats

PlayerStats represents a player's stats throughout the league, holding aggregate information from the player's GamePlayerStats.

### Champion

Champion represents a playable character within League of Legends. It has a name associated with it and is contained within a specific League. It's also related to a ChampionStats object, containing information about the champion's stats throughout the league.

#### ChampionStats

ChampionStats represents a champion's stats throughout the league, holding aggregate information from players' GamePlayerStats, where the player played the champion.

## Sirius Editor

The project utilizes Sirius [[2]](https://www.eclipse.org/sirius/overview.html) to create a graphical model workbench, based on the underlying Ecore model.

