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

import com.bogdan.liferay.horseapp.service.exception.NoSuchFooException;
import com.bogdan.liferay.horseapp.service.model.Foo;
import com.bogdan.liferay.horseapp.service.model.FooTable;
import com.bogdan.liferay.horseapp.service.model.impl.FooImpl;
import com.bogdan.liferay.horseapp.service.model.impl.FooModelImpl;
import com.bogdan.liferay.horseapp.service.service.persistence.FooPersistence;
import com.bogdan.liferay.horseapp.service.service.persistence.impl.constants.FOOPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import javax.sql.DataSource;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The persistence implementation for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FooPersistence.class, BasePersistence.class})
public class FooPersistenceImpl
        extends BasePersistenceImpl<Foo> implements FooPersistence {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use <code>FooUtil</code> to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY =
            FooImpl.class.getName();

    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
            FINDER_CLASS_NAME_ENTITY + ".List1";

    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
            FINDER_CLASS_NAME_ENTITY + ".List2";
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 =
            "foo.groupId = ? AND ";
    private static final String _FINDER_COLUMN_GROUPID_STATUS_2 =
            "foo.status = ?";
    private static final String _SQL_SELECT_FOO = "SELECT foo FROM Foo foo";
    private static final String _SQL_SELECT_FOO_WHERE =
            "SELECT foo FROM Foo foo WHERE ";
    private static final String _SQL_COUNT_FOO =
            "SELECT COUNT(foo) FROM Foo foo";
    private static final String _SQL_COUNT_FOO_WHERE =
            "SELECT COUNT(foo) FROM Foo foo WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "foo.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
            "No Foo exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY =
            "No Foo exists with the key {";
    private static final Log _log = LogFactoryUtil.getLog(
            FooPersistenceImpl.class);
    @Reference
    protected EntityCache entityCache;
    @Reference
    protected FinderCache finderCache;
    private FinderPath _finderPathWithPaginationFindAll;
    private FinderPath _finderPathWithoutPaginationFindAll;
    private FinderPath _finderPathCountAll;
    private FinderPath _finderPathWithPaginationFindByGroupId;
    private FinderPath _finderPathWithoutPaginationFindByGroupId;
    private FinderPath _finderPathCountByGroupId;
    private BundleContext _bundleContext;
    private ServiceRegistration<ArgumentsResolver>
            _argumentsResolverServiceRegistration;

    public FooPersistenceImpl() {
        setModelClass(Foo.class);

        setModelImplClass(FooImpl.class);
        setModelPKClass(long.class);

        setTable(FooTable.INSTANCE);
    }

    /**
     * Returns all the foos where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status  the status
     * @return the matching foos
     */
    @Override
    public List<Foo> findByGroupId(long groupId, int status) {
        return findByGroupId(
                groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Foo> findByGroupId(
            long groupId, int status, int start, int end) {

        return findByGroupId(groupId, status, start, end, null);
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
    @Override
    public List<Foo> findByGroupId(
            long groupId, int status, int start, int end,
            OrderByComparator<Foo> orderByComparator) {

        return findByGroupId(
                groupId, status, start, end, orderByComparator, true);
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
    @Override
    public List<Foo> findByGroupId(
            long groupId, int status, int start, int end,
            OrderByComparator<Foo> orderByComparator, boolean useFinderCache) {

        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {

            if (useFinderCache) {
                finderPath = _finderPathWithoutPaginationFindByGroupId;
                finderArgs = new Object[]{groupId, status};
            }
        } else if (useFinderCache) {
            finderPath = _finderPathWithPaginationFindByGroupId;
            finderArgs = new Object[]{
                    groupId, status, start, end, orderByComparator
            };
        }

        List<Foo> list = null;

        if (useFinderCache) {
            list = (List<Foo>) finderCache.getResult(finderPath, finderArgs);

            if ((list != null) && !list.isEmpty()) {
                for (Foo foo : list) {
                    if ((groupId != foo.getGroupId()) ||
                            (status != foo.getStatus())) {

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
                        4 + (orderByComparator.getOrderByFields().length * 2));
            } else {
                sb = new StringBundler(4);
            }

            sb.append(_SQL_SELECT_FOO_WHERE);

            sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            sb.append(_FINDER_COLUMN_GROUPID_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(
                        sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
            } else {
                sb.append(FooModelImpl.ORDER_BY_JPQL);
            }

            String sql = sb.toString();

            Session session = null;

            try {
                session = openSession();

                Query query = session.createQuery(sql);

                QueryPos queryPos = QueryPos.getInstance(query);

                queryPos.add(groupId);

                queryPos.add(status);

                list = (List<Foo>) QueryUtil.list(
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
     * Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo
     * @throws NoSuchFooException if a matching foo could not be found
     */
    @Override
    public Foo findByGroupId_First(
            long groupId, int status, OrderByComparator<Foo> orderByComparator)
            throws NoSuchFooException {

        Foo foo = fetchByGroupId_First(groupId, status, orderByComparator);

        if (foo != null) {
            return foo;
        }

        StringBundler sb = new StringBundler(6);

        sb.append(_NO_SUCH_ENTITY_WITH_KEY);

        sb.append("groupId=");
        sb.append(groupId);

        sb.append(", status=");
        sb.append(status);

        sb.append("}");

        throw new NoSuchFooException(sb.toString());
    }

    /**
     * Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching foo, or <code>null</code> if a matching foo could not be found
     */
    @Override
    public Foo fetchByGroupId_First(
            long groupId, int status, OrderByComparator<Foo> orderByComparator) {

        List<Foo> list = findByGroupId(
                groupId, status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Foo findByGroupId_Last(
            long groupId, int status, OrderByComparator<Foo> orderByComparator)
            throws NoSuchFooException {

        Foo foo = fetchByGroupId_Last(groupId, status, orderByComparator);

        if (foo != null) {
            return foo;
        }

        StringBundler sb = new StringBundler(6);

        sb.append(_NO_SUCH_ENTITY_WITH_KEY);

        sb.append("groupId=");
        sb.append(groupId);

        sb.append(", status=");
        sb.append(status);

        sb.append("}");

        throw new NoSuchFooException(sb.toString());
    }

    /**
     * Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId           the group ID
     * @param status            the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching foo, or <code>null</code> if a matching foo could not be found
     */
    @Override
    public Foo fetchByGroupId_Last(
            long groupId, int status, OrderByComparator<Foo> orderByComparator) {

        int count = countByGroupId(groupId, status);

        if (count == 0) {
            return null;
        }

        List<Foo> list = findByGroupId(
                groupId, status, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Foo[] findByGroupId_PrevAndNext(
            long fooId, long groupId, int status,
            OrderByComparator<Foo> orderByComparator)
            throws NoSuchFooException {

        Foo foo = findByPrimaryKey(fooId);

        Session session = null;

        try {
            session = openSession();

            Foo[] array = new FooImpl[3];

            array[0] = getByGroupId_PrevAndNext(
                    session, foo, groupId, status, orderByComparator, true);

            array[1] = foo;

            array[2] = getByGroupId_PrevAndNext(
                    session, foo, groupId, status, orderByComparator, false);

            return array;
        } catch (Exception exception) {
            throw processException(exception);
        } finally {
            closeSession(session);
        }
    }

    protected Foo getByGroupId_PrevAndNext(
            Session session, Foo foo, long groupId, int status,
            OrderByComparator<Foo> orderByComparator, boolean previous) {

        StringBundler sb = null;

        if (orderByComparator != null) {
            sb = new StringBundler(
                    5 + (orderByComparator.getOrderByConditionFields().length * 3) +
                            (orderByComparator.getOrderByFields().length * 3));
        } else {
            sb = new StringBundler(4);
        }

        sb.append(_SQL_SELECT_FOO_WHERE);

        sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        sb.append(_FINDER_COLUMN_GROUPID_STATUS_2);

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
            sb.append(FooModelImpl.ORDER_BY_JPQL);
        }

        String sql = sb.toString();

        Query query = session.createQuery(sql);

        query.setFirstResult(0);
        query.setMaxResults(2);

        QueryPos queryPos = QueryPos.getInstance(query);

        queryPos.add(groupId);

        queryPos.add(status);

        if (orderByComparator != null) {
            for (Object orderByConditionValue :
                    orderByComparator.getOrderByConditionValues(foo)) {

                queryPos.add(orderByConditionValue);
            }
        }

        List<Foo> list = query.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the foos where groupId = &#63; and status = &#63; from the database.
     *
     * @param groupId the group ID
     * @param status  the status
     */
    @Override
    public void removeByGroupId(long groupId, int status) {
        for (Foo foo :
                findByGroupId(
                        groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                        null)) {

            remove(foo);
        }
    }

    /**
     * Returns the number of foos where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status  the status
     * @return the number of matching foos
     */
    @Override
    public int countByGroupId(long groupId, int status) {
        FinderPath finderPath = _finderPathCountByGroupId;

        Object[] finderArgs = new Object[]{groupId, status};

        Long count = (Long) finderCache.getResult(finderPath, finderArgs);

        if (count == null) {
            StringBundler sb = new StringBundler(3);

            sb.append(_SQL_COUNT_FOO_WHERE);

            sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            sb.append(_FINDER_COLUMN_GROUPID_STATUS_2);

            String sql = sb.toString();

            Session session = null;

            try {
                session = openSession();

                Query query = session.createQuery(sql);

                QueryPos queryPos = QueryPos.getInstance(query);

                queryPos.add(groupId);

                queryPos.add(status);

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
     * Caches the foo in the entity cache if it is enabled.
     *
     * @param foo the foo
     */
    @Override
    public void cacheResult(Foo foo) {
        entityCache.putResult(FooImpl.class, foo.getPrimaryKey(), foo);
    }

    /**
     * Caches the foos in the entity cache if it is enabled.
     *
     * @param foos the foos
     */
    @Override
    public void cacheResult(List<Foo> foos) {
        for (Foo foo : foos) {
            if (entityCache.getResult(FooImpl.class, foo.getPrimaryKey()) ==
                    null) {

                cacheResult(foo);
            }
        }
    }

    /**
     * Clears the cache for all foos.
     *
     * <p>
     * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        entityCache.clearCache(FooImpl.class);

        finderCache.clearCache(FooImpl.class);
    }

    /**
     * Clears the cache for the foo.
     *
     * <p>
     * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Foo foo) {
        entityCache.removeResult(FooImpl.class, foo);
    }

    @Override
    public void clearCache(List<Foo> foos) {
        for (Foo foo : foos) {
            entityCache.removeResult(FooImpl.class, foo);
        }
    }

    @Override
    public void clearCache(Set<Serializable> primaryKeys) {
        finderCache.clearCache(FooImpl.class);

        for (Serializable primaryKey : primaryKeys) {
            entityCache.removeResult(FooImpl.class, primaryKey);
        }
    }

    /**
     * Creates a new foo with the primary key. Does not add the foo to the database.
     *
     * @param fooId the primary key for the new foo
     * @return the new foo
     */
    @Override
    public Foo create(long fooId) {
        Foo foo = new FooImpl();

        foo.setNew(true);
        foo.setPrimaryKey(fooId);

        foo.setCompanyId(CompanyThreadLocal.getCompanyId());

        return foo;
    }

    /**
     * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param fooId the primary key of the foo
     * @return the foo that was removed
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    @Override
    public Foo remove(long fooId) throws NoSuchFooException {
        return remove((Serializable) fooId);
    }

    /**
     * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the foo
     * @return the foo that was removed
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    @Override
    public Foo remove(Serializable primaryKey) throws NoSuchFooException {
        Session session = null;

        try {
            session = openSession();

            Foo foo = (Foo) session.get(FooImpl.class, primaryKey);

            if (foo == null) {
                if (_log.isDebugEnabled()) {
                    _log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFooException(
                        _NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            return remove(foo);
        } catch (NoSuchFooException noSuchEntityException) {
            throw noSuchEntityException;
        } catch (Exception exception) {
            throw processException(exception);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Foo removeImpl(Foo foo) {
        Session session = null;

        try {
            session = openSession();

            if (!session.contains(foo)) {
                foo = (Foo) session.get(FooImpl.class, foo.getPrimaryKeyObj());
            }

            if (foo != null) {
                session.delete(foo);
            }
        } catch (Exception exception) {
            throw processException(exception);
        } finally {
            closeSession(session);
        }

        if (foo != null) {
            clearCache(foo);
        }

        return foo;
    }

    @Override
    public Foo updateImpl(Foo foo) {
        boolean isNew = foo.isNew();

        if (!(foo instanceof FooModelImpl)) {
            InvocationHandler invocationHandler = null;

            if (ProxyUtil.isProxyClass(foo.getClass())) {
                invocationHandler = ProxyUtil.getInvocationHandler(foo);

                throw new IllegalArgumentException(
                        "Implement ModelWrapper in foo proxy " +
                                invocationHandler.getClass());
            }

            throw new IllegalArgumentException(
                    "Implement ModelWrapper in custom Foo implementation " +
                            foo.getClass());
        }

        FooModelImpl fooModelImpl = (FooModelImpl) foo;

        ServiceContext serviceContext =
                ServiceContextThreadLocal.getServiceContext();

        Date date = new Date();

        if (isNew && (foo.getCreateDate() == null)) {
            if (serviceContext == null) {
                foo.setCreateDate(date);
            } else {
                foo.setCreateDate(serviceContext.getCreateDate(date));
            }
        }

        if (!fooModelImpl.hasSetModifiedDate()) {
            if (serviceContext == null) {
                foo.setModifiedDate(date);
            } else {
                foo.setModifiedDate(serviceContext.getModifiedDate(date));
            }
        }

        Session session = null;

        try {
            session = openSession();

            if (isNew) {
                session.save(foo);
            } else {
                foo = (Foo) session.merge(foo);
            }
        } catch (Exception exception) {
            throw processException(exception);
        } finally {
            closeSession(session);
        }

        entityCache.putResult(FooImpl.class, fooModelImpl, false, true);

        if (isNew) {
            foo.setNew(false);
        }

        foo.resetOriginalValues();

        return foo;
    }

    /**
     * Returns the foo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
     *
     * @param primaryKey the primary key of the foo
     * @return the foo
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    @Override
    public Foo findByPrimaryKey(Serializable primaryKey)
            throws NoSuchFooException {

        Foo foo = fetchByPrimaryKey(primaryKey);

        if (foo == null) {
            if (_log.isDebugEnabled()) {
                _log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFooException(
                    _NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
        }

        return foo;
    }

    /**
     * Returns the foo with the primary key or throws a <code>NoSuchFooException</code> if it could not be found.
     *
     * @param fooId the primary key of the foo
     * @return the foo
     * @throws NoSuchFooException if a foo with the primary key could not be found
     */
    @Override
    public Foo findByPrimaryKey(long fooId) throws NoSuchFooException {
        return findByPrimaryKey((Serializable) fooId);
    }

    /**
     * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param fooId the primary key of the foo
     * @return the foo, or <code>null</code> if a foo with the primary key could not be found
     */
    @Override
    public Foo fetchByPrimaryKey(long fooId) {
        return fetchByPrimaryKey((Serializable) fooId);
    }

    /**
     * Returns all the foos.
     *
     * @return the foos
     */
    @Override
    public List<Foo> findAll() {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Foo> findAll(int start, int end) {
        return findAll(start, end, null);
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
    @Override
    public List<Foo> findAll(
            int start, int end, OrderByComparator<Foo> orderByComparator) {

        return findAll(start, end, orderByComparator, true);
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
    @Override
    public List<Foo> findAll(
            int start, int end, OrderByComparator<Foo> orderByComparator,
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

        List<Foo> list = null;

        if (useFinderCache) {
            list = (List<Foo>) finderCache.getResult(finderPath, finderArgs);
        }

        if (list == null) {
            StringBundler sb = null;
            String sql = null;

            if (orderByComparator != null) {
                sb = new StringBundler(
                        2 + (orderByComparator.getOrderByFields().length * 2));

                sb.append(_SQL_SELECT_FOO);

                appendOrderByComparator(
                        sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

                sql = sb.toString();
            } else {
                sql = _SQL_SELECT_FOO;

                sql = sql.concat(FooModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query query = session.createQuery(sql);

                list = (List<Foo>) QueryUtil.list(
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
     * Removes all the foos from the database.
     */
    @Override
    public void removeAll() {
        for (Foo foo : findAll()) {
            remove(foo);
        }
    }

    /**
     * Returns the number of foos.
     *
     * @return the number of foos
     */
    @Override
    public int countAll() {
        Long count = (Long) finderCache.getResult(
                _finderPathCountAll, FINDER_ARGS_EMPTY);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query query = session.createQuery(_SQL_COUNT_FOO);

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
    protected EntityCache getEntityCache() {
        return entityCache;
    }

    @Override
    protected String getPKDBName() {
        return "fooId";
    }

    @Override
    protected String getSelectSQL() {
        return _SQL_SELECT_FOO;
    }

    @Override
    protected Map<String, Integer> getTableColumnsMap() {
        return FooModelImpl.TABLE_COLUMNS_MAP;
    }

    /**
     * Initializes the foo persistence.
     */
    @Activate
    public void activate(BundleContext bundleContext) {
        _bundleContext = bundleContext;

        _argumentsResolverServiceRegistration = _bundleContext.registerService(
                ArgumentsResolver.class, new FooModelArgumentsResolver(),
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

        _finderPathWithPaginationFindByGroupId = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
                new String[]{
                        Long.class.getName(), Integer.class.getName(),
                        Integer.class.getName(), Integer.class.getName(),
                        OrderByComparator.class.getName()
                },
                new String[]{"groupId", "status"}, true);

        _finderPathWithoutPaginationFindByGroupId = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
                new String[]{Long.class.getName(), Integer.class.getName()},
                new String[]{"groupId", "status"}, true);

        _finderPathCountByGroupId = new FinderPath(
                FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
                new String[]{Long.class.getName(), Integer.class.getName()},
                new String[]{"groupId", "status"}, false);
    }

    @Deactivate
    public void deactivate() {
        entityCache.removeCache(FooImpl.class.getName());

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

    private static class FooModelArgumentsResolver
            implements ArgumentsResolver {

        private static final Map<FinderPath, Long>
                _finderPathColumnBitmasksCache = new ConcurrentHashMap<>();
        private static final long _ORDER_BY_COLUMNS_BITMASK;

        static {
            long orderByColumnsBitmask = 0;

            orderByColumnsBitmask |= FooModelImpl.getColumnBitmask(
                    "createDate");

            _ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
        }

        private static Object[] _getValue(
                FooModelImpl fooModelImpl, String[] columnNames, boolean original) {

            Object[] arguments = new Object[columnNames.length];

            for (int i = 0; i < arguments.length; i++) {
                String columnName = columnNames[i];

                if (original) {
                    arguments[i] = fooModelImpl.getColumnOriginalValue(
                            columnName);
                } else {
                    arguments[i] = fooModelImpl.getColumnValue(columnName);
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

            FooModelImpl fooModelImpl = (FooModelImpl) baseModel;

            long columnBitmask = fooModelImpl.getColumnBitmask();

            if (!checkColumn || (columnBitmask == 0)) {
                return _getValue(fooModelImpl, columnNames, original);
            }

            Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
                    finderPath);

            if (finderPathColumnBitmask == null) {
                finderPathColumnBitmask = 0L;

                for (String columnName : columnNames) {
                    finderPathColumnBitmask |= fooModelImpl.getColumnBitmask(
                            columnName);
                }

                if (finderPath.isBaseModelResult() &&
                        (FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
                                finderPath.getCacheName())) {

                    finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
                }

                _finderPathColumnBitmasksCache.put(
                        finderPath, finderPathColumnBitmask);
            }

            if ((columnBitmask & finderPathColumnBitmask) != 0) {
                return _getValue(fooModelImpl, columnNames, original);
            }

            return null;
        }

        @Override
        public String getClassName() {
            return FooImpl.class.getName();
        }

        @Override
        public String getTableName() {
            return FooTable.INSTANCE.getTableName();
        }

    }

}