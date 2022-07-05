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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;FOO_HorseEntry&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @generated
 * @see HorseEntry
 */
public class HorseEntryTable extends BaseTable<HorseEntryTable> {

    public static final HorseEntryTable INSTANCE = new HorseEntryTable();

    public final Column<HorseEntryTable, String> uuid = createColumn(
            "uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
    public final Column<HorseEntryTable, Long> entryId = createColumn(
            "entryId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
    public final Column<HorseEntryTable, Integer> modelSpeed = createColumn(
            "modelSpeed", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

    private HorseEntryTable() {
        super("FOO_HorseEntry", HorseEntryTable::new);
    }

}