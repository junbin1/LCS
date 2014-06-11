package com.lcs.models;

public class Player {
	
	// populate player object based on JSON from API
	
	private String 	playerName;
	private int		playerID;
	private String	playerTeamName;
	private int		playerTeamID;
	private int		playerPosition;
	
	private int		assists;
	private int		deaths;
	private int		kills;
	private int		cs;
	private int		doubleKills;
	private int		tripleKills;
	private int		quadKills;
	private int		pentaKills;
	
	private double 	total;
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public String getPlayerTeamName() {
		return playerTeamName;
	}
	public void setPlayerTeamName(String playerTeamName) {
		this.playerTeamName = playerTeamName;
	}
	public int getPlayerTeamID() {
		return playerTeamID;
	}
	public void setPlayerTeamID(int playerTeamID) {
		this.playerTeamID = playerTeamID;
	}
	public int getPlayerPosition() {
		return playerPosition;
	}
	public void setPlayerPosition(int playerPosition) {
		this.playerPosition = playerPosition;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public int getCs() {
		return cs;
	}
	public void setCs(int cs) {
		this.cs = cs;
	}
	public int getDoubleKills() {
		return doubleKills;
	}
	public void setDoubleKills(int doubleKills) {
		this.doubleKills = doubleKills;
	}
	public int getTripleKills() {
		return tripleKills;
	}
	public void setTripleKills(int tripleKills) {
		this.tripleKills = tripleKills;
	}
	public int getQuadKills() {
		return quadKills;
	}
	public void setQuadKills(int quadKills) {
		this.quadKills = quadKills;
	}
	public int getPentaKills() {
		return pentaKills;
	}
	public void setPentaKills(int pentaKills) {
		this.pentaKills = pentaKills;
	}
	
	
}


	
	
	
