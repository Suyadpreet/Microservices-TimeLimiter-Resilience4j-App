package com.suyad.services;

import org.springframework.stereotype.Service;

@Service
public class SlowService 
{
	public String slowMethod()
	{
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "SlowMethod() has been executed Successfully.......";
	}
}
