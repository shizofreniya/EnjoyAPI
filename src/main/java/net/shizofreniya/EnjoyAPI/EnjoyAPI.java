package net.shizofreniya.EnjoyAPI;

import net.shizofreniya.EnjoyAPI.EnjoyAPIResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import com.google.gson.Gson;

public class EnjoyAPI {
	public static EnjoyAPIResponse check(String id, String token) throws IOException {
		URL url = new URL("https://api.enjoymickeybot.info/check/" + id);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Authorization", token);
		con.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:15.0) Gecko/20100101 Firefox/15.0.1");
		con.connect();
		
		BufferedReader r = new BufferedReader(new InputStreamReader(con.getInputStream(), Charset.forName("UTF-8")));

		StringBuilder sb = new StringBuilder();
		String jLine;
		while((jLine = r.readLine()) != null) sb.append(jLine);
		
		return new Gson().fromJson(sb.toString(), EnjoyAPIResponse.class);
	}
}