package net.shizofreniya.EnjoyAPI.structures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Blacklisted {
	@SerializedName("id")
	@Expose
	private Integer id;
	
	@SerializedName("name")
	@Expose
	private Object name;
	
	@SerializedName("discord_id")
	@Expose
	private String discordId;
	
	@SerializedName("reason")
	@Expose
	private Object reason;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Object getName() {
		return name;
	}
	
	public void setName(Object name) {
		this.name = name;
	}
	
	public String getDiscordId() {
		return discordId;
	}
	
	public void setDiscordId(String discordId) {
		this.discordId = discordId;
	}
	
	public Object getReason() {
		return reason;
	}
	
	public void setReason(Object reason) {
		this.reason = reason;
	}

}