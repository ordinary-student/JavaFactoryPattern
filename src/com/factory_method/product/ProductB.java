package com.factory_method.product;

/*
 * 产品B
 */
public class ProductB implements Product
{
	public ProductB()
	{
	}

	@Override
	public void show()
	{
		System.out.println("我是产品B");
	}

}