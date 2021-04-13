package com.divergent.collections.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class RamdomAccessUsed {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		if(list instanceof RandomAccess) {
			System.out.println("Yes It a List");
		}else {
			System.out.println("not a list");
		}
	}

}
