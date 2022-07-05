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

import com.bogdan.liferay.horseapp.service.service.base.HorseEntryServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the horse entry remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.bogdan.liferay.horseapp.service.service.HorseEntryService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorseEntryServiceBaseImpl
 */
@Component(
        property = {
                "json.web.service.context.name=foo",
                "json.web.service.context.path=HorseEntry"
        },
        service = AopService.class
)
public class HorseEntryServiceImpl extends HorseEntryServiceBaseImpl {

}