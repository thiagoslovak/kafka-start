package br.com.msintegracaoibge.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Auditoria {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @AfterReturning(pointcut = "execution(* br.com.msintegracaoibge.resource.CnaeResource.*(..))", returning = "result")
    public void auditar(JoinPoint joinPoint, Object result) {

        kafkaTemplate.send("auditoria-topico", "teste");
        System.out.println(result.toString());
    }
}
