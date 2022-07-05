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

package com.bogdan.liferay.horseapp.service.service.persistence;

import com.bogdan.liferay.horseapp.service.model.HorseEntry;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the horse entry service. This utility wraps <code>com.bogdan.liferay.horseapp.service.service.persistence.impl.HorseEntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see HorseEntryPersistence
 */
public class HorseEntryUtil {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    private static ServiceTracker<HorseEntryPersistence, HorseEntryPersistence>
            _serviceTracker;

    static {
        Bundle bundle = FrameworkUtil.getBundle(HorseEntryPersistence.class);

        ServiceTracker<HorseEntryPersistence, HorseEntryPersistence>
                serviceTracker =
                new ServiceTracker
                        <HorseEntryPersistence, HorseEntryPersistence>(
                        bundle.getBundleContext(), HorseEntryPersistence.class,
                        null);

        serviceTracker.open();

        _serviceTracker = serviceTracker;
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
     */
    public static void clearCache(HorseEntry horseEntry) {
        getPersistence().clearCache(horseEntry);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
     */
    public static Map<Serializable, HorseEntry> fetchByPrimaryKeys(
            Set<Serializable> primaryKeys) {

        return getPersistence().fetchByPrimaryKeys(primaryKeys);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<HorseEntry> findWithDynamicQuery(
            DynamicQuery dynamicQuery) {

        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<HorseEntry> findWithDynamicQuery(
            DynamicQuery dynamicQuery, int start, int end) {

        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<HorseEntry> findWithDynamicQuery(
            DynamicQuery dynamicQuery, int start, int end,
            OrderByComparator<HorseEntry> orderByComparator) {

        return getPersistence().findWithDynamicQuery(
                dynamicQuery, start, end, orderByComparator);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
     */
    public static HorseEntry update(HorseEntry horseEntry) {
        return getPersistence().update(horseEntry);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
     */
    public static HorseEntry update(
            HorseEntry horseEntry, ServiceContext serviceContext) {

        return getPersistence().update(horseEntry, serviceContext);
    }

    /**
     * Returns all the horse entries where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching horse entries
     */
    public static List<HorseEntry> findByUuid(String uuid) {
        return getPersistence().findByUuid(uuid);
    }

    /**
     * Returns a range of all the horse entries where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorseEntryModelImpl</code>.
     * </p>
     *
     * @param uuid  the uuid
     * @param start the lower bound of the range of horse entries
     * @param end   the upper bound of the range of horse entries (not inclusive)
     * @return the range of matching horse entries
     */
    public static List<HorseEntry> findByUuid(String uuid, int start, int end) {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
     * Returns an ordered range of all the horse entries where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorseEntryModelImpl</code>.
     * </p>
     *
     * @param uuid              the uuid
     * @param start             the lower bound of the range of horse entries
     * @param end               the upper bound of the range of horse entries (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching horse entries
     */
    public static List<HorseEntry> findByUuid(
            String uuid, int start, int end,
            OrderByComparator<HorseEntry> orderByComparator) {

        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
     * Returns an ordered range of all the horse entries where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorseEntryModelImpl</code>.
     * </p>
     *
     * @param uuid              the uuid
     * @param start             the lower bound of the range of horse entries
     * @param end               the upper bound of the range of horse entries (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @param useFinderCache    whether to use the finder cache
     * @return the ordered range of matching horse entries
     */
    public static List<HorseEntry> findByUuid(
            String uuid, int start, int end,
            OrderByComparator<HorseEntry> orderByComparator,
            boolean useFinderCache) {

        return getPersistence().findByUuid(
                uuid, start, end, orderByComparator, useFinderCache);
    }

    /**
     * Returns the first horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching horse entry
     * @throws NoSuchHorseEntryException if a matching horse entry could not be found
     */
    public static HorseEntry findByUuid_First(
            String uuid, OrderByComparator<HorseEntry> orderByComparator)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchHorseEntryException {

        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
     * Returns the first horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching horse entry, or <code>null</code> if a matching horse entry could not be found
     */
    public static HorseEntry fetchByUuid_First(
            String uuid, OrderByComparator<HorseEntry> orderByComparator) {

        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
     * Returns the last horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching horse entry
     * @throws NoSuchHorseEntryException if a matching horse entry could not be found
     */
    public static HorseEntry findByUuid_Last(
            String uuid, OrderByComparator<HorseEntry> orderByComparator)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchHorseEntryException {

        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
     * Returns the last horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching horse entry, or <code>null</code> if a matching horse entry could not be found
     */
    public static HorseEntry fetchByUuid_Last(
            String uuid, OrderByComparator<HorseEntry> orderByComparator) {

        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
     * Returns the horse entries before and after the current horse entry in the ordered set where uuid = &#63;.
     *
     * @param entryId           the primary key of the current horse entry
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next horse entry
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    public static HorseEntry[] findByUuid_PrevAndNext(
            long entryId, String uuid,
            OrderByComparator<HorseEntry> orderByComparator)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchHorseEntryException {

        return getPersistence().findByUuid_PrevAndNext(
                entryId, uuid, orderByComparator);
    }

    /**
     * Removes all the horse entries where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     */
    public static void removeByUuid(String uuid) {
        getPersistence().removeByUuid(uuid);
    }

    /**
     * Returns the number of horse entries where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching horse entries
     */
    public static int countByUuid(String uuid) {
        return getPersistence().countByUuid(uuid);
    }

    /**
     * Caches the horse entry in the entity cache if it is enabled.
     *
     * @param horseEntry the horse entry
     */
    public static void cacheResult(HorseEntry horseEntry) {
        getPersistence().cacheResult(horseEntry);
    }

    /**
     * Caches the horse entries in the entity cache if it is enabled.
     *
     * @param horseEntries the horse entries
     */
    public static void cacheResult(List<HorseEntry> horseEntries) {
        getPersistence().cacheResult(horseEntries);
    }

    /**
     * Creates a new horse entry with the primary key. Does not add the horse entry to the database.
     *
     * @param entryId the primary key for the new horse entry
     * @return the new horse entry
     */
    public static HorseEntry create(long entryId) {
        return getPersistence().create(entryId);
    }

    /**
     * Removes the horse entry with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry that was removed
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    public static HorseEntry remove(long entryId)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchHorseEntryException {

        return getPersistence().remove(entryId);
    }

    public static HorseEntry updateImpl(HorseEntry horseEntry) {
        return getPersistence().updateImpl(horseEntry);
    }

    /**
     * Returns the horse entry with the primary key or throws a <code>NoSuchHorseEntryException</code> if it could not be found.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    public static HorseEntry findByPrimaryKey(long entryId)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchHorseEntryException {

        return getPersistence().findByPrimaryKey(entryId);
    }

    /**
     * Returns the horse entry with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry, or <code>null</code> if a horse entry with the primary key could not be found
     */
    public static HorseEntry fetchByPrimaryKey(long entryId) {
        return getPersistence().fetchByPrimaryKey(entryId);
    }

    /**
     * Returns all the horse entries.
     *
     * @return the horse entries
     */
    public static List<HorseEntry> findAll() {
        return getPersistence().findAll();
    }

    /**
     * Returns a range of all the horse entries.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorseEntryModelImpl</code>.
     * </p>
     *
     * @param start the lower bound of the range of horse entries
     * @param end   the upper bound of the range of horse entries (not inclusive)
     * @return the range of horse entries
     */
    public static List<HorseEntry> findAll(int start, int end) {
        return getPersistence().findAll(start, end);
    }

    /**
     * Returns an ordered range of all the horse entries.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorseEntryModelImpl</code>.
     * </p>
     *
     * @param start             the lower bound of the range of horse entries
     * @param end               the upper bound of the range of horse entries (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of horse entries
     */
    public static List<HorseEntry> findAll(
            int start, int end, OrderByComparator<HorseEntry> orderByComparator) {

        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
     * Returns an ordered range of all the horse entries.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorseEntryModelImpl</code>.
     * </p>
     *
     * @param start             the lower bound of the range of horse entries
     * @param end               the upper bound of the range of horse entries (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @param useFinderCache    whether to use the finder cache
     * @return the ordered range of horse entries
     */
    public static List<HorseEntry> findAll(
            int start, int end, OrderByComparator<HorseEntry> orderByComparator,
            boolean useFinderCache) {

        return getPersistence().findAll(
                start, end, orderByComparator, useFinderCache);
    }

    /**
     * Removes all the horse entries from the database.
     */
    public static void removeAll() {
        getPersistence().removeAll();
    }

    /**
     * Returns the number of horse entries.
     *
     * @return the number of horse entries
     */
    public static int countAll() {
        return getPersistence().countAll();
    }

    public static HorseEntryPersistence getPersistence() {
        return _serviceTracker.getService();
    }

}