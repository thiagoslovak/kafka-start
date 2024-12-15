package br.com.msintegracaoibge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MsIntegracaoIbgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsIntegracaoIbgeApplication.class, args);
	}
}
