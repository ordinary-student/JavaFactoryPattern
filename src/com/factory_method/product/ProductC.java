package com.factory_method.product;

/*
 * 产品C
 */
public class ProductC implements Product
{
	public ProductC()
	{
	}

	@Override
	public void show()
	{
		System.out.println("我是产品C");
	}

}
