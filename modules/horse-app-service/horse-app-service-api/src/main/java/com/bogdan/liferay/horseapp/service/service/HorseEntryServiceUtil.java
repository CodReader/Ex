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

/**
 * Provides the remote service utility for HorseEntry. This utility wraps
 * <code>com.bogdan.liferay.horseapp.service.service.impl.HorseEntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see HorseEntryService
 */
public class HorseEntryServiceUtil {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to <code>com.bogdan.liferay.horseapp.service.service.impl.HorseEntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
     */

    private static volatile HorseEntryService _service;

    /**
     * Returns the OSGi service identifier.
     *
     * @return the OSGi service identifier
     */
    public static java.lang.String getOSGiServiceIdentifier() {
        return getService().getOSGiServiceIdentifier();
    }

    public static HorseEntryService getService() {
        return _service;
    }

}