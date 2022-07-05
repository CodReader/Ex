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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FooPK implements Comparable<FooPK>, Serializable {

    public long fooId;
    public long id;

    public FooPK() {
    }

    public FooPK(long fooId, long id) {
        this.fooId = fooId;
        this.id = id;
    }

    public long getFooId() {
        return fooId;
    }

    public void setFooId(long fooId) {
        this.fooId = fooId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int compareTo(FooPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (fooId < pk.fooId) {
            value = -1;
        } else if (fooId > pk.fooId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (id < pk.id) {
            value = -1;
        } else if (id > pk.id) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof FooPK)) {
            return false;
        }

        FooPK pk = (FooPK) object;

        if ((fooId == pk.fooId) && (id == pk.id)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hashCode = 0;

        hashCode = HashUtil.hash(hashCode, fooId);
        hashCode = HashUtil.hash(hashCode, id);

        return hashCode;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(6);

        sb.append("{");

        sb.append("fooId=");

        sb.append(fooId);
        sb.append(", id=");

        sb.append(id);

        sb.append("}");

        return sb.toString();
    }

}