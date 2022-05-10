package Practice;

public class Time {
	
	int hrs,min,sec;
	
	Time()
	{
		hrs=min=sec=0;
	}

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	
	void add(Time t)
	{
		this.sec+=t.sec;
		if(this.sec>=60)
		{
			this.min+=1;
			this.sec-=60;
		}
		this.min+=t.min;
		if(this.min>=60)
		{
			this.hrs+=1;
			this.min-=60;
		}
		this.hrs+=t.hrs;
		
	}
	
	void display()
	{
		System.out.println(this.hrs+" : "+this.min+" : "+this.sec);
	}
	
	

}
