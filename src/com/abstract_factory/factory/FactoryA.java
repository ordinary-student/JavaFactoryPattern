package com.abstract_factory.factory;

import com.abstract_factory.product.Product;
import com.abstract_factory.product.ProductA;

/*
 * 工厂A
 */
public class FactoryA extends Factory
{

	@Override
	public Product produce()
	{
		return new ProductA();
	}

}
