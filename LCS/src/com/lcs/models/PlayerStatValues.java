package com.lcs.models;

public class PlayerStatValues {
	
	// set initial default values for calculating score
	
	private int		perKill;
	private double	perDeath;
	private double	perAssist;
	private double	perCS;
	private int		perTkill;
	private int		perQkill;
	private int		perPkill;
	private int		assistKillBonus;
	
	private double 	total;

	public int getPerKill() {
		return perKill;
	}

	public void setPerKill(int perKill) {
		this.perKill = perKill;
	}

	public double getPerDeath() {
		return perDeath;
	}

	public void setPerDeath(double perDeath) {
		this.perDeath = perDeath;
	}

	public double getPerAssist() {
		return perAssist;
	}

	public void setPerAssist(double perAssist) {
		this.perAssist = perAssist;
	}

	public double getPerCS() {
		return perCS;
	}

	public void setPerCS(double perCS) {
		this.perCS = perCS;
	}

	public int getPerTkill() {
		return perTkill;
	}

	public void setPerTkill(int perTkill) {
		this.perTkill = perTkill;
	}

	public int getPerQkill() {
		return perQkill;
	}

	public void setPerQkill(int perQkill) {
		this.perQkill = perQkill;
	}

	public int getPerPkill() {
		return perPkill;
	}

	public void setPerPkill(int perPkill) {
		this.perPkill = perPkill;
	}

	public int getAssistKillBonus() {
		return assistKillBonus;
	}

	public void setAssistKillBonus(int assistKillBonus) {
		this.assistKillBonus = assistKillBonus;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
