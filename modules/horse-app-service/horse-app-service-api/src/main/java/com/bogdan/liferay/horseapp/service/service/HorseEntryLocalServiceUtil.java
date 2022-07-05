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

import com.bogdan.liferay.horseapp.service.model.HorseEntry;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;
import java.util.List;

/**
 * Provides the local service utility for HorseEntry. This utility wraps
 * <code>com.bogdan.liferay.horseapp.service.service.impl.HorseEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see HorseEntryLocalService
 */
public class HorseEntryLocalServiceUtil {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to <code>com.bogdan.liferay.horseapp.service.service.impl.HorseEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
     */

    private static volatile HorseEntryLocalService _service;

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
    public static HorseEntry addHorseEntry(HorseEntry horseEntry) {
        return getService().addHorseEntry(horseEntry);
    }

    /**
     * Creates a new horse entry with the primary key. Does not add the horse entry to the database.
     *
     * @param entryId the primary key for the new horse entry
     * @return the new horse entry
     */
    public static HorseEntry createHorseEntry(long entryId) {
        return getService().createHorseEntry(entryId);
    }

    /**
     * @throws PortalException
     */
    public static PersistedModel createPersistedModel(
            Serializable primaryKeyObj)
            throws PortalException {

        return getService().createPersistedModel(primaryKeyObj);
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
    public static HorseEntry deleteHorseEntry(HorseEntry horseEntry) {
        return getService().deleteHorseEntry(horseEntry);
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
    public static HorseEntry deleteHorseEntry(long entryId)
            throws PortalException {

        return getService().deleteHorseEntry(entryId);
    }

    /**
     * @throws PortalException
     */
    public static PersistedModel deletePersistedModel(
            PersistedModel persistedModel)
            throws PortalException {

        return getService().deletePersistedModel(persistedModel);
    }

    public static <T> T dslQuery(DSLQuery dslQuery) {
        return getService().dslQuery(dslQuery);
    }

    public static int dslQueryCount(DSLQuery dslQuery) {
        return getService().dslQueryCount(dslQuery);
    }

    public static DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     */
    public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
        return getService().dynamicQuery(dynamicQuery);
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
    public static <T> List<T> dynamicQuery(
            DynamicQuery dynamicQuery, int start, int end) {

        return getService().dynamicQuery(dynamicQuery, start, end);
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
    public static <T> List<T> dynamicQuery(
            DynamicQuery dynamicQuery, int start, int end,
            OrderByComparator<T> orderByComparator) {

        return getService().dynamicQuery(
                dynamicQuery, start, end, orderByComparator);
    }

    /**
     * Returns the number of rows matching the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows matching the dynamic query
     */
    public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
     * Returns the number of rows matching the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection   the projection to apply to the query
     * @return the number of rows matching the dynamic query
     */
    public static long dynamicQueryCount(
            DynamicQuery dynamicQuery,
            com.liferay.portal.kernel.dao.orm.Projection projection) {

        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static HorseEntry fetchHorseEntry(long entryId) {
        return getService().fetchHorseEntry(entryId);
    }

    public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
    getActionableDynamicQuery() {

        return getService().getActionableDynamicQuery();
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
    public static List<HorseEntry> getHorseEntries(int start, int end) {
        return getService().getHorseEntries(start, end);
    }

    /**
     * Returns the number of horse entries.
     *
     * @return the number of horse entries
     */
    public static int getHorseEntriesCount() {
        return getService().getHorseEntriesCount();
    }

    /**
     * Returns the horse entry with the primary key.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry
     * @throws PortalException if a horse entry with the primary key could not be found
     */
    public static HorseEntry getHorseEntry(long entryId)
            throws PortalException {

        return getService().getHorseEntry(entryId);
    }

    public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
    getIndexableActionableDynamicQuery() {

        return getService().getIndexableActionableDynamicQuery();
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    public static String getOSGiServiceIdentifier() {
        return getService().getOSGiServiceIdentifier();
    }

    /**
     * @throws PortalException
     */
    public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
            throws PortalException {

        return getService().getPersistedModel(primaryKeyObj);
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
    public static HorseEntry updateHorseEntry(HorseEntry horseEntry) {
        return getService().updateHorseEntry(horseEntry);
    }

    public static HorseEntryLocalService getService() {
        return _service;
    }

}