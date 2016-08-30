package Promocoes.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//Reúne as funcionalidade das anotacoes abaixo
@SpringBootApplication
//Faz com que o Spring Boot escaneie esse pacote em busca da entidade
@EntityScan("src/main/java/Promocoes.Domain")
//Escaneia  o pacote de entidades do tipo repositorio
@EnableJpaRepositories("src/main/java/Promocoes.Repository")
//Escaneia esses dois pacotes a baixo
@ComponentScan({"src/main/java/Promocoes.Service", "src/main/java/Promocoes.Controller"})
public class AppConfig {
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
}
