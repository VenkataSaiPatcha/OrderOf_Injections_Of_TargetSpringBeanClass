package com.sai.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sai.config.AppConfig;
import com.sai.sbean.WeekDayFinder;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class); // object was created for AppConfig class
	
		WeekDayFinder  message=	ctx.getBean("wdf",WeekDayFinder.class); // objected was created to WeekDayFinder class
	
	String day=message.FindDayInAWeek("Sai");
		System.out.println(day);
		
		ctx.close();
		
	}

}
