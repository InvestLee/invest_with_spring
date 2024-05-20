package jhlee.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.quant_invest.db")
@EnableJpaRepositories(basePackages = "org.quant_invest.db")
public class JpaConfig {
}
