package dc;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "insuranceEntityManagerFactory", transactionManagerRef = "insuranceTransactionManager", basePackages = {
		"dc.insurance.repo" })
public class InsuranceDBConfig {

	@Primary
	@Bean(name = "insuranceDataSource")
	@ConfigurationProperties(prefix = "insurance.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "insuranceEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean barEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("insuranceDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("dc.insurance.domain").persistenceUnit("insurance").build();
	}

	@Primary
	@Bean(name = "insuranceTransactionManager")
	public PlatformTransactionManager barTransactionManager(
			@Qualifier("insuranceEntityManagerFactory") EntityManagerFactory barEntityManagerFactory) {
		return new JpaTransactionManager(barEntityManagerFactory);
	}
}