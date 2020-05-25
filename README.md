# EnjoyAPI
Библиотека для EnjoyMickey API

## Установка

1. Скачайте .jar из релизов или соберите код из этого репозитория.
2. Подключите библиотеку к вашему проекту
3. Подключите библиотеку GSON

Gradle:

```gradle
dependencies {
	implementation 'com.google.code.gson:gson:2.8.6'
}
```

Maven:

```xml
<dependency>
	<groupId>com.google.code.gson</groupId>
	<artifactId>gson</artifactId>
	<version>2.8.6</version>
</dependency>
```

## Пример работы
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

