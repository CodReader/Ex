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

import com.bogdan.liferay.horseapp.service.model.HorseEntry;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing HorseEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HorseEntryCacheModel
        implements CacheModel<HorseEntry>, Externalizable {

    public String uuid;
    public long entryId;
    public int modelSpeed;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof HorseEntryCacheModel)) {
            return false;
        }

        HorseEntryCacheModel horseEntryCacheModel =
                (HorseEntryCacheModel) object;

        if (entryId == horseEntryCacheModel.entryId) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return HashUtil.hash(0, entryId);
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", entryId=");
        sb.append(entryId);
        sb.append(", modelSpeed=");
        sb.append(modelSpeed);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public HorseEntry toEntityModel() {
        HorseEntryImpl horseEntryImpl = new HorseEntryImpl();

        if (uuid == null) {
            horseEntryImpl.setUuid("");
        } else {
            horseEntryImpl.setUuid(uuid);
        }

        horseEntryImpl.setEntryId(entryId);
        horseEntryImpl.setModelSpeed(modelSpeed);

        horseEntryImpl.resetOriginalValues();

        return horseEntryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();

        entryId = objectInput.readLong();

        modelSpeed = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF("");
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(entryId);

        objectOutput.writeInt(modelSpeed);
    }

}