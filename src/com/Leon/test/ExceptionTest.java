package com.Leon.test;

import java.sql.SQLException;

public class ExceptionTest {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int a[]={1,2,3};
		try{
			for(int i = 0 ;i<5;i++){
				System.out.println(a[i]);
			}
		}catch(NullPointerException e){
			e.printStackTrace();
			
		}finally{
			System.out.println("×îÖÕÖ´ÐÐ~");
		}
	}
}
