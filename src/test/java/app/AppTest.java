package app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	public static void main(String[] args) {
	
	int a[] = {1,2,2,3,4,2,5,2,6,3,2,1,0};
	
	
	Set<Integer>set = new HashSet<Integer>();
	
	
	for(Integer f:a) {
		set.add(f);
	}
		System.out.println(set);
		
		
		
	}
	
	
	
}
