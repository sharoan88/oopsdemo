package oopsdemo1;
//instance class
public class ThisDemo {
	   int age;
       //instance method
	  //this keyword is used in instance method to access object 
       void init(int age)
       {
    	   this.age = age;//this keyword refers to the current
       }
       
public static void main(String[] args) {
		ThisDemo td1 = new ThisDemo();
		td1.init(20);
		
		System.out.println("The value of age is :"+td1.age);
	}
}
