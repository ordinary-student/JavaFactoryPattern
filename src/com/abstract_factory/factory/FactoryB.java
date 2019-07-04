package com.abstract_factory.factory;

import com.abstract_factory.product.Product;
import com.abstract_factory.product.ProductB;

/*
 * 工厂B
 */
public class FactoryB extends Factory
{

	@Override
	public Product produce()
	{
		return new ProductB();
	}

}
