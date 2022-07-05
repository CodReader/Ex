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

package com.bogdan.liferay.horseapp.service.model.impl;

import com.bogdan.liferay.horseapp.service.model.Foo;
import com.bogdan.liferay.horseapp.service.service.persistence.FooPK;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * The cache model class for representing Foo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FooCacheModel implements CacheModel<Foo>, Externalizable {

    public long fooId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long id;
    public int modelSpeed;
    public String field1;
    public boolean field2;
    public int field3;
    public long field4;
    public String field5;
    public int status;
    public long statusByUserId;
    public String statusByUserName;
    public long statusDate;
    public transient FooPK fooPK;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof FooCacheModel)) {
            return false;
        }

        FooCacheModel fooCacheModel = (FooCacheModel) object;

        if (fooPK.equals(fooCacheModel.fooPK)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return HashUtil.hash(0, fooPK);
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(37);

        sb.append("{fooId=");
        sb.append(fooId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", id=");
        sb.append(id);
        sb.append(", modelSpeed=");
        sb.append(modelSpeed);
        sb.append(", field1=");
        sb.append(field1);
        sb.append(", field2=");
        sb.append(field2);
        sb.append(", field3=");
        sb.append(field3);
        sb.append(", field4=");
        sb.append(field4);
        sb.append(", field5=");
        sb.append(field5);
        sb.append(", status=");
        sb.append(status);
        sb.append(", statusByUserId=");
        sb.append(statusByUserId);
        sb.append(", statusByUserName=");
        sb.append(statusByUserName);
        sb.append(", statusDate=");
        sb.append(statusDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Foo toEntityModel() {
        FooImpl fooImpl = new FooImpl();

        fooImpl.setFooId(fooId);
        fooImpl.setGroupId(groupId);
        fooImpl.setCompanyId(companyId);
        fooImpl.setUserId(userId);

        if (userName == null) {
            fooImpl.setUserName("");
        } else {
            fooImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            fooImpl.setCreateDate(null);
        } else {
            fooImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            fooImpl.setModifiedDate(null);
        } else {
            fooImpl.setModifiedDate(new Date(modifiedDate));
        }

        fooImpl.setId(id);
        fooImpl.setModelSpeed(modelSpeed);

        if (field1 == null) {
            fooImpl.setField1("");
        } else {
            fooImpl.setField1(field1);
        }

        fooImpl.setField2(field2);
        fooImpl.setField3(field3);

        if (field4 == Long.MIN_VALUE) {
            fooImpl.setField4(null);
        } else {
            fooImpl.setField4(new Date(field4));
        }

        if (field5 == null) {
            fooImpl.setField5("");
        } else {
            fooImpl.setField5(field5);
        }

        fooImpl.setStatus(status);
        fooImpl.setStatusByUserId(statusByUserId);

        if (statusByUserName == null) {
            fooImpl.setStatusByUserName("");
        } else {
            fooImpl.setStatusByUserName(statusByUserName);
        }

        if (statusDate == Long.MIN_VALUE) {
            fooImpl.setStatusDate(null);
        } else {
            fooImpl.setStatusDate(new Date(statusDate));
        }

        fooImpl.resetOriginalValues();

        return fooImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        fooId = objectInput.readLong();

        groupId = objectInput.readLong();

        companyId = objectInput.readLong();

        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();

        id = objectInput.readLong();

        modelSpeed = objectInput.readInt();
        field1 = objectInput.readUTF();

        field2 = objectInput.readBoolean();

        field3 = objectInput.readInt();
        field4 = objectInput.readLong();
        field5 = objectInput.readUTF();

        status = objectInput.readInt();

        statusByUserId = objectInput.readLong();
        statusByUserName = objectInput.readUTF();
        statusDate = objectInput.readLong();

        fooPK = new FooPK(fooId, id);
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(fooId);

        objectOutput.writeLong(groupId);

        objectOutput.writeLong(companyId);

        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        objectOutput.writeLong(id);

        objectOutput.writeInt(modelSpeed);

        if (field1 == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(field1);
        }

        objectOutput.writeBoolean(field2);

        objectOutput.writeInt(field3);
        objectOutput.writeLong(field4);

        if (field5 == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(field5);
        }

        objectOutput.writeInt(status);

        objectOutput.writeLong(statusByUserId);

        if (statusByUserName == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(statusByUserName);
        }

        objectOutput.writeLong(statusDate);
    }

}