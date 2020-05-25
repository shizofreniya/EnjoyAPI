# EnjoyAPI
���������� ��� EnjoyMickey API

## ���������

1. �������� .jar �� ������� ��� �������� ��� �� ����� �����������.
2. ���������� ���������� � ������ �������
3. ���������� ���������� GSON

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

## ������ ������
```java
import java.io.IOException;

import net.shizofreniya.EnjoyAPI.EnjoyAPI;
import net.shizofreniya.EnjoyAPI.EnjoyAPIResponse;

public class Main {
	public static void main(String[] argv) throws IOException {
		EnjoyAPIResponse res = EnjoyAPI.check("370506027767955466", "����");
		
		if(res.getCode() == 404) {
			System.out.println(res.getMessage());
		} else if(res.getCode() == 200) {
			System.out.printf("\nDiscord ID: %s\nReason: %s", res.getBlacklisted().getDiscordId(), res.getBlacklisted().getReason());
		}
	}
}
```

