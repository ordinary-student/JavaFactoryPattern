package com.abstract_factory.factory;

import com.abstract_factory.product.Product;

/*
 * 抽象工厂类
 */
public abstract class Factory
{
	/*
	 * 定义生产方法
	 */
	public abstract Product produce();
}
