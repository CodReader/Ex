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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HorseEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see HorseEntryLocalService
 */
public class HorseEntryLocalServiceWrapper
        implements HorseEntryLocalService, ServiceWrapper<HorseEntryLocalService> {

    private HorseEntryLocalService _horseEntryLocalService;

    public HorseEntryLocalServiceWrapper(
            HorseEntryLocalService horseEntryLocalService) {

        _horseEntryLocalService = horseEntryLocalService;
    }

    /**
     * Adds the horse entry to the database. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect HorseEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param horseEntry the horse entry
     * @return the horse entry that was added
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.HorseEntry addHorseEntry(
            com.bogdan.liferay.horseapp.service.model.HorseEntry horseEntry) {

        return _horseEntryLocalService.addHorseEntry(horseEntry);
    }

    /**
     * Creates a new horse entry with the primary key. Does not add the horse entry to the database.
     *
     * @param entryId the primary key for the new horse entry
     * @return the new horse entry
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.HorseEntry
    createHorseEntry(long entryId) {

        return _horseEntryLocalService.createHorseEntry(entryId);
    }

    /**
     * @throws PortalException
     */
    @Override
    public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
            java.io.Serializable primaryKeyObj)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _horseEntryLocalService.createPersistedModel(primaryKeyObj);
    }

    /**
     * Deletes the horse entry from the database. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect HorseEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param horseEntry the horse entry
     * @return the horse entry that was removed
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.HorseEntry
    deleteHorseEntry(
            com.bogdan.liferay.horseapp.service.model.HorseEntry horseEntry) {

        return _horseEntryLocalService.deleteHorseEntry(horseEntry);
    }

    /**
     * Deletes the horse entry with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect HorseEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry that was removed
     * @throws PortalException if a horse entry with the primary key could not be found
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.HorseEntry
    deleteHorseEntry(long entryId)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _horseEntryLocalService.deleteHorseEntry(entryId);
    }

    /**
     * @throws PortalException
     */
    @Override
    public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
            com.liferay.portal.kernel.model.PersistedModel persistedModel)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _horseEntryLocalService.deletePersistedModel(persistedModel);
    }

    @Override
    public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
        return _horseEntryLocalService.dslQuery(dslQuery);
    }

    @Override
    public int dslQueryCount(
            com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

        return _horseEntryLocalService.dslQueryCount(dslQuery);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _horseEntryLocalService.dynamicQuery();
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

        return _horseEntryLocalService.dynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bogdan.liferay.horseapp.service.model.impl.HorseEntryModelImpl</code>.
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

        return _horseEntryLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bogdan.liferay.horseapp.service.model.impl.HorseEntryModelImpl</code>.
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

        return _horseEntryLocalService.dynamicQuery(
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

        return _horseEntryLocalService.dynamicQueryCount(dynamicQuery);
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

        return _horseEntryLocalService.dynamicQueryCount(
                dynamicQuery, projection);
    }

    @Override
    public com.bogdan.liferay.horseapp.service.model.HorseEntry fetchHorseEntry(
            long entryId) {

        return _horseEntryLocalService.fetchHorseEntry(entryId);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
    getActionableDynamicQuery() {

        return _horseEntryLocalService.getActionableDynamicQuery();
    }

    /**
     * Returns a range of all the horse entries.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bogdan.liferay.horseapp.service.model.impl.HorseEntryModelImpl</code>.
     * </p>
     *
     * @param start the lower bound of the range of horse entries
     * @param end   the upper bound of the range of horse entries (not inclusive)
     * @return the range of horse entries
     */
    @Override
    public java.util.List<com.bogdan.liferay.horseapp.service.model.HorseEntry>
    getHorseEntries(int start, int end) {

        return _horseEntryLocalService.getHorseEntries(start, end);
    }

    /**
     * Returns the number of horse entries.
     *
     * @return the number of horse entries
     */
    @Override
    public int getHorseEntriesCount() {
        return _horseEntryLocalService.getHorseEntriesCount();
    }

    /**
     * Returns the horse entry with the primary key.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry
     * @throws PortalException if a horse entry with the primary key could not be found
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.HorseEntry getHorseEntry(
            long entryId)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _horseEntryLocalService.getHorseEntry(entryId);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
    getIndexableActionableDynamicQuery() {

        return _horseEntryLocalService.getIndexableActionableDynamicQuery();
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    @Override
    public String getOSGiServiceIdentifier() {
        return _horseEntryLocalService.getOSGiServiceIdentifier();
    }

    /**
     * @throws PortalException
     */
    @Override
    public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
            java.io.Serializable primaryKeyObj)
            throws com.liferay.portal.kernel.exception.PortalException {

        return _horseEntryLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
     * Updates the horse entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect HorseEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param horseEntry the horse entry
     * @return the horse entry that was updated
     */
    @Override
    public com.bogdan.liferay.horseapp.service.model.HorseEntry
    updateHorseEntry(
            com.bogdan.liferay.horseapp.service.model.HorseEntry horseEntry) {

        return _horseEntryLocalService.updateHorseEntry(horseEntry);
    }

    @Override
    public HorseEntryLocalService getWrappedService() {
        return _horseEntryLocalService;
    }

    @Override
    public void setWrappedService(
            HorseEntryLocalService horseEntryLocalService) {

        _horseEntryLocalService = horseEntryLocalService;
    }

}