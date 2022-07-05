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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HorseEntry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see HorseEntry
 */
public class HorseEntryWrapper
        extends BaseModelWrapper<HorseEntry>
        implements HorseEntry, ModelWrapper<HorseEntry> {

    public HorseEntryWrapper(HorseEntry horseEntry) {
        super(horseEntry);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("entryId", getEntryId());
        attributes.put("modelSpeed", getModelSpeed());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long entryId = (Long) attributes.get("entryId");

        if (entryId != null) {
            setEntryId(entryId);
        }

        Integer modelSpeed = (Integer) attributes.get("modelSpeed");

        if (modelSpeed != null) {
            setModelSpeed(modelSpeed);
        }
    }

    /**
     * Returns the entry ID of this horse entry.
     *
     * @return the entry ID of this horse entry
     */
    @Override
    public long getEntryId() {
        return model.getEntryId();
    }

    /**
     * Sets the entry ID of this horse entry.
     *
     * @param entryId the entry ID of this horse entry
     */
    @Override
    public void setEntryId(long entryId) {
        model.setEntryId(entryId);
    }

    /**
     * Returns the model speed of this horse entry.
     *
     * @return the model speed of this horse entry
     */
    @Override
    public int getModelSpeed() {
        return model.getModelSpeed();
    }

    /**
     * Sets the model speed of this horse entry.
     *
     * @param modelSpeed the model speed of this horse entry
     */
    @Override
    public void setModelSpeed(int modelSpeed) {
        model.setModelSpeed(modelSpeed);
    }

    /**
     * Returns the primary key of this horse entry.
     *
     * @return the primary key of this horse entry
     */
    @Override
    public long getPrimaryKey() {
        return model.getPrimaryKey();
    }

    /**
     * Sets the primary key of this horse entry.
     *
     * @param primaryKey the primary key of this horse entry
     */
    @Override
    public void setPrimaryKey(long primaryKey) {
        model.setPrimaryKey(primaryKey);
    }

    /**
     * Returns the uuid of this horse entry.
     *
     * @return the uuid of this horse entry
     */
    @Override
    public String getUuid() {
        return model.getUuid();
    }

    /**
     * Sets the uuid of this horse entry.
     *
     * @param uuid the uuid of this horse entry
     */
    @Override
    public void setUuid(String uuid) {
        model.setUuid(uuid);
    }

    @Override
    public void persist() {
        model.persist();
    }

    @Override
    protected HorseEntryWrapper wrap(HorseEntry horseEntry) {
        return new HorseEntryWrapper(horseEntry);
    }

}