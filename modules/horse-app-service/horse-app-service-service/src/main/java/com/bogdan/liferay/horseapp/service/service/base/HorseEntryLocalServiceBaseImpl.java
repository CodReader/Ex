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

import com.bogdan.liferay.horseapp.service.model.HorseEntry;
import com.bogdan.liferay.horseapp.service.service.HorseEntryLocalService;
import com.bogdan.liferay.horseapp.service.service.HorseEntryLocalServiceUtil;
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
 * Provides the base implementation for the horse entry local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.bogdan.liferay.horseapp.service.service.impl.HorseEntryLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see com.bogdan.liferay.horseapp.service.service.impl.HorseEntryLocalServiceImpl
 */
public abstract class HorseEntryLocalServiceBaseImpl
        extends BaseLocalServiceImpl
        implements AopService, HorseEntryLocalService, IdentifiableOSGiService {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Use <code>HorseEntryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>HorseEntryLocalServiceUtil</code>.
     */

    @Reference
    protected FooPersistence fooPersistence;
    protected HorseEntryLocalService horseEntryLocalService;
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
     * Adds the horse entry to the database. Also notifies the appropriate model listeners.
     *
     * <p>
     * <strong>Important:</strong> Inspect HorseEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
     * </p>
     *
     * @param horseEntry the horse entry
     * @return the horse entry that was added
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public HorseEntry addHorseEntry(HorseEntry horseEntry) {
        horseEntry.setNew(true);

        return horseEntryPersistence.update(horseEntry);
    }

    /**
     * Creates a new horse entry with the primary key. Does not add the horse entry to the database.
     *
     * @param entryId the primary key for the new horse entry
     * @return the new horse entry
     */
    @Override
    @Transactional(enabled = false)
    public HorseEntry createHorseEntry(long entryId) {
        return horseEntryPersistence.create(entryId);
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
    @Indexable(type = IndexableType.DELETE)
    @Override
    public HorseEntry deleteHorseEntry(long entryId) throws PortalException {
        return horseEntryPersistence.remove(entryId);
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
    @Indexable(type = IndexableType.DELETE)
    @Override
    public HorseEntry deleteHorseEntry(HorseEntry horseEntry) {
        return horseEntryPersistence.remove(horseEntry);
    }

    @Override
    public <T> T dslQuery(DSLQuery dslQuery) {
        return horseEntryPersistence.dslQuery(dslQuery);
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
                HorseEntry.class, clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     */
    @Override
    public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
        return horseEntryPersistence.findWithDynamicQuery(dynamicQuery);
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
    public <T> List<T> dynamicQuery(
            DynamicQuery dynamicQuery, int start, int end) {

        return horseEntryPersistence.findWithDynamicQuery(
                dynamicQuery, start, end);
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
    public <T> List<T> dynamicQuery(
            DynamicQuery dynamicQuery, int start, int end,
            OrderByComparator<T> orderByComparator) {

        return horseEntryPersistence.findWithDynamicQuery(
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
        return horseEntryPersistence.countWithDynamicQuery(dynamicQuery);
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

        return horseEntryPersistence.countWithDynamicQuery(
                dynamicQuery, projection);
    }

    @Override
    public HorseEntry fetchHorseEntry(long entryId) {
        return horseEntryPersistence.fetchByPrimaryKey(entryId);
    }

    /**
     * Returns the horse entry with the primary key.
     *
     * @param entryId the primary key of the horse entry
     * @return the horse entry
     * @throws PortalException if a horse entry with the primary key could not be found
     */
    @Override
    public HorseEntry getHorseEntry(long entryId) throws PortalException {
        return horseEntryPersistence.findByPrimaryKey(entryId);
    }

    @Override
    public ActionableDynamicQuery getActionableDynamicQuery() {
        ActionableDynamicQuery actionableDynamicQuery =
                new DefaultActionableDynamicQuery();

        actionableDynamicQuery.setBaseLocalService(horseEntryLocalService);
        actionableDynamicQuery.setClassLoader(getClassLoader());
        actionableDynamicQuery.setModelClass(HorseEntry.class);

        actionableDynamicQuery.setPrimaryKeyPropertyName("entryId");

        return actionableDynamicQuery;
    }

    @Override
    public IndexableActionableDynamicQuery
    getIndexableActionableDynamicQuery() {

        IndexableActionableDynamicQuery indexableActionableDynamicQuery =
                new IndexableActionableDynamicQuery();

        indexableActionableDynamicQuery.setBaseLocalService(
                horseEntryLocalService);
        indexableActionableDynamicQuery.setClassLoader(getClassLoader());
        indexableActionableDynamicQuery.setModelClass(HorseEntry.class);

        indexableActionableDynamicQuery.setPrimaryKeyPropertyName("entryId");

        return indexableActionableDynamicQuery;
    }

    protected void initActionableDynamicQuery(
            ActionableDynamicQuery actionableDynamicQuery) {

        actionableDynamicQuery.setBaseLocalService(horseEntryLocalService);
        actionableDynamicQuery.setClassLoader(getClassLoader());
        actionableDynamicQuery.setModelClass(HorseEntry.class);

        actionableDynamicQuery.setPrimaryKeyPropertyName("entryId");
    }

    /**
     * @throws PortalException
     */
    @Override
    public PersistedModel createPersistedModel(Serializable primaryKeyObj)
            throws PortalException {

        return horseEntryPersistence.create(((Long) primaryKeyObj).longValue());
    }

    /**
     * @throws PortalException
     */
    @Override
    public PersistedModel deletePersistedModel(PersistedModel persistedModel)
            throws PortalException {

        return horseEntryLocalService.deleteHorseEntry(
                (HorseEntry) persistedModel);
    }

    @Override
    public BasePersistence<HorseEntry> getBasePersistence() {
        return horseEntryPersistence;
    }

    /**
     * @throws PortalException
     */
    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
            throws PortalException {

        return horseEntryPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<HorseEntry> getHorseEntries(int start, int end) {
        return horseEntryPersistence.findAll(start, end);
    }

    /**
     * Returns the number of horse entries.
     *
     * @return the number of horse entries
     */
    @Override
    public int getHorseEntriesCount() {
        return horseEntryPersistence.countAll();
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
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public HorseEntry updateHorseEntry(HorseEntry horseEntry) {
        return horseEntryPersistence.update(horseEntry);
    }

    @Deactivate
    protected void deactivate() {
        _setLocalServiceUtilService(null);
    }

    @Override
    public Class<?>[] getAopInterfaces() {
        return new Class<?>[]{
                HorseEntryLocalService.class, IdentifiableOSGiService.class,
                PersistedModelLocalService.class
        };
    }

    @Override
    public void setAopProxy(Object aopProxy) {
        horseEntryLocalService = (HorseEntryLocalService) aopProxy;

        _setLocalServiceUtilService(horseEntryLocalService);
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    @Override
    public String getOSGiServiceIdentifier() {
        return HorseEntryLocalService.class.getName();
    }

    protected Class<?> getModelClass() {
        return HorseEntry.class;
    }

    protected String getModelClassName() {
        return HorseEntry.class.getName();
    }

    /**
     * Performs a SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) {
        try {
            DataSource dataSource = horseEntryPersistence.getDataSource();

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

    private void _setLocalServiceUtilService(
            HorseEntryLocalService horseEntryLocalService) {

        try {
            Field field = HorseEntryLocalServiceUtil.class.getDeclaredField(
                    "_service");

            field.setAccessible(true);

            field.set(null, horseEntryLocalService);
        } catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

}