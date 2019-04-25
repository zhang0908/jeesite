/*
 *    Copyright 2010-2013 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.spring;

import org.springframework.core.io.Resource;

/**
 * {@code FactoryBean} that creates an MyBatis {@code SqlSessionFactory}. This
 * is the usual way to set up a shared MyBatis {@code SqlSessionFactory} in a
 * Spring application context; the SqlSessionFactory can then be passed to
 * MyBatis-based DAOs via dependency injection.
 * 
 * Either {@code DataSourceTransactionManager} or {@code JtaTransactionManager}
 * can be used for transaction demarcation in combination with a
 * {@code SqlSessionFactory}. JTA should be used for transactions which span
 * multiple databases or when container managed transactions (CMT) are being
 * used.
 * 
 * @author Putthibong Boonbong
 * @author Hunter Presnall
 * @author Eduardo Macarron
 * 
 * @see #setConfigLocation
 * @see #setDataSource
 * @version $Id$
 * @desctiption 刷新xml文件
 */
public class SqlSessionFactoryBeanTest {
	
	private Resource configLocation;

	private Resource[] mapperLocations;
	
	public void setMapperLocations(Resource[] mapperLocations) {
		this.mapperLocations = mapperLocations;
	}
	
	public void setConfigLocation(Resource configLocation) {
		this.configLocation = configLocation;
	}
	
	public void test() {
		
		System.out.println("888888888888888888888888");
		
		
	}


}
