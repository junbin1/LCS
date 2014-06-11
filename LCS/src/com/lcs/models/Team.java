package com.lcs.models;

public class Team {
	
	// populate team object based on JSON from API
	
	private String	teamName;
	private int		teamID;
	
	private int		teamWin;
	private	int		teamBaron;
	private int		teamDrag;
	private int		teamFB;
	private int		teamTower;
	
	private double	total;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}

	public int getTeamWin() {
		return teamWin;
	}

	public void setTeamWin(int teamWin) {
		this.teamWin = teamWin;
	}

	public int getTeamBaron() {
		return teamBaron;
	}

	public void setTeamBaron(int teamBaron) {
		this.teamBaron = teamBaron;
	}

	public int getTeamDrag() {
		return teamDrag;
	}

	public void setTeamDrag(int teamDrag) {
		this.teamDrag = teamDrag;
	}

	public int getTeamFB() {
		return teamFB;
	}

	public void setTeamFB(int teamFB) {
		this.teamFB = teamFB;
	}

	public int getTeamTower() {
		return teamTower;
	}

	public void setTeamTower(int teamTower) {
		this.teamTower = teamTower;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
