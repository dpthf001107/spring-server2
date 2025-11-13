package site.esgaida.config;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"spring.cloud.compatibility-verifier.enabled=false",
		"spring.cloud.config.server.bootstrap=false",
		"spring.cloud.config.server.native.search-locations=classpath:/config",
		"eureka.client.enabled=false"
})
class ConfigApplicationTests {

	@Test
	void contextLoads() {
	}

}
