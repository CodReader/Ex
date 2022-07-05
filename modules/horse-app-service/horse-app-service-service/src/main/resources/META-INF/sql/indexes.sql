create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_60EF89B3 on FOO_Foo (id_, modelSpeed);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C8B46B00 on FOO_HorseEntry (uuid_[$COLUMN_LENGTH:75$]);