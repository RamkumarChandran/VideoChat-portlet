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

package com.rcs.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Configuration service. Represents a row in the &quot;VideoChat_Configuration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rcs.service.model.impl.ConfigurationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rcs.service.model.impl.ConfigurationImpl}.
 * </p>
 *
 * @author flor
 * @see Configuration
 * @see com.rcs.service.model.impl.ConfigurationImpl
 * @see com.rcs.service.model.impl.ConfigurationModelImpl
 * @generated
 */
public interface ConfigurationModel extends BaseModel<Configuration>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a configuration model instance should use the {@link Configuration} interface instead.
	 */

	/**
	 * Returns the primary key of this configuration.
	 *
	 * @return the primary key of this configuration
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this configuration.
	 *
	 * @param primaryKey the primary key of this configuration
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the api key of this configuration.
	 *
	 * @return the api key of this configuration
	 */
	@AutoEscape
	public String getApiKey();

	/**
	 * Sets the api key of this configuration.
	 *
	 * @param apiKey the api key of this configuration
	 */
	public void setApiKey(String apiKey);

	/**
	 * Returns the group ID of this configuration.
	 *
	 * @return the group ID of this configuration
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this configuration.
	 *
	 * @param groupId the group ID of this configuration
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this configuration.
	 *
	 * @return the company ID of this configuration
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this configuration.
	 *
	 * @param companyId the company ID of this configuration
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this configuration.
	 *
	 * @return the user ID of this configuration
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this configuration.
	 *
	 * @param userId the user ID of this configuration
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this configuration.
	 *
	 * @return the user uuid of this configuration
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this configuration.
	 *
	 * @param userUuid the user uuid of this configuration
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this configuration.
	 *
	 * @return the user name of this configuration
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this configuration.
	 *
	 * @param userName the user name of this configuration
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this configuration.
	 *
	 * @return the create date of this configuration
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this configuration.
	 *
	 * @param createDate the create date of this configuration
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this configuration.
	 *
	 * @return the modified date of this configuration
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this configuration.
	 *
	 * @param modifiedDate the modified date of this configuration
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the api secret of this configuration.
	 *
	 * @return the api secret of this configuration
	 */
	@AutoEscape
	public String getApiSecret();

	/**
	 * Sets the api secret of this configuration.
	 *
	 * @param apiSecret the api secret of this configuration
	 */
	public void setApiSecret(String apiSecret);

	/**
	 * Returns the type of this configuration.
	 *
	 * @return the type of this configuration
	 */
	public int getType();

	/**
	 * Sets the type of this configuration.
	 *
	 * @param type the type of this configuration
	 */
	public void setType(int type);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Configuration configuration);

	public int hashCode();

	public CacheModel<Configuration> toCacheModel();

	public Configuration toEscapedModel();

	public String toString();

	public String toXmlString();
}