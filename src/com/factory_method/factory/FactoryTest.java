package com.factory_method.factory;

import com.factory_method.product.Product;

/*
 * 工厂方法模式测试类
 */
public class FactoryTest
{

	public static void main(String[] args)
	{
		// 建工厂
		Factory factory = new Factory();

		/*** 普通方法 ***/
		// 生产产品A
		Product a = factory.produce("A");
		a.show();

		// 生产产品B
		Product b = factory.produce("B");
		b.show();

		// 生产产品C
		Product c = factory.produce("C");
		c.show();

		/*** 多个工厂方法模式 ***/
		Product pA = factory.newProductA();
		pA.show();

		Product pB = factory.newProductB();
		pB.show();

		Product pC = factory.newProductC();
		pC.show();

		/*** 静态方法 ***/
		Product productA = Factory.createProduct("A");
		productA.show();

		Product productB = Factory.createProduct("B");
		productB.show();

		Product productC = Factory.createProduct("C");
		productC.show();
	}

}
