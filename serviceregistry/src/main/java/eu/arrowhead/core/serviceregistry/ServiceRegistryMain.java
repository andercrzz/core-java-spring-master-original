/********************************************************************************
 * Copyright (c) 2019 AITIA
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   AITIA - implementation
 *   Arrowhead Consortia - conceptualization
 ********************************************************************************/

 package eu.arrowhead.core.serviceregistry;

 import org.springframework.boot.SpringApplication;
 import org.springframework.boot.autoconfigure.SpringBootApplication;
 import org.springframework.boot.autoconfigure.domain.EntityScan;
 import org.springframework.context.annotation.ComponentScan;
 import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
 import eu.arrowhead.common.CommonConstants;
 import eu.arrowhead.common.CoreCommonConstants;
 import eu.arrowhead.common.database.repository.RefreshableRepositoryImpl;
 import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
 @SpringBootApplication
 @ComponentScan({CommonConstants.BASE_PACKAGE, SystemProviderWithPublishingConstants.BASE_PACKAGE})
 @EntityScan(CoreCommonConstants.DATABASE_ENTITY_PACKAGE)
 @EnableJpaRepositories(basePackages = CoreCommonConstants.DATABASE_REPOSITORY_PACKAGE, repositoryBaseClass = RefreshableRepositoryImpl.class)
 @EnableSwagger2
 public class ServiceRegistryMain {
	 
	 //=================================================================================================
	 // methods
 
	 //-------------------------------------------------------------------------------------------------
	 public static void main(final String[] args) {
		 SpringApplication.run(ServiceRegistryMain.class, args);
	 }
 }