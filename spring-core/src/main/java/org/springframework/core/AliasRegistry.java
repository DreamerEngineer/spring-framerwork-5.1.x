/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core;

/**
 * Common interface for managing aliases. Serves as super-interface for
 * {@link org.springframework.beans.factory.support.BeanDefinitionRegistry}.
 * 管理aliases(别名)的通用接口、BeanDefinitionRegistry的父接口
 * @author Juergen Hoeller
 * @since 2.5.2
 */
public interface AliasRegistry {

	/**
	 * Given a name, register an alias for it.
	 * 注册一个别名
	 * @param name the canonical name 规范名
	 * @param alias the alias to be registered 将被注册的别名
	 * @throws IllegalStateException if the alias is already in use
	 * and may not be overridden
	 * 如果存在正在使用的别名，则会抛出异常
	 */
	void registerAlias(String name, String alias);

	/**
	 * Remove the specified alias from this registry.
	 * 移除别名，别名不存在则会抛出异常
	 * @param alias the alias to remove
	 * @throws IllegalStateException if no such alias was found
	 */
	void removeAlias(String alias);

	/**
	 * Determine whether this given name is defines as an alias
	 * 决定给的别名是否要被注册
	 * (as opposed to the name of an actually registered component).
	 * @param name the name to check
	 * @return whether the given name is an alias
	 */
	boolean isAlias(String name);

	/**
	 * Return the aliases for the given name, if defined.
	 * 获取别名，如果不存在则返回一个空十足
	 * @param name the name to check for aliases
	 * @return the aliases, or an empty array if none
	 */
	String[] getAliases(String name);

}
