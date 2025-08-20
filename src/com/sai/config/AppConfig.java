package com.sai.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@ComponentScan(basePackages = "com.sai")
@Configuration
public class AppConfig
{
	public AppConfig()
	{
		System.out.println("0 - param :AppConfig.AppConfig()");
	}
	
	@Bean(name = "lDate4")
	public LocalDate createLocalDate4()
	{
		System.out.println("AppConfig.createLocalDate4()");
		return LocalDate.now();
	}
	@Bean(name = "lDate3")
	public LocalDate createLocalDate3()
	{
		System.out.println("AppConfig.createLocalDate3()");
		return LocalDate.of(2002, 7, 17);
	}
	@Bean(name = "lDate2")
	public LocalDate createLocalDate2()
	{
		System.out.println("AppConfig.createLocalDate2()");
		return LocalDate.of(2014, 8, 12);
	}
	@Bean(name = "lDate1")
	public LocalDate createLocalDate1()
	{
		System.out.println("AppConfig.createLocalDate1()");
		return LocalDate.of(2000, 10, 10);
	}
	
	@Bean
	@Primary
	public LocalTime createLocalTime1()
	{
		System.out.println("AppConfig.createLocalTime()");
		return LocalTime.now();
	}
	@Bean
	public LocalTime createLocalTime2()
	{
		System.out.println("AppConfig.createLocalTime()");
		return LocalTime.now();
	}
}
