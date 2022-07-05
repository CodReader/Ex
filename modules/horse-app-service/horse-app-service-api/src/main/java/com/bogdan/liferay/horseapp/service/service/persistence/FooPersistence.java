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

import com.bogdan.liferay.horseapp.service.exception.NoSuchFooException;
import com.bogdan.liferay.horseapp.service.model.Foo;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see FooUtil
 */
@ProviderType
public interface FooPersistence extends BasePersistence<Foo> {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FooUtil} to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
     * Returns all the foos where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status  the status
     * @return the matching foos
     */
    public java.util.List<Foo> findByGroupId(long groupId, int status);

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
    public java.util.List<Foo> findByGroupId(
            long groupId, int status, int start, int end);

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
    public java.util.List<Foo> findByGroupId(
            long groupId, int status, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Foo>
                    orderByComparator);

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
    public java.util.List<Foo> findByGroupId(
            long groupId, int status, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
            boolean useFinderCache);

    /**
     * Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo
     * @throws NoSuchFooException if a matching foo could not be found
     */
    public Foo findByGroupId_First(
            long groupId, int status,
            com.liferay.portal.kernel.util.OrderByComparator<Foo>
                    orderByComparator)
            throws NoSuchFooException;

    /**
     * Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo, or <code>null</code> if a matching foo could not be found
     */
    public Foo fetchByGroupId_First(
            long groupId, int status,
            com.liferay.portal.kernel.util.OrderByComparator<Foo>
                    orderByComparator);

    /**
     * Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo
     * @throws NoSuchFooException if a matching foo could not be found
     */
    public Foo findByGroupId_Last(
            long groupId, int status,
            com.liferay.portal.kernel.util.OrderByComparator<Foo>
                    orderByComparator)
            throws NoSuchFooException;

    /**
     * Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo, or <code>null</code> if a matching foo could not be found
     */
    public Foo fetchByGroupId_Last(
            long groupId, int status,
            com.liferay.portal.kernel.util.OrderByComparator<Foo>
                    orderByComparator);

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
    public Foo[] findByGroupId_PrevAndNext(
            long fooId, long groupId, int status,
            com.liferay.portal.kernel.util.OrderByComparator<Foo>
                    orderByComparator)
            throws NoSuchFooException;

    /**
     * Removes all the foos where groupId = &#63; and status = &#63; from the database.
     *
     * @param groupId the group ID
     * @param status  the status
     */
    public void removeByGroupId(long groupId, int status);

    /**
     * Returns the number of foos where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status  the status
     * @return the number of matching foos
     */
    public int countByGroupId(long groupId, int status);

    /**
     * Caches the foo in the entity cache if it is enabled.
     *
     * @param foo the foo
     */
    public void cacheResult(Foo foo);

    /**
     * Caches the foos in the entity cache if it is enabled.
     *
     * @param foos the foos
     */
    public void cacheResult(java.util.List<Foo> foos);

    /**
     * Creates a new foo with the primary key. Does not add the foo to the database.
     *
     * @param fooId the primary key for the new foo
     * @return the new foo
     */
    public Foo create(long fooId);

    /**
     * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param fooId the primary key of the foo
     * @return the foo that was removed
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    public Foo remove(long fooId) throws NoSuchFooException;

    public Foo updateImpl(Foo foo);

    /**
     * Returns the foo with the primary key or throws a <code>NoSuchFooException</code> if it could not be found.
     *
     * @param fooId the primary key of the foo
     * @return the foo
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    public Foo findByPrimaryKey(long fooId) throws NoSuchFooException;

    /**
     * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param fooId the primary key of the foo
     * @return the foo, or <code>null</code> if a foo with the primary key could not be found
     */
    public Foo fetchByPrimaryKey(long fooId);

    /**
     * Returns all the foos.
     *
     * @return the foos
     */
    public java.util.List<Foo> findAll();

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
    public java.util.List<Foo> findAll(int start, int end);

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
    public java.util.List<Foo> findAll(
            int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Foo>
                    orderByComparator);

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
    public java.util.List<Foo> findAll(
            int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
            boolean useFinderCache);

    /**
     * Removes all the foos from the database.
     */
    public void removeAll();

    /**
     * Returns the number of foos.
     *
     * @return the number of foos
     */
    public int countAll();

}