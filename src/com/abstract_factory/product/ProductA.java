package com.abstract_factory.product;

/*
 * 产品A
 */
public class ProductA extends Product
{
	public ProductA()
	{
	}

	@Override
	public void show()
	{
		System.out.println("生产了产品A");
	}

}
