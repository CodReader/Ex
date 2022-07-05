/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bogdan.liferay.horseapp.service.service;

import com.bogdan.liferay.horseapp.service.service.persistence.FooPK;
import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FooLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see FooLocalService
 */
public class FooLocalServiceWrapper
        implements FooLocalService, ServiceWrapper<FooLocalService> {

    private FooLocalService _fooLocalService;

    public FooLocalServiceWrapper(FooLocalService fooLocalService) {
        _fooLocalService = fooLocalService;
    }

    /**
     * Adds the foo to the database. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect FooLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param foo the foo
     * @return the foo that was added
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.Foo addFoo(
            com.bogdan.liferay.horseapp.service.model.Foo foo) {

        return _fooLocalService.addFoo(foo);
    }

    /**
     * Creates a new foo with the primary key. Does not add the foo to the database.
     *
     * @param fooPK the primary key for the new foo
     * @return the new foo
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.Foo createFoo(
            FooPK fooPK) {

        return _fooLocalService.createFoo(fooPK);
    }

    /**
     * @throws PortalException
     */
    @Override
    public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
            java.io.Serializable primaryKeyObj)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _fooLocalService.createPersistedModel(primaryKeyObj);
    }

    /**
     * Deletes the foo from the database. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect FooLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param foo the foo
     * @return the foo that was removed
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.Foo deleteFoo(
            com.bogdan.liferay.horseapp.service.model.Foo foo) {

        return _fooLocalService.deleteFoo(foo);
    }

    /**
     * Deletes the foo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect FooLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param fooPK the primary key of the foo
     * @return the foo that was removed
     * @throws PortalException if a foo with the primary key could not be found
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.Foo deleteFoo(
            com.bogdan.liferay.horseapp.service.service.persistence.FooPK fooPK)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _fooLocalService.deleteFoo(fooPK);
    }

    /**
     * @throws PortalException
     */
    @Override
    public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
            com.liferay.portal.kernel.model.PersistedModel persistedModel)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _fooLocalService.deletePersistedModel(persistedModel);
    }

    @Override
    public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
        return _fooLocalService.dslQuery(dslQuery);
    }

    @Override
    public int dslQueryCount(
            com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

        return _fooLocalService.dslQueryCount(dslQuery);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _fooLocalService.dynamicQuery();
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     */
    @Override
    public <T> java.util.List<T> dynamicQuery(
            com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

        return _fooLocalService.dynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bogdan.liferay.horseapp.service.model.impl.FooModelImpl</code>.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start        the lower bound of the range of model instances
     * @param end          the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     */
    @Override
    public <T> java.util.List<T> dynamicQuery(
            com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
            int end) {

        return _fooLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bogdan.liferay.horseapp.service.model.impl.FooModelImpl</code>.
     * </p>
     *
     * @param dynamicQuery      the dynamic query
     * @param start             the lower bound of the range of model instances
     * @param end               the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     */
    @Override
    public <T> java.util.List<T> dynamicQuery(
            com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
            int end,
            com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

        return _fooLocalService.dynamicQuery(
                dynamicQuery, start, end, orderByComparator);
    }

    /**
     * Returns the number of rows matching the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows matching the dynamic query
     */
    @Override
    public long dynamicQueryCount(
            com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

        return _fooLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
     * Returns the number of rows matching the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection   the projection to apply to the query
     * @return the number of rows matching the dynamic query
     */
    @Override
    public long dynamicQueryCount(
            com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
            com.liferay.portal.kernel.dao.orm.Projection projection) {

        return _fooLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.bogdan.liferay.horseapp.service.model.Foo fetchFoo(
            com.bogdan.liferay.horseapp.service.service.persistence.FooPK fooPK) {

        return _fooLocalService.fetchFoo(fooPK);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
    getActionableDynamicQuery() {

        return _fooLocalService.getActionableDynamicQuery();
    }

    /**
     * Returns the foo with the primary key.
     *
     * @param fooPK the primary key of the foo
     * @return the foo
     * @throws PortalException if a foo with the primary key could not be found
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.Foo getFoo(
            long fooPK)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _fooLocalService.getFoo(fooPK);
    }

    /**
     * Returns a range of all the foos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bogdan.liferay.horseapp.service.model.impl.FooModelImpl</code>.
     * </p>
     *
     * @param start the lower bound of the range of foos
     * @param end   the upper bound of the range of foos (not inclusive)
     * @return the range of foos
     */
    @Override
    public java.util.List<com.bogdan.liferay.horseapp.service.model.Foo>
    getFoos(int start, int end) {

        return _fooLocalService.getFoos(start, end);
    }

    /**
     * Returns the number of foos.
     *
     * @return the number of foos
     */
    @Override
    public int getFoosCount() {
        return _fooLocalService.getFoosCount();
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
    getIndexableActionableDynamicQuery() {

        return _fooLocalService.getIndexableActionableDynamicQuery();
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    @Override
    public String getOSGiServiceIdentifier() {
        return _fooLocalService.getOSGiServiceIdentifier();
    }

    /**
     * @throws PortalException
     */
    @Override
    public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
            java.io.Serializable primaryKeyObj)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _fooLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
     * Updates the foo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect FooLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param foo the foo
     * @return the foo that was updated
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.Foo updateFoo(
            com.bogdan.liferay.horseapp.service.model.Foo foo) {

        return _fooLocalService.updateFoo(foo);
    }

    @Override
    public FooLocalService getWrappedService() {
        return _fooLocalService;
    }

    @Override
    public void setWrappedService(FooLocalService fooLocalService) {
        _fooLocalService = fooLocalService;
    }

}