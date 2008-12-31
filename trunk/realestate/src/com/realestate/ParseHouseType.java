package com.realestate;

public class ParseHouseType {
	public String toString(int type){
		String string;
		String[] mapping = new String[]{"��","һ","��","��","��","��"};
		int x,y;
		
		x = type / 10;
		y = type % 10;
		//System.out.println(x+"__"+y);
		string = mapping[x]+"��"+mapping[y]+"��";
		
		return string;
	}
	/*
	public static void main(String args[]){
		ParseHouseType parse = new ParseHouseType();
		System.out.println(parse.toString(21));
	}
	*/
}
