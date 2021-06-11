package com.leads.leadsGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import org.flywaydb.core.Flyway;

@EnableAspectJAutoProxy
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/leads", "postgres", null).load();

		// Start the migration
//                try {
                             flyway.migrate();
//                   }
//                 catch (NoSuchMethodError ex) {
//	                           flyway.getClass().getMethod("migrate").invoke(flyway);
//                   }
		SpringApplication.run(MainApplication.class, args);
	}

}
