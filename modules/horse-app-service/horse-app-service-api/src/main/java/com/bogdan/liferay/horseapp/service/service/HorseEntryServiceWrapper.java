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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HorseEntryService}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see HorseEntryService
 */
public class HorseEntryServiceWrapper
        implements HorseEntryService, ServiceWrapper<HorseEntryService> {

    private HorseEntryService _horseEntryService;

    public HorseEntryServiceWrapper(HorseEntryService horseEntryService) {
        _horseEntryService = horseEntryService;
    }

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    @Override
    public String getOSGiServiceIdentifier() {
        return _horseEntryService.getOSGiServiceIdentifier();
    }

    @Override
    public HorseEntryService getWrappedService() {
        return _horseEntryService;
    }

    @Override
    public void setWrappedService(HorseEntryService horseEntryService) {
        _horseEntryService = horseEntryService;
    }

}