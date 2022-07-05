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

import com.bogdan.liferay.horseapp.service.model.Foo;
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
 * The persistence utility for the foo service. This utility wraps <code>com.bogdan.liferay.horseapp.service.service.persistence.impl.FooPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see FooPersistence
 */
public class FooUtil {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    private static ServiceTracker<FooPersistence, FooPersistence>
            _serviceTracker;

    static {
        Bundle bundle = FrameworkUtil.getBundle(FooPersistence.class);

        ServiceTracker<FooPersistence, FooPersistence> serviceTracker =
                new ServiceTracker<FooPersistence, FooPersistence>(
                        bundle.getBundleContext(), FooPersistence.class, null);

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
    public static void clearCache(Foo foo) {
        getPersistence().clearCache(foo);
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
    public static Map<Serializable, Foo> fetchByPrimaryKeys(
            Set<Serializable> primaryKeys) {

        return getPersistence().fetchByPrimaryKeys(primaryKeys);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Foo> findWithDynamicQuery(DynamicQuery dynamicQuery) {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Foo> findWithDynamicQuery(
            DynamicQuery dynamicQuery, int start, int end) {

        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Foo> findWithDynamicQuery(
            DynamicQuery dynamicQuery, int start, int end,
            OrderByComparator<Foo> orderByComparator) {

        return getPersistence().findWithDynamicQuery(
                dynamicQuery, start, end, orderByComparator);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
     */
    public static Foo update(Foo foo) {
        return getPersistence().update(foo);
    }

    /**
     * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
     */
    public static Foo update(Foo foo, ServiceContext serviceContext) {
        return getPersistence().update(foo, serviceContext);
    }

    /**
     * Returns all the foos where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status  the status
     * @return the matching foos
     */
    public static List<Foo> findByGroupId(long groupId, int status) {
        return getPersistence().findByGroupId(groupId, status);
    }

    /**
     * Returns a range of all the foos where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
     * </p>
     *
     * @param groupId the group ID
     * @param status  the status
     * @param start   the lower bound of the range of foos
     * @param end     the upper bound of the range of foos (not inclusive)
     * @return the range of matching foos
     */
    public static List<Foo> findByGroupId(
            long groupId, int status, int start, int end) {

        return getPersistence().findByGroupId(groupId, status, start, end);
    }

    /**
     * Returns an ordered range of all the foos where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
     * </p>
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param start             the lower bound of the range of foos
     * @param end               the upper bound of the range of foos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching foos
     */
    public static List<Foo> findByGroupId(
            long groupId, int status, int start, int end,
            OrderByComparator<Foo> orderByComparator) {

        return getPersistence().findByGroupId(
                groupId, status, start, end, orderByComparator);
    }

    /**
     * Returns an ordered range of all the foos where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
     * </p>
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param start             the lower bound of the range of foos
     * @param end               the upper bound of the range of foos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @param useFinderCache    whether to use the finder cache
     * @return the ordered range of matching foos
     */
    public static List<Foo> findByGroupId(
            long groupId, int status, int start, int end,
            OrderByComparator<Foo> orderByComparator, boolean useFinderCache) {

        return getPersistence().findByGroupId(
                groupId, status, start, end, orderByComparator, useFinderCache);
    }

    /**
     * Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo
     * @throws NoSuchFooException if a matching foo could not be found
     */
    public static Foo findByGroupId_First(
            long groupId, int status, OrderByComparator<Foo> orderByComparator)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchFooException {

        return getPersistence().findByGroupId_First(
                groupId, status, orderByComparator);
    }

    /**
     * Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo, or <code>null</code> if a matching foo could not be found
     */
    public static Foo fetchByGroupId_First(
            long groupId, int status, OrderByComparator<Foo> orderByComparator) {

        return getPersistence().fetchByGroupId_First(
                groupId, status, orderByComparator);
    }

    /**
     * Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo
     * @throws NoSuchFooException if a matching foo could not be found
     */
    public static Foo findByGroupId_Last(
            long groupId, int status, OrderByComparator<Foo> orderByComparator)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchFooException {

        return getPersistence().findByGroupId_Last(
                groupId, status, orderByComparator);
    }

    /**
     * Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo, or <code>null</code> if a matching foo could not be found
     */
    public static Foo fetchByGroupId_Last(
            long groupId, int status, OrderByComparator<Foo> orderByComparator) {

        return getPersistence().fetchByGroupId_Last(
                groupId, status, orderByComparator);
    }

    /**
     * Returns the foos before and after the current foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param fooId             the primary key of the current foo
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next foo
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    public static Foo[] findByGroupId_PrevAndNext(
            long fooId, long groupId, int status,
            OrderByComparator<Foo> orderByComparator)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchFooException {

        return getPersistence().findByGroupId_PrevAndNext(
                fooId, groupId, status, orderByComparator);
    }

    /**
     * Removes all the foos where groupId = &#63; and status = &#63; from the database.
     *
     * @param groupId the group ID
     * @param status  the status
     */
    public static void removeByGroupId(long groupId, int status) {
        getPersistence().removeByGroupId(groupId, status);
    }

    /**
     * Returns the number of foos where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status  the status
     * @return the number of matching foos
     */
    public static int countByGroupId(long groupId, int status) {
        return getPersistence().countByGroupId(groupId, status);
    }

    /**
     * Caches the foo in the entity cache if it is enabled.
     *
     * @param foo the foo
     */
    public static void cacheResult(Foo foo) {
        getPersistence().cacheResult(foo);
    }

    /**
     * Caches the foos in the entity cache if it is enabled.
     *
     * @param foos the foos
     */
    public static void cacheResult(List<Foo> foos) {
        getPersistence().cacheResult(foos);
    }

    /**
     * Creates a new foo with the primary key. Does not add the foo to the database.
     *
     * @param fooId the primary key for the new foo
     * @return the new foo
     */
    public static Foo create(long fooId) {
        return getPersistence().create(fooId);
    }

    /**
     * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param fooId the primary key of the foo
     * @return the foo that was removed
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    public static Foo remove(long fooId)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchFooException {

        return getPersistence().remove(fooId);
    }

    public static Foo updateImpl(Foo foo) {
        return getPersistence().updateImpl(foo);
    }

    /**
     * Returns the foo with the primary key or throws a <code>NoSuchFooException</code> if it could not be found.
     *
     * @param fooId the primary key of the foo
     * @return the foo
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    public static Foo findByPrimaryKey(long fooId)
            throws com.bogdan.liferay.horseapp.service.exception.
            NoSuchFooException {

        return getPersistence().findByPrimaryKey(fooId);
    }

    /**
     * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param fooId the primary key of the foo
     * @return the foo, or <code>null</code> if a foo with the primary key could not be found
     */
    public static Foo fetchByPrimaryKey(long fooId) {
        return getPersistence().fetchByPrimaryKey(fooId);
    }

    /**
     * Returns all the foos.
     *
     * @return the foos
     */
    public static List<Foo> findAll() {
        return getPersistence().findAll();
    }

    /**
     * Returns a range of all the foos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
     * </p>
     *
     * @param start the lower bound of the range of foos
     * @param end   the upper bound of the range of foos (not inclusive)
     * @return the range of foos
     */
    public static List<Foo> findAll(int start, int end) {
        return getPersistence().findAll(start, end);
    }

    /**
     * Returns an ordered range of all the foos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
     * </p>
     *
     * @param start             the lower bound of the range of foos
     * @param end               the upper bound of the range of foos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of foos
     */
    public static List<Foo> findAll(
            int start, int end, OrderByComparator<Foo> orderByComparator) {

        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
     * Returns an ordered range of all the foos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
     * </p>
     *
     * @param start             the lower bound of the range of foos
     * @param end               the upper bound of the range of foos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @param useFinderCache    whether to use the finder cache
     * @return the ordered range of foos
     */
    public static List<Foo> findAll(
            int start, int end, OrderByComparator<Foo> orderByComparator,
            boolean useFinderCache) {

        return getPersistence().findAll(
                start, end, orderByComparator, useFinderCache);
    }

    /**
     * Removes all the foos from the database.
     */
    public static void removeAll() {
        getPersistence().removeAll();
    }

    /**
     * Returns the number of foos.
     *
     * @return the number of foos
     */
    public static int countAll() {
        return getPersistence().countAll();
    }

    public static FooPersistence getPersistence() {
        return _serviceTracker.getService();
    }

}