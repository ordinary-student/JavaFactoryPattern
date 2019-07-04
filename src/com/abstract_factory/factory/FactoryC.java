package com.abstract_factory.factory;

import com.abstract_factory.product.Product;
import com.abstract_factory.product.ProductC;

/*
 * 工厂C
 */
public class FactoryC extends Factory
{

	@Override
	public Product produce()
	{
		return new ProductC();
	}

}
