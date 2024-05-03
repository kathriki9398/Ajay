package cccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PP {

	
	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);

	System.out.println("enter any nubmer");
	
	for(int num=1;num<=100;num++) {
	int org=num;
	int sum=0;

	while(num>0) {
		
		int ram= num%10;
		
		
		sum=sum+ram*ram*ram;
		
		num=num/10;
		
		
	}
	
	if(num==sum
			) {
		
		System.out.println("aram strang number"+num);
	}
	else {
		System.out.println("not armastrang number");
	}
	
		
	}}
	
	
	
	
}
