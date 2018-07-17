/**
 * 
 */
package br.com.dbserve.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import br.com.dbserve.teste.configuration.JpaConfiguration;

/**
 * @author douglasfs
 *
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"br.com.dbserve.teste"})
public class AppMain {

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}

}
