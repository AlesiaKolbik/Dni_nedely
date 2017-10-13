package com.company;

public class Main {

    public static void main(String[] args) {
	int n=5;
	if(n==12 || n==1 || n==2)
	{
	    System.out.println("Зима");}
	    else if(n>=3 && n<=5)
	    {
	    	System.out.println("Весна");}
	    	else if(n>=6 && n<=8)
	    	{
	    		System.out.println("Лето");}
	    		else if(n>=9 && n<=11)
	    		{
	    			System.out.println("Осень");}

	else{
		System.out.println("Такого месяца не существует");
		}

    }
}
