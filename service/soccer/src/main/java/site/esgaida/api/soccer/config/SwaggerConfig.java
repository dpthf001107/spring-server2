package site.esgaida.api.soccer.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
		info = @Info(
				title = "Soccer Service",
				description = "Soccer 서비스 API 문서",
				version = "v1"
		),
		tags = {
				@Tag(name = "Player", description = "선수 관리 기능"),
				@Tag(name = "Team", description = "팀 관리 기능"),
				@Tag(name = "Schedule", description = "경기 일정 기능"),
				@Tag(name = "Stadium", description = "구장 관리 기능")
		}
)
@Configuration
public class SwaggerConfig {

	private static final String BEARER_TOKEN_PREFIX = "bearer";

	@Bean
	public OpenAPI openAPI() {
		String securityJwtName = "JWT";
		SecurityRequirement securityRequirement = new SecurityRequirement().addList(securityJwtName);
		Components components = new Components()
				.addSecuritySchemes(securityJwtName, new SecurityScheme()
						.name(securityJwtName)
						.type(SecurityScheme.Type.HTTP)
						.scheme(BEARER_TOKEN_PREFIX)
						.bearerFormat("JWT"));

		return new OpenAPI()
				.addSecurityItem(securityRequirement)
				.components(components);
	}
}
