package com.braindata.bankmanagement.model;

public class Account 
{
	private int accNo;               //set get
	private String name;
	private String mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
	
	public void setAccNo (int acc)
	{
		this.accNo=acc;
	}
	public int getAccno()
	{
		return accNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMobNo(String mob)
	{
		this.mobNo=mob;
	}
	public String getMobNo()
	{
		return mobNo;
	}
	public void setAdharNo(String adhar)
	{
		this.adharNo=adhar;
	}
	public String getAdharNo()
	{
		return adharNo;
	}
	public void setGender(String gu)
	{
		this.gender=gu;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
}
