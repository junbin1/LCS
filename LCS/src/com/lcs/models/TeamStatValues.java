package com.lcs.models;

public class TeamStatValues {
	
	// set initial default values for calculating score
	
	private int		perWin;
	private	int		perBaron;
	private int		perDrag;
	private int		perFB;
	private int		perTower;
	
	private int 	total;

	public int getPerWin() {
		return perWin;
	}

	public void setPerWin(int perWin) {
		this.perWin = perWin;
	}

	public int getPerBaron() {
		return perBaron;
	}

	public void setPerBaron(int perBaron) {
		this.perBaron = perBaron;
	}

	public int getPerDrag() {
		return perDrag;
	}

	public void setPerDrag(int perDrag) {
		this.perDrag = perDrag;
	}

	public int getPerFB() {
		return perFB;
	}

	public void setPerFB(int perFB) {
		this.perFB = perFB;
	}

	public int getPerTower() {
		return perTower;
	}

	public void setPerTower(int perTower) {
		this.perTower = perTower;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
