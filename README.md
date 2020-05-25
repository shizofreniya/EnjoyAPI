# EnjoyAPI
Библиотека для работы с EnjoyMickey API

## Установка

Скачайте готовый .jar из последнего релиза или соберите код самостоятельно. Затем подключите библиотеку к вашему проекту

## Пример использования
```java
import java.io.IOException;

import net.shizofreniya.EnjoyAPI.EnjoyAPI;
import net.shizofreniya.EnjoyAPI.EnjoyAPIResponse;

public class Main {
	public static void main(String[] argv) throws IOException {
		EnjoyAPIResponse res = EnjoyAPI.check("370506027767955466", "ключ");
		
		if(res.getCode() == 404) {
			System.out.println(res.getMessage());
		} else if(res.getCode() == 200) {
			System.out.printf("\nDiscord ID: %s\nReason: %s", res.getBlacklisted().getDiscordId(), res.getBlacklisted().getReason());
		}
	}
}
```

