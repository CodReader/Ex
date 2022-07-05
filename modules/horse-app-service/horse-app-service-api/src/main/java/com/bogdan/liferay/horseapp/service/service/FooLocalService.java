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

import com.bogdan.liferay.horseapp.service.model.Foo;
import com.bogdan.liferay.horseapp.service.service.persistence.FooPK;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import org.osgi.annotation.versioning.ProviderType;

import java.io.Serializable;
import java.util.List;

/**
 * Provides the local service interface for Foo. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see FooLocalServiceUtil
 */
@ProviderType
@Transactional(
        isolation = Isolation.PORTAL,
        rollbackFor = {PortalException.class, SystemException.class}
)
public interface FooLocalService
        extends BaseLocalService, PersistedModelLocalService {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add custom service methods to <code>com.bogdan.liferay.horseapp.service.service.impl.FooLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the foo local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link FooLocalServiceUtil} if injection and service tracking are not available.
     */

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
    public Foo addFoo(Foo foo);

    /**
     * Creates a new foo with the primary key. Does not add the foo to the database.
     *
     * @param fooPK the primary key for the new foo
     * @return the new foo
     */
    @Transactional(enabled = false)
    public Foo createFoo(FooPK fooPK);

    /**
     * @throws PortalException
     */
    public PersistedModel createPersistedModel(Serializable primaryKeyObj)
            throws PortalException;

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
    public Foo deleteFoo(Foo foo);

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
    public Foo deleteFoo(FooPK fooPK) throws PortalException;

    /**
     * @throws PortalException
     */
    @Override
    public PersistedModel deletePersistedModel(PersistedModel persistedModel)
            throws PortalException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public <T> T dslQuery(DSLQuery dslQuery);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int dslQueryCount(DSLQuery dslQuery);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public DynamicQuery dynamicQuery();

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public <T> List<T> dynamicQuery(
            DynamicQuery dynamicQuery, int start, int end);

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public <T> List<T> dynamicQuery(
            DynamicQuery dynamicQuery, int start, int end,
            OrderByComparator<T> orderByComparator);

    /**
     * Returns the number of rows matching the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows matching the dynamic query
     */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public long dynamicQueryCount(DynamicQuery dynamicQuery);

    /**
     * Returns the number of rows matching the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection   the projection to apply to the query
     * @return the number of rows matching the dynamic query
     */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public long dynamicQueryCount(
            DynamicQuery dynamicQuery, Projection projection);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Foo fetchFoo(FooPK fooPK);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public ActionableDynamicQuery getActionableDynamicQuery();

    /**
     * Returns the foo with the primary key.
     *
     * @param fooPK the primary key of the foo
     * @return the foo
     * @throws PortalException if a foo with the primary key could not be found
     */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Foo getFoo(long fooPK) throws PortalException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Foo> getFoos(int start, int end);

    /**
     * Returns the number of foos.
     *
     * @return the number of foos
     */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getFoosCount();

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    public String getOSGiServiceIdentifier();

    /**
     * @throws PortalException
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
            throws PortalException;

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
    public Foo updateFoo(Foo foo);

}