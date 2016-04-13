/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package org.opencps.dossiermgt.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.opencps.dossiermgt.service.persistence.DossierPartPersistence;
import org.opencps.dossiermgt.service.persistence.DossierTemplatePersistence;
import org.opencps.dossiermgt.service.serviceconfigLocalService;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the serviceconfig local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.dossiermgt.service.impl.serviceconfigLocalServiceImpl}.
 * </p>
 *
 * @author trungnt
 * @see org.opencps.dossiermgt.service.impl.serviceconfigLocalServiceImpl
 * @see org.opencps.dossiermgt.service.serviceconfigLocalServiceUtil
 * @generated
 */
public abstract class serviceconfigLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements serviceconfigLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.dossiermgt.service.serviceconfigLocalServiceUtil} to access the serviceconfig local service.
	 */

	/**
	 * Returns the dossier local service.
	 *
	 * @return the dossier local service
	 */
	public org.opencps.dossiermgt.service.dossierLocalService getdossierLocalService() {
		return dossierLocalService;
	}

	/**
	 * Sets the dossier local service.
	 *
	 * @param dossierLocalService the dossier local service
	 */
	public void setdossierLocalService(
		org.opencps.dossiermgt.service.dossierLocalService dossierLocalService) {
		this.dossierLocalService = dossierLocalService;
	}

	/**
	 * Returns the dossier remote service.
	 *
	 * @return the dossier remote service
	 */
	public org.opencps.dossiermgt.service.dossierService getdossierService() {
		return dossierService;
	}

	/**
	 * Sets the dossier remote service.
	 *
	 * @param dossierService the dossier remote service
	 */
	public void setdossierService(
		org.opencps.dossiermgt.service.dossierService dossierService) {
		this.dossierService = dossierService;
	}

	/**
	 * Returns the dossierfile local service.
	 *
	 * @return the dossierfile local service
	 */
	public org.opencps.dossiermgt.service.dossierfileLocalService getdossierfileLocalService() {
		return dossierfileLocalService;
	}

	/**
	 * Sets the dossierfile local service.
	 *
	 * @param dossierfileLocalService the dossierfile local service
	 */
	public void setdossierfileLocalService(
		org.opencps.dossiermgt.service.dossierfileLocalService dossierfileLocalService) {
		this.dossierfileLocalService = dossierfileLocalService;
	}

	/**
	 * Returns the dossierfile remote service.
	 *
	 * @return the dossierfile remote service
	 */
	public org.opencps.dossiermgt.service.dossierfileService getdossierfileService() {
		return dossierfileService;
	}

	/**
	 * Sets the dossierfile remote service.
	 *
	 * @param dossierfileService the dossierfile remote service
	 */
	public void setdossierfileService(
		org.opencps.dossiermgt.service.dossierfileService dossierfileService) {
		this.dossierfileService = dossierfileService;
	}

	/**
	 * Returns the dossierlog local service.
	 *
	 * @return the dossierlog local service
	 */
	public org.opencps.dossiermgt.service.dossierlogLocalService getdossierlogLocalService() {
		return dossierlogLocalService;
	}

	/**
	 * Sets the dossierlog local service.
	 *
	 * @param dossierlogLocalService the dossierlog local service
	 */
	public void setdossierlogLocalService(
		org.opencps.dossiermgt.service.dossierlogLocalService dossierlogLocalService) {
		this.dossierlogLocalService = dossierlogLocalService;
	}

	/**
	 * Returns the dossierlog remote service.
	 *
	 * @return the dossierlog remote service
	 */
	public org.opencps.dossiermgt.service.dossierlogService getdossierlogService() {
		return dossierlogService;
	}

	/**
	 * Sets the dossierlog remote service.
	 *
	 * @param dossierlogService the dossierlog remote service
	 */
	public void setdossierlogService(
		org.opencps.dossiermgt.service.dossierlogService dossierlogService) {
		this.dossierlogService = dossierlogService;
	}

	/**
	 * Returns the dossier part local service.
	 *
	 * @return the dossier part local service
	 */
	public org.opencps.dossiermgt.service.DossierPartLocalService getDossierPartLocalService() {
		return dossierPartLocalService;
	}

	/**
	 * Sets the dossier part local service.
	 *
	 * @param dossierPartLocalService the dossier part local service
	 */
	public void setDossierPartLocalService(
		org.opencps.dossiermgt.service.DossierPartLocalService dossierPartLocalService) {
		this.dossierPartLocalService = dossierPartLocalService;
	}

	/**
	 * Returns the dossier part remote service.
	 *
	 * @return the dossier part remote service
	 */
	public org.opencps.dossiermgt.service.DossierPartService getDossierPartService() {
		return dossierPartService;
	}

	/**
	 * Sets the dossier part remote service.
	 *
	 * @param dossierPartService the dossier part remote service
	 */
	public void setDossierPartService(
		org.opencps.dossiermgt.service.DossierPartService dossierPartService) {
		this.dossierPartService = dossierPartService;
	}

	/**
	 * Returns the dossier part persistence.
	 *
	 * @return the dossier part persistence
	 */
	public DossierPartPersistence getDossierPartPersistence() {
		return dossierPartPersistence;
	}

	/**
	 * Sets the dossier part persistence.
	 *
	 * @param dossierPartPersistence the dossier part persistence
	 */
	public void setDossierPartPersistence(
		DossierPartPersistence dossierPartPersistence) {
		this.dossierPartPersistence = dossierPartPersistence;
	}

	/**
	 * Returns the dossierstatus local service.
	 *
	 * @return the dossierstatus local service
	 */
	public org.opencps.dossiermgt.service.dossierstatusLocalService getdossierstatusLocalService() {
		return dossierstatusLocalService;
	}

	/**
	 * Sets the dossierstatus local service.
	 *
	 * @param dossierstatusLocalService the dossierstatus local service
	 */
	public void setdossierstatusLocalService(
		org.opencps.dossiermgt.service.dossierstatusLocalService dossierstatusLocalService) {
		this.dossierstatusLocalService = dossierstatusLocalService;
	}

	/**
	 * Returns the dossierstatus remote service.
	 *
	 * @return the dossierstatus remote service
	 */
	public org.opencps.dossiermgt.service.dossierstatusService getdossierstatusService() {
		return dossierstatusService;
	}

	/**
	 * Sets the dossierstatus remote service.
	 *
	 * @param dossierstatusService the dossierstatus remote service
	 */
	public void setdossierstatusService(
		org.opencps.dossiermgt.service.dossierstatusService dossierstatusService) {
		this.dossierstatusService = dossierstatusService;
	}

	/**
	 * Returns the dossier template local service.
	 *
	 * @return the dossier template local service
	 */
	public org.opencps.dossiermgt.service.DossierTemplateLocalService getDossierTemplateLocalService() {
		return dossierTemplateLocalService;
	}

	/**
	 * Sets the dossier template local service.
	 *
	 * @param dossierTemplateLocalService the dossier template local service
	 */
	public void setDossierTemplateLocalService(
		org.opencps.dossiermgt.service.DossierTemplateLocalService dossierTemplateLocalService) {
		this.dossierTemplateLocalService = dossierTemplateLocalService;
	}

	/**
	 * Returns the dossier template remote service.
	 *
	 * @return the dossier template remote service
	 */
	public org.opencps.dossiermgt.service.DossierTemplateService getDossierTemplateService() {
		return dossierTemplateService;
	}

	/**
	 * Sets the dossier template remote service.
	 *
	 * @param dossierTemplateService the dossier template remote service
	 */
	public void setDossierTemplateService(
		org.opencps.dossiermgt.service.DossierTemplateService dossierTemplateService) {
		this.dossierTemplateService = dossierTemplateService;
	}

	/**
	 * Returns the dossier template persistence.
	 *
	 * @return the dossier template persistence
	 */
	public DossierTemplatePersistence getDossierTemplatePersistence() {
		return dossierTemplatePersistence;
	}

	/**
	 * Sets the dossier template persistence.
	 *
	 * @param dossierTemplatePersistence the dossier template persistence
	 */
	public void setDossierTemplatePersistence(
		DossierTemplatePersistence dossierTemplatePersistence) {
		this.dossierTemplatePersistence = dossierTemplatePersistence;
	}

	/**
	 * Returns the filegroup local service.
	 *
	 * @return the filegroup local service
	 */
	public org.opencps.dossiermgt.service.filegroupLocalService getfilegroupLocalService() {
		return filegroupLocalService;
	}

	/**
	 * Sets the filegroup local service.
	 *
	 * @param filegroupLocalService the filegroup local service
	 */
	public void setfilegroupLocalService(
		org.opencps.dossiermgt.service.filegroupLocalService filegroupLocalService) {
		this.filegroupLocalService = filegroupLocalService;
	}

	/**
	 * Returns the filegroup remote service.
	 *
	 * @return the filegroup remote service
	 */
	public org.opencps.dossiermgt.service.filegroupService getfilegroupService() {
		return filegroupService;
	}

	/**
	 * Sets the filegroup remote service.
	 *
	 * @param filegroupService the filegroup remote service
	 */
	public void setfilegroupService(
		org.opencps.dossiermgt.service.filegroupService filegroupService) {
		this.filegroupService = filegroupService;
	}

	/**
	 * Returns the serviceconfig local service.
	 *
	 * @return the serviceconfig local service
	 */
	public org.opencps.dossiermgt.service.serviceconfigLocalService getserviceconfigLocalService() {
		return serviceconfigLocalService;
	}

	/**
	 * Sets the serviceconfig local service.
	 *
	 * @param serviceconfigLocalService the serviceconfig local service
	 */
	public void setserviceconfigLocalService(
		org.opencps.dossiermgt.service.serviceconfigLocalService serviceconfigLocalService) {
		this.serviceconfigLocalService = serviceconfigLocalService;
	}

	/**
	 * Returns the serviceconfig remote service.
	 *
	 * @return the serviceconfig remote service
	 */
	public org.opencps.dossiermgt.service.serviceconfigService getserviceconfigService() {
		return serviceconfigService;
	}

	/**
	 * Sets the serviceconfig remote service.
	 *
	 * @param serviceconfigService the serviceconfig remote service
	 */
	public void setserviceconfigService(
		org.opencps.dossiermgt.service.serviceconfigService serviceconfigService) {
		this.serviceconfigService = serviceconfigService;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = InfrastructureUtil.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.dossiermgt.service.dossierLocalService.class)
	protected org.opencps.dossiermgt.service.dossierLocalService dossierLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.dossierService.class)
	protected org.opencps.dossiermgt.service.dossierService dossierService;
	@BeanReference(type = org.opencps.dossiermgt.service.dossierfileLocalService.class)
	protected org.opencps.dossiermgt.service.dossierfileLocalService dossierfileLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.dossierfileService.class)
	protected org.opencps.dossiermgt.service.dossierfileService dossierfileService;
	@BeanReference(type = org.opencps.dossiermgt.service.dossierlogLocalService.class)
	protected org.opencps.dossiermgt.service.dossierlogLocalService dossierlogLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.dossierlogService.class)
	protected org.opencps.dossiermgt.service.dossierlogService dossierlogService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierPartLocalService.class)
	protected org.opencps.dossiermgt.service.DossierPartLocalService dossierPartLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierPartService.class)
	protected org.opencps.dossiermgt.service.DossierPartService dossierPartService;
	@BeanReference(type = DossierPartPersistence.class)
	protected DossierPartPersistence dossierPartPersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.dossierstatusLocalService.class)
	protected org.opencps.dossiermgt.service.dossierstatusLocalService dossierstatusLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.dossierstatusService.class)
	protected org.opencps.dossiermgt.service.dossierstatusService dossierstatusService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierTemplateLocalService.class)
	protected org.opencps.dossiermgt.service.DossierTemplateLocalService dossierTemplateLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.DossierTemplateService.class)
	protected org.opencps.dossiermgt.service.DossierTemplateService dossierTemplateService;
	@BeanReference(type = DossierTemplatePersistence.class)
	protected DossierTemplatePersistence dossierTemplatePersistence;
	@BeanReference(type = org.opencps.dossiermgt.service.filegroupLocalService.class)
	protected org.opencps.dossiermgt.service.filegroupLocalService filegroupLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.filegroupService.class)
	protected org.opencps.dossiermgt.service.filegroupService filegroupService;
	@BeanReference(type = org.opencps.dossiermgt.service.serviceconfigLocalService.class)
	protected org.opencps.dossiermgt.service.serviceconfigLocalService serviceconfigLocalService;
	@BeanReference(type = org.opencps.dossiermgt.service.serviceconfigService.class)
	protected org.opencps.dossiermgt.service.serviceconfigService serviceconfigService;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private serviceconfigLocalServiceClpInvoker _clpInvoker = new serviceconfigLocalServiceClpInvoker();
}