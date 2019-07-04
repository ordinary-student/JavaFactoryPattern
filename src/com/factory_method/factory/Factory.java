package com.factory_method.factory;

import com.factory_method.product.Product;
import com.factory_method.product.ProductA;
import com.factory_method.product.ProductB;
import com.factory_method.product.ProductC;

/*
 * 工厂类
 */
public class Factory
{
	/*
	 * 普通工厂-生产产品的方法
	 */
	public Product produce(String type)
	{
		if (type.equals("A"))
		{
			return new ProductA();

		} else if (type.equals("B"))
		{
			return new ProductB();

		} else if (type.equals("C"))
		{
			return new ProductC();

		} else
		{
			System.out.println("请输入正确的类型！");
			return null;
		}
	}

	/*
	 * 多个工厂方法模式
	 */
	public Product newProductA()
	{
		return new ProductA();
	}

	public Product newProductB()
	{
		return new ProductB();
	}

	public Product newProductC()
	{
		return new ProductC();
	}

	/*
	 * 静态工厂-生产产品的方法
	 */
	public static Product createProduct(String type)
	{
		switch (type)
			{
			case "A":
				return new ProductA();
			case "B":
				return new ProductB();
			case "C":
				return new ProductC();
			default:
				System.out.println("请输入正确的类型！");
				return null;
			}
	}

	public static Product createProductA()
	{
		return new ProductA();
	}

	public static Product createProductB()
	{
		return new ProductB();
	}

	public static Product createProductC()
	{
		return new ProductC();
	}
}
