/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rcs.service.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rcs.service.model.Configuration;

import java.util.List;

/**
 * The persistence utility for the configuration service. This utility wraps {@link ConfigurationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author flor
 * @see ConfigurationPersistence
 * @see ConfigurationPersistenceImpl
 * @generated
 */
public class ConfigurationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Configuration configuration) {
		getPersistence().clearCache(configuration);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Configuration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Configuration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Configuration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Configuration update(Configuration configuration,
		boolean merge) throws SystemException {
		return getPersistence().update(configuration, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Configuration update(Configuration configuration,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(configuration, merge, serviceContext);
	}

	/**
	* Caches the configuration in the entity cache if it is enabled.
	*
	* @param configuration the configuration
	*/
	public static void cacheResult(
		com.rcs.service.model.Configuration configuration) {
		getPersistence().cacheResult(configuration);
	}

	/**
	* Caches the configurations in the entity cache if it is enabled.
	*
	* @param configurations the configurations
	*/
	public static void cacheResult(
		java.util.List<com.rcs.service.model.Configuration> configurations) {
		getPersistence().cacheResult(configurations);
	}

	/**
	* Creates a new configuration with the primary key. Does not add the configuration to the database.
	*
	* @param apiKey the primary key for the new configuration
	* @return the new configuration
	*/
	public static com.rcs.service.model.Configuration create(
		java.lang.String apiKey) {
		return getPersistence().create(apiKey);
	}

	/**
	* Removes the configuration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param apiKey the primary key of the configuration
	* @return the configuration that was removed
	* @throws com.rcs.service.NoSuchConfigurationException if a configuration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rcs.service.model.Configuration remove(
		java.lang.String apiKey)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rcs.service.NoSuchConfigurationException {
		return getPersistence().remove(apiKey);
	}

	public static com.rcs.service.model.Configuration updateImpl(
		com.rcs.service.model.Configuration configuration, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(configuration, merge);
	}

	/**
	* Returns the configuration with the primary key or throws a {@link com.rcs.service.NoSuchConfigurationException} if it could not be found.
	*
	* @param apiKey the primary key of the configuration
	* @return the configuration
	* @throws com.rcs.service.NoSuchConfigurationException if a configuration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rcs.service.model.Configuration findByPrimaryKey(
		java.lang.String apiKey)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rcs.service.NoSuchConfigurationException {
		return getPersistence().findByPrimaryKey(apiKey);
	}

	/**
	* Returns the configuration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param apiKey the primary key of the configuration
	* @return the configuration, or <code>null</code> if a configuration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rcs.service.model.Configuration fetchByPrimaryKey(
		java.lang.String apiKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(apiKey);
	}

	/**
	* Returns all the configurations.
	*
	* @return the configurations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rcs.service.model.Configuration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the configurations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of configurations
	* @param end the upper bound of the range of configurations (not inclusive)
	* @return the range of configurations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rcs.service.model.Configuration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the configurations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of configurations
	* @param end the upper bound of the range of configurations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of configurations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rcs.service.model.Configuration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the configurations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of configurations.
	*
	* @return the number of configurations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ConfigurationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ConfigurationPersistence)PortletBeanLocatorUtil.locate(com.rcs.service.service.ClpSerializer.getServletContextName(),
					ConfigurationPersistence.class.getName());

			ReferenceRegistry.registerReference(ConfigurationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ConfigurationPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ConfigurationUtil.class,
			"_persistence");
	}

	private static ConfigurationPersistence _persistence;
}