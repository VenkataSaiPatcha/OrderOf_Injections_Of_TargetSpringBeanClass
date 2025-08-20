package com.sai.sbean;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder 
{
	@Autowired
	@Qualifier("lDate4")
	private LocalDate date;
	
	@Autowired
	private LocalTime time;
	
	@Autowired
	public WeekDayFinder(@Qualifier("lDate3")LocalDate date,LocalTime time)
	{
		System.out.println("WeekDayFinder.WeekDayFinder()");
		this.date = date;
		this.time=time;
	}
	
	@Autowired
	@Qualifier("lDate2")
	public void setLocalDate(LocalDate date)
	{
		System.out.println("WeekDayFinder.setLocalDate()");
		this.date = date;
	}
	@Autowired
	@Qualifier("lDate1")
	public void putDate(LocalDate date)
	{
		System.out.println("WeekDayFinder.putDate()");
		this.date = date;
	}
	@Autowired
	public void setLocalTime(LocalTime time) // setter injection
	{
		System.out.println("WeekDayFinder.setLocalTime()");
		this.time = time;
	}
	@Autowired
	public void assignTime(LocalTime time)  // arbitary injection
	{
		System.out.println("WeekDayFinder.assignTime()");
		this.time=time;
	}
	
	
	public String FindDayInAWeek(String user)
	{
		int day=date.getDayOfWeek().getValue();
		if(day>=5)
			return "Current day in a week is working day :"+user;
		else
			return "Current day in a week is Holiday day :"+user;
	}
}
