package io.github.ijj01.intertrack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class IntertrackApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
