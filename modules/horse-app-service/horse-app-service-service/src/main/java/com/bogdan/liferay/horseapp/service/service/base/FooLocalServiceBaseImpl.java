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

package com.bogdan.liferay.horseapp.service.service.base;

import com.bogdan.liferay.horseapp.service.model.Foo;
import com.bogdan.liferay.horseapp.service.service.FooLocalService;
import com.bogdan.liferay.horseapp.service.service.FooLocalServiceUtil;
import com.bogdan.liferay.horseapp.service.service.persistence.FooPK;
import com.bogdan.liferay.horseapp.service.service.persistence.FooPersistence;
import com.bogdan.liferay.horseapp.service.service.persistence.HorseEntryPersistence;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import javax.sql.DataSource;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

/**
 * Provides the base implementation for the foo local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.bogdan.liferay.horseapp.service.service.impl.FooLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see com.bogdan.liferay.horseapp.service.service.impl.FooLocalServiceImpl
 */
public abstract class FooLocalServiceBaseImpl
        extends BaseLocalServiceImpl
        implements AopService, FooLocalService, IdentifiableOSGiService {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Use <code>FooLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>FooLocalServiceUtil</code>.
     */

    protected FooLocalService fooLocalService;
    @Reference
    protected FooPersistence fooPersistence;
    @Reference
    protected HorseEntryPersistence horseEntryPersistence;
    @Reference
    protected com.liferay.counter.kernel.service.CounterLocalService
            counterLocalService;
    @Reference
    protected com.liferay.portal.kernel.service.ClassNameLocalService
            classNameLocalService;
    @Reference
    protected com.liferay.portal.kernel.service.ResourceLocalService
            resourceLocalService;
    @Reference
    protected com.liferay.portal.kernel.service.UserLocalService
            userLocalService;

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
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Foo addFoo(Foo foo) {
        foo.setNew(true);

        return fooPersistence.update(foo);
    }

    /**
     * Creates a new foo with the primary key. Does not add the foo to the database.
     *
     * @param fooPK the primary key for the new foo
     * @return the new foo
     */
    @Override
    @Transactional(enabled = false)
    public Foo createFoo(FooPK fooPK) {
        return fooPersistence.create(fooPK);
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
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Foo deleteFoo(FooPK fooPK) throws PortalException {
        return fooPersistence.remove(fooPK);
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
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Foo deleteFoo(Foo foo) {
        return fooPersistence.remove(foo);
    }

    @Override
    public <T> T dslQuery(DSLQuery dslQuery) {
        return fooPersistence.dslQuery(dslQuery);
    }

    @Override
    public int dslQueryCount(DSLQuery dslQuery) {
        Long count = dslQuery(dslQuery);

        return count.intValue();
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(
                Foo.class, clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     */
    @Override
    public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
        return fooPersistence.findWithDynamicQuery(dynamicQuery);
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
    public <T> List<T> dynamicQuery(
            DynamicQuery dynamicQuery, int start, int end) {

        return fooPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public <T> List<T> dynamicQuery(
            DynamicQuery dynamicQuery, int start, int end,
            OrderByComparator<T> orderByComparator) {

        return fooPersistence.findWithDynamicQuery(
                dynamicQuery, start, end, orderByComparator);
    }

    /**
     * Returns the number of rows matching the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows matching the dynamic query
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery) {
        return fooPersistence.countWithDynamicQuery(dynamicQuery);
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
            DynamicQuery dynamicQuery, Projection projection) {

        return fooPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Foo fetchFoo(FooPK fooPK) {
        return fooPersistence.fetchByPrimaryKey(fooPK);
    }

    /**
     * Returns the foo with the primary key.
     *
     * @param fooPK the primary key of the foo
     * @return the foo
     * @throws PortalException if a foo with the primary key could not be found
     */
    @Override
    public Foo getFoo(long fooPK) throws PortalException {
        return fooPersistence.findByPrimaryKey(fooPK);
    }

    @Override
    public ActionableDynamicQuery getActionableDynamicQuery() {
        ActionableDynamicQuery actionableDynamicQuery =
                new DefaultActionableDynamicQuery();

        actionableDynamicQuery.setBaseLocalService(fooLocalService);
        actionableDynamicQuery.setClassLoader(getClassLoader());
        actionableDynamicQuery.setModelClass(Foo.class);

        actionableDynamicQuery.setPrimaryKeyPropertyName("primaryKey.fooId");

        return actionableDynamicQuery;
    }

    @Override
    public IndexableActionableDynamicQuery
    getIndexableActionableDynamicQuery() {

        IndexableActionableDynamicQuery indexableActionableDynamicQuery =
                new IndexableActionableDynamicQuery();

        indexableActionableDynamicQuery.setBaseLocalService(fooLocalService);
        indexableActionableDynamicQuery.setClassLoader(getClassLoader());
        indexableActionableDynamicQuery.setModelClass(Foo.class);

        indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
                "primaryKey.fooId");

        return indexableActionableDynamicQuery;
    }

    protected void initActionableDynamicQuery(
            ActionableDynamicQuery actionableDynamicQuery) {

        actionableDynamicQuery.setBaseLocalService(fooLocalService);
        actionableDynamicQuery.setClassLoader(getClassLoader());
        actionableDynamicQuery.setModelClass(Foo.class);

        actionableDynamicQuery.setPrimaryKeyPropertyName("primaryKey.fooId");
    }

    /**
     * @throws PortalException
     */
    @Override
    public PersistedModel createPersistedModel(Serializable primaryKeyObj)
            throws PortalException {

        return fooPersistence.create((FooPK) primaryKeyObj);
    }

    /**
     * @throws PortalException
     */
    @Override
    public PersistedModel deletePersistedModel(PersistedModel persistedModel)
            throws PortalException {

        return fooLocalService.deleteFoo((Foo) persistedModel);
    }

    @Override
    public BasePersistence<Foo> getBasePersistence() {
        return fooPersistence;
    }

    /**
     * @throws PortalException
     */
    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
            throws PortalException {

        return fooPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<Foo> getFoos(int start, int end) {
        return fooPersistence.findAll(start, end);
    }

    /**
     * Returns the number of foos.
     *
     * @return the number of foos
     */
    @Override
    public int getFoosCount() {
        return fooPersistence.countAll();
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
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Foo updateFoo(Foo foo) {
        return fooPersistence.update(foo);
    }

    @Deactivate
    protected void deactivate() {
        _setLocalServiceUtilService(null);
    }

    @Override
    public Class<?>[] getAopInterfaces() {
        return new Class<?>[]{
                FooLocalService.class, IdentifiableOSGiService.class,
                PersistedModelLocalService.class
        };
    }

    @Override
    public void setAopProxy(Object aopProxy) {
        fooLocalService = (FooLocalService) aopProxy;

        _setLocalServiceUtilService(fooLocalService);
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    @Override
    public String getOSGiServiceIdentifier() {
        return FooLocalService.class.getName();
    }

    protected Class<?> getModelClass() {
        return Foo.class;
    }

    protected String getModelClassName() {
        return Foo.class.getName();
    }

    /**
     * Performs a SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) {
        try {
            DataSource dataSource = fooPersistence.getDataSource();

            DB db = DBManagerUtil.getDB();

            sql = db.buildSQL(sql);
            sql = PortalUtil.transformSQL(sql);

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
                    dataSource, sql);

            sqlUpdate.update();
        } catch (Exception exception) {
            throw new SystemException(exception);
        }
    }

    private void _setLocalServiceUtilService(FooLocalService fooLocalService) {
        try {
            Field field = FooLocalServiceUtil.class.getDeclaredField(
                    "_service");

            field.setAccessible(true);

            field.set(null, fooLocalService);
        } catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

}