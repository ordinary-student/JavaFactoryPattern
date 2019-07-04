package com.abstract_factory.factory;

import com.abstract_factory.product.Product;

/*
 * 抽象工厂模式测试类
 */
public class FactoryTest
{

	public static void main(String[] args)
	{
		// 建工厂A
		Factory factoryA = new FactoryA();
		// 生产产品A
		Product productA = factoryA.produce();
		productA.show();

		// 建工厂B
		Factory factoryB = new FactoryB();
		// 生产产品B
		Product productB = factoryB.produce();
		productB.show();

		// 建工厂C
		Factory factoryC = new FactoryC();
		// 生产产品C
		Product productC = factoryC.produce();
		productC.show();
	}

}
