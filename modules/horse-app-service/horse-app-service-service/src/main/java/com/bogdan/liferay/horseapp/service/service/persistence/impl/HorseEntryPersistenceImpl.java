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

package com.bogdan.liferay.horseapp.service.service.persistence.impl;

import com.bogdan.liferay.horseapp.service.exception.NoSuchHorseEntryException;
import com.bogdan.liferay.horseapp.service.model.HorseEntry;
import com.bogdan.liferay.horseapp.service.model.HorseEntryTable;
import com.bogdan.liferay.horseapp.service.model.impl.HorseEntryImpl;
import com.bogdan.liferay.horseapp.service.model.impl.HorseEntryModelImpl;
import com.bogdan.liferay.horseapp.service.service.persistence.HorseEntryPersistence;
import com.bogdan.liferay.horseapp.service.service.persistence.impl.constants.FOOPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import javax.sql.DataSource;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The persistence implementation for the horse entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {HorseEntryPersistence.class, BasePersistence.class})
public class HorseEntryPersistenceImpl
        extends BasePersistenceImpl<HorseEntry> implements HorseEntryPersistence {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use <code>HorseEntryUtil</code> to access the horse entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY =
            HorseEntryImpl.class.getName();

    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
            FINDER_CLASS_NAME_ENTITY + ".List1";

    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
            FINDER_CLASS_NAME_ENTITY + ".List2";
    private static final String _FINDER_COLUMN_UUID_UUID_2 =
            "horseEntry.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 =
            "(horseEntry.uuid IS NULL OR horseEntry.uuid = '')";
    private static final String _SQL_SELECT_HORSEENTRY =
            "SELECT horseEntry FROM HorseEntry horseEntry";
    private static final String _SQL_SELECT_HORSEENTRY_WHERE =
            "SELECT horseEntry FROM HorseEntry horseEntry WHERE ";
    private static final String _SQL_COUNT_HORSEENTRY =
            "SELECT COUNT(horseEntry) FROM HorseEntry horseEntry";
    private static final String _SQL_COUNT_HORSEENTRY_WHERE =
            "SELECT COUNT(horseEntry) FROM HorseEntry horseEntry WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "horseEntry.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
            "No HorseEntry exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY =
            "No HorseEntry exists with the key {";
    private static final Log _log = LogFactoryUtil.getLog(
            HorseEntryPersistenceImpl.class);
    private static final Set<String> _badColumnNames = SetUtil.fromArray(
            new String[]{"uuid"});
    @Reference
    protected EntityCache entityCache;
    @Reference
    protected FinderCache finderCache;
    private FinderPath _finderPathWithPaginationFindAll;
    private FinderPath _finderPathWithoutPaginationFindAll;
    private FinderPath _finderPathCountAll;
    private FinderPath _finderPathWithPaginationFindByUuid;
    private FinderPath _finderPathWithoutPaginationFindByUuid;
    private FinderPath _finderPathCountByUuid;
    private BundleContext _bundleContext;
    private ServiceRegistration<ArgumentsResolver>
            _argumentsResolverServiceRegistration;

    public HorseEntryPersistenceImpl() {
        Map<String, String> dbColumnNames = new HashMap<String, String>();

        dbColumnNames.put("uuid", "uuid_");

        setDBColumnNames(dbColumnNames);

        setModelClass(HorseEntry.class);

        setModelImplClass(HorseEntryImpl.class);
        setModelPKClass(long.class);

        setTable(HorseEntryTable.INSTANCE);
    }

    /**
     * Returns all the horse entries where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching horse entries
     */
    @Override
    public List<HorseEntry> findByUuid(String uuid) {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<HorseEntry> findByUuid(String uuid, int start, int end) {
        return findByUuid(uuid, start, end, null);
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
    @Override
    public List<HorseEntry> findByUuid(
            String uuid, int start, int end,
            OrderByComparator<HorseEntry> orderByComparator) {

        return findByUuid(uuid, start, end, orderByComparator, true);
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
    @Override
    public List<HorseEntry> findByUuid(
            String uuid, int start, int end,
            OrderByComparator<HorseEntry> orderByComparator,
            boolean useFinderCache) {

        uuid = Objects.toString(uuid, "");

        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {

            if (useFinderCache) {
                finderPath = _finderPathWithoutPaginationFindByUuid;
                finderArgs = new Object[]{uuid};
            }
        } else if (useFinderCache) {
            finderPath = _finderPathWithPaginationFindByUuid;
            finderArgs = new Object[]{uuid, start, end, orderByComparator};
        }

        List<HorseEntry> list = null;

        if (useFinderCache) {
            list = (List<HorseEntry>) finderCache.getResult(
                    finderPath, finderArgs);

            if ((list != null) && !list.isEmpty()) {
                for (HorseEntry horseEntry : list) {
                    if (!uuid.equals(horseEntry.getUuid())) {
                        list = null;

                        break;
                    }
                }
            }
        }

        if (list == null) {
            StringBundler sb = null;

            if (orderByComparator != null) {
                sb = new StringBundler(
                        3 + (orderByComparator.getOrderByFields().length * 2));
            } else {
                sb = new StringBundler(3);
            }

            sb.append(_SQL_SELECT_HORSEENTRY_WHERE);

            boolean bindUuid = false;

            if (uuid.isEmpty()) {
                sb.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                sb.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(
                        sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
            } else {
                sb.append(HorseEntryModelImpl.ORDER_BY_JPQL);
            }

            String sql = sb.toString();

            Session session = null;

            try {
                session = openSession();

                Query query = session.createQuery(sql);

                QueryPos queryPos = QueryPos.getInstance(query);

                if (bindUuid) {
                    queryPos.add(uuid);
                }

                list = (List<HorseEntry>) QueryUtil.list(
                        query, getDialect(), start, end);

                cacheResult(list);

                if (useFinderCache) {
                    finderCache.putResult(finderPath, finderArgs, list);
                }
            } catch (Exception exception) {
                throw processException(exception);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching horse entry
     * @throws NoSuchHorseEntryException if a matching horse entry could not be found
     */
    @Override
    public HorseEntry findByUuid_First(
            String uuid, OrderByComparator<HorseEntry> orderByComparator)
            throws NoSuchHorseEntryException {

        HorseEntry horseEntry = fetchByUuid_First(uuid, orderByComparator);

        if (horseEntry != null) {
            return horseEntry;
        }

        StringBundler sb = new StringBundler(4);

        sb.append(_NO_SUCH_ENTITY_WITH_KEY);

        sb.append("uuid=");
        sb.append(uuid);

        sb.append("}");

        throw new NoSuchHorseEntryException(sb.toString());
    }

    /**
     * Returns the first horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching horse entry, or <code>null</code> if a matching horse entry could not be found
     */
    @Override
    public HorseEntry fetchByUuid_First(
            String uuid, OrderByComparator<HorseEntry> orderByComparator) {

        List<HorseEntry> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching horse entry
     * @throws NoSuchHorseEntryException if a matching horse entry could not be found
     */
    @Override
    public HorseEntry findByUuid_Last(
            String uuid, OrderByComparator<HorseEntry> orderByComparator)
            throws NoSuchHorseEntryException {

        HorseEntry horseEntry = fetchByUuid_Last(uuid, orderByComparator);

        if (horseEntry != null) {
            return horseEntry;
        }

        StringBundler sb = new StringBundler(4);

        sb.append(_NO_SUCH_ENTITY_WITH_KEY);

        sb.append("uuid=");
        sb.append(uuid);

        sb.append("}");

        throw new NoSuchHorseEntryException(sb.toString());
    }

    /**
     * Returns the last horse entry in the ordered set where uuid = &#63;.
     *
     * @param uuid              the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching horse entry, or <code>null</code> if a matching horse entry could not be found
     */
    @Override
    public HorseEntry fetchByUuid_Last(
            String uuid, OrderByComparator<HorseEntry> orderByComparator) {

        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<HorseEntry> list = findByUuid(
                uuid, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public HorseEntry[] findByUuid_PrevAndNext(
            long entryId, String uuid,
            OrderByComparator<HorseEntry> orderByComparator)
            throws NoSuchHorseEntryException {

        uuid = Objects.toString(uuid, "");

        HorseEntry horseEntry = findByPrimaryKey(entryId);

        Session session = null;

        try {
            session = openSession();

            HorseEntry[] array = new HorseEntryImpl[3];

            array[0] = getByUuid_PrevAndNext(
                    session, horseEntry, uuid, orderByComparator, true);

            array[1] = horseEntry;

            array[2] = getByUuid_PrevAndNext(
                    session, horseEntry, uuid, orderByComparator, false);

            return array;
        } catch (Exception exception) {
            throw processException(exception);
        } finally {
            closeSession(session);
        }
    }

    protected HorseEntry getByUuid_PrevAndNext(
            Session session, HorseEntry horseEntry, String uuid,
            OrderByComparator<HorseEntry> orderByComparator, boolean previous) {

        StringBundler sb = null;

        if (orderByComparator != null) {
            sb = new StringBundler(
                    4 + (orderByComparator.getOrderByConditionFields().length * 3) +
                            (orderByComparator.getOrderByFields().length * 3));
        } else {
            sb = new StringBundler(3);
        }

        sb.append(_SQL_SELECT_HORSEENTRY_WHERE);

        boolean bindUuid = false;

        if (uuid.isEmpty()) {
            sb.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            sb.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields =
                    orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                sb.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                sb.append(_ORDER_BY_ENTITY_ALIAS);
                sb.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        sb.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        sb.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        sb.append(WHERE_GREATER_THAN);
                    } else {
                        sb.append(WHERE_LESSER_THAN);
                    }
                }
            }

            sb.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                sb.append(_ORDER_BY_ENTITY_ALIAS);
                sb.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        sb.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        sb.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        sb.append(ORDER_BY_ASC);
                    } else {
                        sb.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            sb.append(HorseEntryModelImpl.ORDER_BY_JPQL);
        }

        String sql = sb.toString();

        Query query = session.createQuery(sql);

        query.setFirstResult(0);
        query.setMaxResults(2);

        QueryPos queryPos = QueryPos.getInstance(query);

        if (bindUuid) {
            queryPos.add(uuid);
        }

        if (orderByComparator != null) {
            for (Object orderByConditionValue :
                    orderByComparator.getOrderByConditionValues(horseEntry)) {

                queryPos.add(orderByConditionValue);
            }
        }

        List<HorseEntry> list = query.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the horse entries where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     */
    @Override
    public void removeByUuid(String uuid) {
        for (HorseEntry horseEntry :
                findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

            remove(horseEntry);
        }
    }

    /**
     * Returns the number of horse entries where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching horse entries
     */
    @Override
    public int countByUuid(String uuid) {
        uuid = Objects.toString(uuid, "");

        FinderPath finderPath = _finderPathCountByUuid;

        Object[] finderArgs = new Object[]{uuid};

        Long count = (Long) finderCache.getResult(finderPath, finderArgs);

        if (count == null) {
            StringBundler sb = new StringBundler(2);

            sb.append(_SQL_COUNT_HORSEENTRY_WHERE);

            boolean bindUuid = false;

            if (uuid.isEmpty()) {
                sb.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                sb.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = sb.toString();

            Session session = null;

            try {
                session = openSession();

                Query query = session.createQuery(sql);

                QueryPos queryPos = QueryPos.getInstance(query);

                if (bindUuid) {
                    queryPos.add(uuid);
                }

                count = (Long) query.uniqueResult();

                finderCache.putResult(finderPath, finderArgs, count);
            } catch (Exception exception) {
                throw processException(exception);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the horse entry in the entity cache if it is enabled.
     *
     * @param horseEntry the horse entry
     */
    @Override
    public void cacheResult(HorseEntry horseEntry) {
        entityCache.putResult(
                HorseEntryImpl.class, horseEntry.getPrimaryKey(), horseEntry);
    }

    /**
     * Caches the horse entries in the entity cache if it is enabled.
     *
     * @param horseEntries the horse entries
     */
    @Override
    public void cacheResult(List<HorseEntry> horseEntries) {
        for (HorseEntry horseEntry : horseEntries) {
            if (entityCache.getResult(
                    HorseEntryImpl.class, horseEntry.getPrimaryKey()) == null) {

                cacheResult(horseEntry);
            }
        }
    }

    /**
     * Clears the cache for all horse entries.
     *
     * <p>
     * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        entityCache.clearCache(HorseEntryImpl.class);

        finderCache.clearCache(HorseEntryImpl.class);
    }

    /**
     * Clears the cache for the horse entry.
     *
     * <p>
     * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(HorseEntry horseEntry) {
        entityCache.removeResult(HorseEntryImpl.class, horseEntry);
    }

    @Override
    public void clearCache(List<HorseEntry> horseEntries) {
        for (HorseEntry horseEntry : horseEntries) {
            entityCache.removeResult(HorseEntryImpl.class, horseEntry);
        }
    }

    @Override
    public void clearCache(Set<Serializable> primaryKeys) {
        finderCache.clearCache(HorseEntryImpl.class);

        for (Serializable primaryKey : primaryKeys) {
            entityCache.removeResult(HorseEntryImpl.class, primaryKey);
        }
    }

    /**
     * Creates a new horse entry with the primary key. Does not add the horse entry to the database.
     *
     * @param entryId the primary key for the new horse entry
     * @return the new horse entry
     */
    @Override
    public HorseEntry create(long entryId) {
        HorseEntry horseEntry = new HorseEntryImpl();

        horseEntry.setNew(true);
        horseEntry.setPrimaryKey(entryId);

        String uuid = PortalUUIDUtil.generate();

        horseEntry.setUuid(uuid);

        return horseEntry;
    }

    /**
     * Removes the horse entry with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry that was removed
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    @Override
    public HorseEntry remove(long entryId) throws NoSuchHorseEntryException {
        return remove((Serializable) entryId);
    }

    /**
     * Removes the horse entry with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the horse entry
     * @return the horse entry that was removed
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    @Override
    public HorseEntry remove(Serializable primaryKey)
            throws NoSuchHorseEntryException {

        Session session = null;

        try {
            session = openSession();

            HorseEntry horseEntry = (HorseEntry) session.get(
                    HorseEntryImpl.class, primaryKey);

            if (horseEntry == null) {
                if (_log.isDebugEnabled()) {
                    _log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchHorseEntryException(
                        _NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            return remove(horseEntry);
        } catch (NoSuchHorseEntryException noSuchEntityException) {
            throw noSuchEntityException;
        } catch (Exception exception) {
            throw processException(exception);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected HorseEntry removeImpl(HorseEntry horseEntry) {
        Session session = null;

        try {
            session = openSession();

            if (!session.contains(horseEntry)) {
                horseEntry = (HorseEntry) session.get(
                        HorseEntryImpl.class, horseEntry.getPrimaryKeyObj());
            }

            if (horseEntry != null) {
                session.delete(horseEntry);
            }
        } catch (Exception exception) {
            throw processException(exception);
        } finally {
            closeSession(session);
        }

        if (horseEntry != null) {
            clearCache(horseEntry);
        }

        return horseEntry;
    }

    @Override
    public HorseEntry updateImpl(HorseEntry horseEntry) {
        boolean isNew = horseEntry.isNew();

        if (!(horseEntry instanceof HorseEntryModelImpl)) {
            InvocationHandler invocationHandler = null;

            if (ProxyUtil.isProxyClass(horseEntry.getClass())) {
                invocationHandler = ProxyUtil.getInvocationHandler(horseEntry);

                throw new IllegalArgumentException(
                        "Implement ModelWrapper in horseEntry proxy " +
                                invocationHandler.getClass());
            }

            throw new IllegalArgumentException(
                    "Implement ModelWrapper in custom HorseEntry implementation " +
                            horseEntry.getClass());
        }

        HorseEntryModelImpl horseEntryModelImpl =
                (HorseEntryModelImpl) horseEntry;

        if (Validator.isNull(horseEntry.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            horseEntry.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (isNew) {
                session.save(horseEntry);
            } else {
                horseEntry = (HorseEntry) session.merge(horseEntry);
            }
        } catch (Exception exception) {
            throw processException(exception);
        } finally {
            closeSession(session);
        }

        entityCache.putResult(
                HorseEntryImpl.class, horseEntryModelImpl, false, true);

        if (isNew) {
            horseEntry.setNew(false);
        }

        horseEntry.resetOriginalValues();

        return horseEntry;
    }

    /**
     * Returns the horse entry with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
     *
     * @param primaryKey the primary key of the horse entry
     * @return the horse entry
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    @Override
    public HorseEntry findByPrimaryKey(Serializable primaryKey)
            throws NoSuchHorseEntryException {

        HorseEntry horseEntry = fetchByPrimaryKey(primaryKey);

        if (horseEntry == null) {
            if (_log.isDebugEnabled()) {
                _log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchHorseEntryException(
                    _NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
        }

        return horseEntry;
    }

    /**
     * Returns the horse entry with the primary key or throws a <code>NoSuchHorseEntryException</code> if it could not be found.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry
     * @throws NoSuchHorseEntryException if a horse entry with the primary key could not be found
     */
    @Override
    public HorseEntry findByPrimaryKey(long entryId)
            throws NoSuchHorseEntryException {

        return findByPrimaryKey((Serializable) entryId);
    }

    /**
     * Returns the horse entry with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry, or <code>null</code> if a horse entry with the primary key could not be found
     */
    @Override
    public HorseEntry fetchByPrimaryKey(long entryId) {
        return fetchByPrimaryKey((Serializable) entryId);
    }

    /**
     * Returns all the horse entries.
     *
     * @return the horse entries
     */
    @Override
    public List<HorseEntry> findAll() {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<HorseEntry> findAll(int start, int end) {
        return findAll(start, end, null);
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
    @Override
    public List<HorseEntry> findAll(
            int start, int end, OrderByComparator<HorseEntry> orderByComparator) {

        return findAll(start, end, orderByComparator, true);
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
    @Override
    public List<HorseEntry> findAll(
            int start, int end, OrderByComparator<HorseEntry> orderByComparator,
            boolean useFinderCache) {

        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {

            if (useFinderCache) {
                finderPath = _finderPathWithoutPaginationFindAll;
                finderArgs = FINDER_ARGS_EMPTY;
            }
        } else if (useFinderCache) {
            finderPath = _finderPathWithPaginationFindAll;
            finderArgs = new Object[]{start, end, orderByComparator};
        }

        List<HorseEntry> list = null;

        if (useFinderCache) {
            list = (List<HorseEntry>) finderCache.getResult(
                    finderPath, finderArgs);
        }

        if (list == null) {
            StringBundler sb = null;
            String sql = null;

            if (orderByComparator != null) {
                sb = new StringBundler(
                        2 + (orderByComparator.getOrderByFields().length * 2));

                sb.append(_SQL_SELECT_HORSEENTRY);

                appendOrderByComparator(
                        sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

                sql = sb.toString();
            } else {
                sql = _SQL_SELECT_HORSEENTRY;

                sql = sql.concat(HorseEntryModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query query = session.createQuery(sql);

                list = (List<HorseEntry>) QueryUtil.list(
                        query, getDialect(), start, end);

                cacheResult(list);

                if (useFinderCache) {
                    finderCache.putResult(finderPath, finderArgs, list);
                }
            } catch (Exception exception) {
                throw processException(exception);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the horse entries from the database.
     */
    @Override
    public void removeAll() {
        for (HorseEntry horseEntry : findAll()) {
            remove(horseEntry);
        }
    }

    /**
     * Returns the number of horse entries.
     *
     * @return the number of horse entries
     */
    @Override
    public int countAll() {
        Long count = (Long) finderCache.getResult(
                _finderPathCountAll, FINDER_ARGS_EMPTY);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query query = session.createQuery(_SQL_COUNT_HORSEENTRY);

                count = (Long) query.uniqueResult();

                finderCache.putResult(
                        _finderPathCountAll, FINDER_ARGS_EMPTY, count);
            } catch (Exception exception) {
                throw processException(exception);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    public Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    @Override
    protected EntityCache getEntityCache() {
        return entityCache;
    }

    @Override
    protected String getPKDBName() {
        return "entryId";
    }

    @Override
    protected String getSelectSQL() {
        return _SQL_SELECT_HORSEENTRY;
    }

    @Override
    protected Map<String, Integer> getTableColumnsMap() {
        return HorseEntryModelImpl.TABLE_COLUMNS_MAP;
    }

    /**
     * Initializes the horse entry persistence.
     */
    @Activate
    public void activate(BundleContext bundleContext) {
        _bundleContext = bundleContext;

        _argumentsResolverServiceRegistration = _bundleContext.registerService(
                ArgumentsResolver.class, new HorseEntryModelArgumentsResolver(),
                new HashMapDictionary<>());

        _finderPathWithPaginationFindAll = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
                new String[0], true);

        _finderPathWithoutPaginationFindAll = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
                new String[0], true);

        _finderPathCountAll = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
                new String[0], new String[0], false);

        _finderPathWithPaginationFindByUuid = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
                new String[]{
                        String.class.getName(), Integer.class.getName(),
                        Integer.class.getName(), OrderByComparator.class.getName()
                },
                new String[]{"uuid_"}, true);

        _finderPathWithoutPaginationFindByUuid = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
                new String[]{String.class.getName()}, new String[]{"uuid_"},
                true);

        _finderPathCountByUuid = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
                new String[]{String.class.getName()}, new String[]{"uuid_"},
                false);
    }

    @Deactivate
    public void deactivate() {
        entityCache.removeCache(HorseEntryImpl.class.getName());

        _argumentsResolverServiceRegistration.unregister();
    }

    @Override
    @Reference(
            target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
            unbind = "-"
    )
    public void setConfiguration(Configuration configuration) {
    }

    @Override
    @Reference(
            target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
            unbind = "-"
    )
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }

    @Override
    @Reference(
            target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
            unbind = "-"
    )
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    protected FinderCache getFinderCache() {
        return finderCache;
    }

    private static class HorseEntryModelArgumentsResolver
            implements ArgumentsResolver {

        private static final Map<FinderPath, Long>
                _finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

        private static Object[] _getValue(
                HorseEntryModelImpl horseEntryModelImpl, String[] columnNames,
                boolean original) {

            Object[] arguments = new Object[columnNames.length];

            for (int i = 0; i < arguments.length; i++) {
                String columnName = columnNames[i];

                if (original) {
                    arguments[i] = horseEntryModelImpl.getColumnOriginalValue(
                            columnName);
                } else {
                    arguments[i] = horseEntryModelImpl.getColumnValue(
                            columnName);
                }
            }

            return arguments;
        }

        @Override
        public Object[] getArguments(
                FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
                boolean original) {

            String[] columnNames = finderPath.getColumnNames();

            if ((columnNames == null) || (columnNames.length == 0)) {
                if (baseModel.isNew()) {
                    return FINDER_ARGS_EMPTY;
                }

                return null;
            }

            HorseEntryModelImpl horseEntryModelImpl =
                    (HorseEntryModelImpl) baseModel;

            long columnBitmask = horseEntryModelImpl.getColumnBitmask();

            if (!checkColumn || (columnBitmask == 0)) {
                return _getValue(horseEntryModelImpl, columnNames, original);
            }

            Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
                    finderPath);

            if (finderPathColumnBitmask == null) {
                finderPathColumnBitmask = 0L;

                for (String columnName : columnNames) {
                    finderPathColumnBitmask |=
                            horseEntryModelImpl.getColumnBitmask(columnName);
                }

                _finderPathColumnBitmasksCache.put(
                        finderPath, finderPathColumnBitmask);
            }

            if ((columnBitmask & finderPathColumnBitmask) != 0) {
                return _getValue(horseEntryModelImpl, columnNames, original);
            }

            return null;
        }

        @Override
        public String getClassName() {
            return HorseEntryImpl.class.getName();
        }

        @Override
        public String getTableName() {
            return HorseEntryTable.INSTANCE.getTableName();
        }

    }

}