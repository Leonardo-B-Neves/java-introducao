package com.dio;

import com.dio.base.Order;

//chama a classe Order e printa o codigo
class MyFirstProgras
{
	public static void main(String[] args)
	{
		final Order order = new Order("code1234");
		System.out.println(order);
	
	}
}
