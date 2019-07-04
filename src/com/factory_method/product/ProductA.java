package com.factory_method.product;

/*
 * 产品A
 */
public class ProductA implements Product
{
	public ProductA()
	{
	}

	@Override
	public void show()
	{
		System.out.println("我是产品A");
	}

}
