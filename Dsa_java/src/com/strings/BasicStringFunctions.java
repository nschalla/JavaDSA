package com.strings;

public class BasicStringFunctions {

	public static void main(String[] args) {

		    String str="NarayanaSwamyChalla";
		    int[] count=new int[26];
		    for(int i=0;i<26;i++){
		        count[str.charAt(i)-'a']++;
		    }
		    for(int j=0;j<26;j++){
		        if(count[j]>0){
		            System.out.println((char)(j+'a')+" "+count[j]);
		        }
		    }
		}
	}


