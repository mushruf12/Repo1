package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lambda.Mushruf;

public class List1 implements Mushruf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Mushruf> list = new ArrayList<Mushruf>();
		List1 l = new List1();
		list.add(l.print(1));
		list.add(2);
		list.forEach(g->System.out.println(g));
	}

}
