Create table entries(
		id integer primary key autoincrement,
		url string not null,
		image url string not null,
		excerpt string not null,
		source string not null,
		updated timestamp not null,
		last refresh timestamp not null);

