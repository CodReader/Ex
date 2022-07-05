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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bogdan.liferay.horseapp.service.service.http.HorseEntryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 */
@Deprecated
public class HorseEntrySoap implements Serializable {

    private String _uuid;
    private long _entryId;
    private int _modelSpeed;

    public HorseEntrySoap() {
    }

    public static HorseEntrySoap toSoapModel(HorseEntry model) {
        HorseEntrySoap soapModel = new HorseEntrySoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setEntryId(model.getEntryId());
        soapModel.setModelSpeed(model.getModelSpeed());

        return soapModel;
    }

    public static HorseEntrySoap[] toSoapModels(HorseEntry[] models) {
        HorseEntrySoap[] soapModels = new HorseEntrySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static HorseEntrySoap[][] toSoapModels(HorseEntry[][] models) {
        HorseEntrySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new HorseEntrySoap[models.length][models[0].length];
        } else {
            soapModels = new HorseEntrySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static HorseEntrySoap[] toSoapModels(List<HorseEntry> models) {
        List<HorseEntrySoap> soapModels = new ArrayList<HorseEntrySoap>(
                models.size());

        for (HorseEntry model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new HorseEntrySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _entryId;
    }

    public void setPrimaryKey(long pk) {
        setEntryId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getEntryId() {
        return _entryId;
    }

    public void setEntryId(long entryId) {
        _entryId = entryId;
    }

    public int getModelSpeed() {
        return _modelSpeed;
    }

    public void setModelSpeed(int modelSpeed) {
        _modelSpeed = modelSpeed;
    }

}