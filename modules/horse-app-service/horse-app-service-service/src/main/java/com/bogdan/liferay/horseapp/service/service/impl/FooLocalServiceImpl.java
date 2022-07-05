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

package com.bogdan.liferay.horseapp.service.service.impl;

import com.bogdan.liferay.horseapp.service.exception.NoSuchFooException;
import com.bogdan.liferay.horseapp.service.model.Foo;
import com.bogdan.liferay.horseapp.service.service.base.FooLocalServiceBaseImpl;
import com.bogdan.lifray.serviceapp.api.Horse;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.bogdan.liferay.horseapp.service.service.FooLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalServiceBaseImpl
 */
@Component(
        property = "model.class.name=com.bogdan.liferay.horseapp.service.model.Foo",
        service = AopService.class
)


public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {

    private final Horse horse = new Horse();
    private final Date now = new Date();


    public Foo addEntry(long userId, ServiceContext serviceContext) throws PortalException {
        long groupId = serviceContext.getScopeGroupId();
        User user = userLocalService.getUserById(userId);
        long entryId = counterLocalService.increment();
        Foo foo = fooPersistence.create(entryId);
        foo.setModelSpeed(horse.getModelSpeed());
        foo.setCompanyId(user.getCompanyId());
        foo.setGroupId(groupId);
        foo.setUserName(user.getFullName());
        foo.setCreateDate(serviceContext.getCreateDate(now));
        foo.setModifiedDate(serviceContext.getModifiedDate(now));
        foo.setExpandoBridgeAttributes(serviceContext);

        fooPersistence.update(foo);

        return foo;
    }

    public Foo updateEntry(long userId, ServiceContext serviceContext, long entryId) throws PortalException, SystemException {


        User user = userLocalService.getUserById(userId);

        Foo foo = getFoo(entryId);

        foo.setUserId(userId);
        foo.setUserName(user.getFullName());
        foo.setModifiedDate(serviceContext.getModifiedDate(now));
        foo.setModelSpeed(horse.getModelSpeed());
        foo.setExpandoBridgeAttributes(serviceContext);
        fooPersistence.update(foo);

        return foo;
    }

    public Foo deleteEntry(Foo foo) throws PortalException {
        fooPersistence.remove(foo);

        return foo;
    }


    public List<Foo> getFooEntries(long groupId, int modelSpeed) {
        return fooPersistence.findByGroupId(groupId, modelSpeed);
    }

    public int getFooEntriesCount(Long groupId, int modelSpeed) {
        return fooPersistence.countByGroupId(groupId, modelSpeed);
    }


    protected void validate(String foo) throws PortalException {
        if (Validator.isNull(foo)) {
            throw new NoSuchFooException();
        }
    }


}
