package com.abstract_factory.product;

/*
 * 产品B
 */
public class ProductB extends Product
{
	public ProductB()
	{
	}

	@Override
	public void show()
	{
		System.out.println("生产了产品B");
	}

}