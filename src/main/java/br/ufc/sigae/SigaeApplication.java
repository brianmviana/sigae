package br.ufc.sigae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(value={"br.ufc.sigae","br.ufc.sigae.service","br.ufc.sigae.repository","br.ufc.sigae.controller","br.ufc.sigae.model"})
public class SigaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigaeApplication.class, args);
	}
}
