package net.shizofreniya.EnjoyAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.shizofreniya.EnjoyAPI.structures.Blacklisted;
import net.shizofreniya.EnjoyAPI.structures.Deleted;

public class EnjoyAPIResponse {
	@SerializedName("code")
	@Expose
	private Integer code;
	
	@SerializedName("message")
	@Expose
	private String message;
	
	@SerializedName("blacklisted")
	@Expose
	private Blacklisted blacklist;
	
	@SerializedName("deleted")
	@Expose
	private Deleted deleted;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Blacklisted getBlacklisted() {
		return blacklist;
	}

	public void setBlacklisted(Blacklisted blacklist) {
		this.blacklist = blacklist;
	}

	public Deleted getDeleted() {
		return deleted;
	}

	public void setDeleted(Deleted deleted) {
		this.deleted = deleted;
	}
}