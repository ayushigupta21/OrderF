package com.project.Order.dto;

public class BuyerDTO {
	
	int buyerid;
	String name;
	String password;
	String email;
	String phoneno;
	int isprivileged;
	int rewardpoints;
	int isactive;
	
	public BuyerDTO() {
		super();
	}
	
	public BuyerDTO(int buyerid, String name, String password, String email, String phoneno, int isprivileged,
			int rewardpoints, int isactive) {
		super();
		this.buyerid = buyerid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
		this.isprivileged = isprivileged;
		this.rewardpoints = rewardpoints;
		this.isactive= isactive;
	}

	public int getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public int getIsprivileged() {
		return isprivileged;
	}

	public void setIsprivileged(int isprivileged) {
		this.isprivileged = isprivileged;
	}

	public int getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(int rewardpoints) {
		this.rewardpoints = rewardpoints;
	}

	public int getIsactive() {
		return isactive;
	}

	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}
	
	@Override
	public String toString() {
		return "BuyerDTO [buyerid=" + buyerid + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", phoneno=" + phoneno + ", isprivileged=" + isprivileged + ", rewardpoints=" + rewardpoints
				+ ", isactive=" + isactive + "]";
	}

}

