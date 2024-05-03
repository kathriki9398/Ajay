package pojoclasspractice;

import java.io.File;
import java.io.File.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pojodetails {
	

	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<Integer>();
		
		
		list.add(2);
		list.add(3);
		System.out.println(list);
		for(Integer a:list) {
			System.out.println(a);
		}
		
	}
	
	
	
}
