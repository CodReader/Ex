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

import com.bogdan.liferay.horseapp.service.exception.NoSuchHorseEntryException;
import com.bogdan.liferay.horseapp.service.model.HorseEntry;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the horse entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see HorseEntryUtil
 */
@ProviderType
public interface HorseEntryPersistence extends BasePersistence<HorseEntry> {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link HorseEntryUtil} to access the horse entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
     * Returns all the horse entries where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching horse entries
     */
    public java.util.List<HorseEntry> findByUuid(String uuid);

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
    public java.util.List<HorseEntry> findByUuid(
            String uuid, int start, int end);

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
    public java.util.List<HorseEntry> findByUuid(
            String uuid, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator);

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
    public java.util.List<HorseEntry> findByUuid(
            String uuid, int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator,
            boolean useFinderCache);

    /**
     * Returns the first horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching horse entry
     * @throws NoSuchHorseEntryException if a matching horse entry could not be found
     */
    public HorseEntry findByUuid_First(
            String uuid,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator)
            throws NoSuchHorseEntryException;

    /**
     * Returns the first horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching horse entry, or <code>null</code> if a matching horse entry could not be found
     */
    public HorseEntry fetchByUuid_First(
            String uuid,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator);

    /**
     * Returns the last horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching horse entry
     * @throws NoSuchHorseEntryException if a matching horse entry could not be found
     */
    public HorseEntry findByUuid_Last(
            String uuid,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator)
            throws NoSuchHorseEntryException;

    /**
     * Returns the last horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching horse entry, or <code>null</code> if a matching horse entry could not be found
     */
    public HorseEntry fetchByUuid_Last(
            String uuid,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator);

    /**
     * Returns the horse entries before and after the current horse entry in the ordered set where uuid = &#63;.
     *
     * @param entryId           the primary key of the current horse entry
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next horse entry
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    public HorseEntry[] findByUuid_PrevAndNext(
            long entryId, String uuid,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator)
            throws NoSuchHorseEntryException;

    /**
     * Removes all the horse entries where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     */
    public void removeByUuid(String uuid);

    /**
     * Returns the number of horse entries where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching horse entries
     */
    public int countByUuid(String uuid);

    /**
     * Caches the horse entry in the entity cache if it is enabled.
     *
     * @param horseEntry the horse entry
     */
    public void cacheResult(HorseEntry horseEntry);

    /**
     * Caches the horse entries in the entity cache if it is enabled.
     *
     * @param horseEntries the horse entries
     */
    public void cacheResult(java.util.List<HorseEntry> horseEntries);

    /**
     * Creates a new horse entry with the primary key. Does not add the horse entry to the database.
     *
     * @param entryId the primary key for the new horse entry
     * @return the new horse entry
     */
    public HorseEntry create(long entryId);

    /**
     * Removes the horse entry with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry that was removed
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    public HorseEntry remove(long entryId) throws NoSuchHorseEntryException;

    public HorseEntry updateImpl(HorseEntry horseEntry);

    /**
     * Returns the horse entry with the primary key or throws a <code>NoSuchHorseEntryException</code> if it could not be found.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    public HorseEntry findByPrimaryKey(long entryId)
            throws NoSuchHorseEntryException;

    /**
     * Returns the horse entry with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry, or <code>null</code> if a horse entry with the primary key could not be found
     */
    public HorseEntry fetchByPrimaryKey(long entryId);

    /**
     * Returns all the horse entries.
     *
     * @return the horse entries
     */
    public java.util.List<HorseEntry> findAll();

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
    public java.util.List<HorseEntry> findAll(int start, int end);

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
    public java.util.List<HorseEntry> findAll(
            int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator);

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
    public java.util.List<HorseEntry> findAll(
            int start, int end,
            com.liferay.portal.kernel.util.OrderByComparator<HorseEntry>
                    orderByComparator,
            boolean useFinderCache);

    /**
     * Removes all the horse entries from the database.
     */
    public void removeAll();

    /**
     * Returns the number of horse entries.
     *
     * @return the number of horse entries
     */
    public int countAll();

}