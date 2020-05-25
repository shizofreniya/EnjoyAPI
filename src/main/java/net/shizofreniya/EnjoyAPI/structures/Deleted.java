package net.shizofreniya.EnjoyAPI.structures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Deleted {
	@SerializedName("discord_id")
	@Expose
	private String discordId;
	
	@SerializedName("reason")
	@Expose
	private Object reason;
	
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