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

package com.bogdan.liferay.horseapp.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Foo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see Foo
 */
public class FooWrapper
        extends BaseModelWrapper<Foo> implements Foo, ModelWrapper<Foo> {

    public FooWrapper(Foo foo) {
        super(foo);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("fooId", getFooId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("id", getId());
        attributes.put("modelSpeed", getModelSpeed());
        attributes.put("field1", getField1());
        attributes.put("field2", isField2());
        attributes.put("field3", getField3());
        attributes.put("field4", getField4());
        attributes.put("field5", getField5());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusByUserName", getStatusByUserName());
        attributes.put("statusDate", getStatusDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long fooId = (Long) attributes.get("fooId");

        if (fooId != null) {
            setFooId(fooId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer modelSpeed = (Integer) attributes.get("modelSpeed");

        if (modelSpeed != null) {
            setModelSpeed(modelSpeed);
        }

        String field1 = (String) attributes.get("field1");

        if (field1 != null) {
            setField1(field1);
        }

        Boolean field2 = (Boolean) attributes.get("field2");

        if (field2 != null) {
            setField2(field2);
        }

        Integer field3 = (Integer) attributes.get("field3");

        if (field3 != null) {
            setField3(field3);
        }

        Date field4 = (Date) attributes.get("field4");

        if (field4 != null) {
            setField4(field4);
        }

        String field5 = (String) attributes.get("field5");

        if (field5 != null) {
            setField5(field5);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        String statusByUserName = (String) attributes.get("statusByUserName");

        if (statusByUserName != null) {
            setStatusByUserName(statusByUserName);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }
    }

    /**
     * Returns the company ID of this foo.
     *
     * @return the company ID of this foo
     */
    @Override
    public long getCompanyId() {
        return model.getCompanyId();
    }

    /**
     * Sets the company ID of this foo.
     *
     * @param companyId the company ID of this foo
     */
    @Override
    public void setCompanyId(long companyId) {
        model.setCompanyId(companyId);
    }

    /**
     * Returns the create date of this foo.
     *
     * @return the create date of this foo
     */
    @Override
    public Date getCreateDate() {
        return model.getCreateDate();
    }

    /**
     * Sets the create date of this foo.
     *
     * @param createDate the create date of this foo
     */
    @Override
    public void setCreateDate(Date createDate) {
        model.setCreateDate(createDate);
    }

    /**
     * Returns the field1 of this foo.
     *
     * @return the field1 of this foo
     */
    @Override
    public String getField1() {
        return model.getField1();
    }

    /**
     * Sets the field1 of this foo.
     *
     * @param field1 the field1 of this foo
     */
    @Override
    public void setField1(String field1) {
        model.setField1(field1);
    }

    /**
     * Returns the field2 of this foo.
     *
     * @return the field2 of this foo
     */
    @Override
    public boolean getField2() {
        return model.getField2();
    }

    /**
     * Returns the field3 of this foo.
     *
     * @return the field3 of this foo
     */
    @Override
    public int getField3() {
        return model.getField3();
    }

    /**
     * Sets the field3 of this foo.
     *
     * @param field3 the field3 of this foo
     */
    @Override
    public void setField3(int field3) {
        model.setField3(field3);
    }

    /**
     * Returns the field4 of this foo.
     *
     * @return the field4 of this foo
     */
    @Override
    public Date getField4() {
        return model.getField4();
    }

    /**
     * Sets the field4 of this foo.
     *
     * @param field4 the field4 of this foo
     */
    @Override
    public void setField4(Date field4) {
        model.setField4(field4);
    }

    /**
     * Returns the field5 of this foo.
     *
     * @return the field5 of this foo
     */
    @Override
    public String getField5() {
        return model.getField5();
    }

    /**
     * Sets the field5 of this foo.
     *
     * @param field5 the field5 of this foo
     */
    @Override
    public void setField5(String field5) {
        model.setField5(field5);
    }

    /**
     * Returns the foo ID of this foo.
     *
     * @return the foo ID of this foo
     */
    @Override
    public long getFooId() {
        return model.getFooId();
    }

    /**
     * Sets the foo ID of this foo.
     *
     * @param fooId the foo ID of this foo
     */
    @Override
    public void setFooId(long fooId) {
        model.setFooId(fooId);
    }

    /**
     * Returns the group ID of this foo.
     *
     * @return the group ID of this foo
     */
    @Override
    public long getGroupId() {
        return model.getGroupId();
    }

    /**
     * Sets the group ID of this foo.
     *
     * @param groupId the group ID of this foo
     */
    @Override
    public void setGroupId(long groupId) {
        model.setGroupId(groupId);
    }

    /**
     * Returns the ID of this foo.
     *
     * @return the ID of this foo
     */
    @Override
    public long getId() {
        return model.getId();
    }

    /**
     * Sets the ID of this foo.
     *
     * @param id the ID of this foo
     */
    @Override
    public void setId(Long id) {
        model.setId(id);
    }

    /**
     * Returns the model speed of this foo.
     *
     * @return the model speed of this foo
     */
    @Override
    public int getModelSpeed() {
        return model.getModelSpeed();
    }

    /**
     * Sets the model speed of this foo.
     *
     * @param modelSpeed the model speed of this foo
     */
    @Override
    public void setModelSpeed(int modelSpeed) {
        model.setModelSpeed(modelSpeed);
    }

    /**
     * Returns the modified date of this foo.
     *
     * @return the modified date of this foo
     */
    @Override
    public Date getModifiedDate() {
        return model.getModifiedDate();
    }

    /**
     * Sets the modified date of this foo.
     *
     * @param modifiedDate the modified date of this foo
     */
    @Override
    public void setModifiedDate(Date modifiedDate) {
        model.setModifiedDate(modifiedDate);
    }

    /**
     * Returns the primary key of this foo.
     *
     * @return the primary key of this foo
     */
    @Override
    public com.bogdan.liferay.horseapp.service.service.persistence.FooPK
    getPrimaryKey() {

        return model.getPrimaryKey();
    }

    /**
     * Sets the primary key of this foo.
     *
     * @param primaryKey the primary key of this foo
     */
    @Override
    public void setPrimaryKey(
            com.bogdan.liferay.horseapp.service.service.persistence.FooPK
                    primaryKey) {

        model.setPrimaryKey(primaryKey);
    }

    /**
     * Returns the status of this foo.
     *
     * @return the status of this foo
     */
    @Override
    public int getStatus() {
        return model.getStatus();
    }

    /**
     * Sets the status of this foo.
     *
     * @param status the status of this foo
     */
    @Override
    public void setStatus(int status) {
        model.setStatus(status);
    }

    /**
     * Returns the status by user ID of this foo.
     *
     * @return the status by user ID of this foo
     */
    @Override
    public long getStatusByUserId() {
        return model.getStatusByUserId();
    }

    /**
     * Sets the status by user ID of this foo.
     *
     * @param statusByUserId the status by user ID of this foo
     */
    @Override
    public void setStatusByUserId(long statusByUserId) {
        model.setStatusByUserId(statusByUserId);
    }

    /**
     * Returns the status by user name of this foo.
     *
     * @return the status by user name of this foo
     */
    @Override
    public String getStatusByUserName() {
        return model.getStatusByUserName();
    }

    /**
     * Sets the status by user name of this foo.
     *
     * @param statusByUserName the status by user name of this foo
     */
    @Override
    public void setStatusByUserName(String statusByUserName) {
        model.setStatusByUserName(statusByUserName);
    }

    /**
     * Returns the status by user uuid of this foo.
     *
     * @return the status by user uuid of this foo
     */
    @Override
    public String getStatusByUserUuid() {
        return model.getStatusByUserUuid();
    }

    /**
     * Sets the status by user uuid of this foo.
     *
     * @param statusByUserUuid the status by user uuid of this foo
     */
    @Override
    public void setStatusByUserUuid(String statusByUserUuid) {
        model.setStatusByUserUuid(statusByUserUuid);
    }

    /**
     * Returns the status date of this foo.
     *
     * @return the status date of this foo
     */
    @Override
    public Date getStatusDate() {
        return model.getStatusDate();
    }

    /**
     * Sets the status date of this foo.
     *
     * @param statusDate the status date of this foo
     */
    @Override
    public void setStatusDate(Date statusDate) {
        model.setStatusDate(statusDate);
    }

    /**
     * Returns the user ID of this foo.
     *
     * @return the user ID of this foo
     */
    @Override
    public long getUserId() {
        return model.getUserId();
    }

    /**
     * Sets the user ID of this foo.
     *
     * @param userId the user ID of this foo
     */
    @Override
    public void setUserId(long userId) {
        model.setUserId(userId);
    }

    /**
     * Returns the user name of this foo.
     *
     * @return the user name of this foo
     */
    @Override
    public String getUserName() {
        return model.getUserName();
    }

    /**
     * Sets the user name of this foo.
     *
     * @param userName the user name of this foo
     */
    @Override
    public void setUserName(String userName) {
        model.setUserName(userName);
    }

    /**
     * Returns the user uuid of this foo.
     *
     * @return the user uuid of this foo
     */
    @Override
    public String getUserUuid() {
        return model.getUserUuid();
    }

    /**
     * Sets the user uuid of this foo.
     *
     * @param userUuid the user uuid of this foo
     */
    @Override
    public void setUserUuid(String userUuid) {
        model.setUserUuid(userUuid);
    }

    /**
     * Returns <code>true</code> if this foo is approved.
     *
     * @return <code>true</code> if this foo is approved; <code>false</code> otherwise
     */
    @Override
    public boolean isApproved() {
        return model.isApproved();
    }

    /**
     * Returns <code>true</code> if this foo is denied.
     *
     * @return <code>true</code> if this foo is denied; <code>false</code> otherwise
     */
    @Override
    public boolean isDenied() {
        return model.isDenied();
    }

    /**
     * Returns <code>true</code> if this foo is a draft.
     *
     * @return <code>true</code> if this foo is a draft; <code>false</code> otherwise
     */
    @Override
    public boolean isDraft() {
        return model.isDraft();
    }

    /**
     * Returns <code>true</code> if this foo is expired.
     *
     * @return <code>true</code> if this foo is expired; <code>false</code> otherwise
     */
    @Override
    public boolean isExpired() {
        return model.isExpired();
    }

    /**
     * Returns <code>true</code> if this foo is field2.
     *
     * @return <code>true</code> if this foo is field2; <code>false</code> otherwise
     */
    @Override
    public boolean isField2() {
        return model.isField2();
    }

    /**
     * Sets whether this foo is field2.
     *
     * @param field2 the field2 of this foo
     */
    @Override
    public void setField2(boolean field2) {
        model.setField2(field2);
    }

    /**
     * Returns <code>true</code> if this foo is inactive.
     *
     * @return <code>true</code> if this foo is inactive; <code>false</code> otherwise
     */
    @Override
    public boolean isInactive() {
        return model.isInactive();
    }

    /**
     * Returns <code>true</code> if this foo is incomplete.
     *
     * @return <code>true</code> if this foo is incomplete; <code>false</code> otherwise
     */
    @Override
    public boolean isIncomplete() {
        return model.isIncomplete();
    }

    /**
     * Returns <code>true</code> if this foo is pending.
     *
     * @return <code>true</code> if this foo is pending; <code>false</code> otherwise
     */
    @Override
    public boolean isPending() {
        return model.isPending();
    }

    /**
     * Returns <code>true</code> if this foo is scheduled.
     *
     * @return <code>true</code> if this foo is scheduled; <code>false</code> otherwise
     */
    @Override
    public boolean isScheduled() {
        return model.isScheduled();
    }

    @Override
    public void persist() {
        model.persist();
    }

    @Override
    protected FooWrapper wrap(Foo foo) {
        return new FooWrapper(foo);
    }

}