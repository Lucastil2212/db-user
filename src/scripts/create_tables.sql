BEGIN
	CREATE TABLE location 
	( location_id int IDENTITY(1, 1),
	  name varchar(30) NOT NULL,
	  capacity int NOT NULL check (capacity > 0),
	  primary key(location_id));

	CREATE TABLE route
	( route_id int IDENTITY(1, 1),
	  start_location_id int NOT NULL,
	  end_location_id int NOT NULL,
	  foreign key(start_location_id) references location(location_id) on delete cascade,
	  foreign key(end_location_id) references location(location_id),
	  primary key(route_id));

	CREATE TABLE status
	( status varchar(20) ,
	  description varchar(50) NOT NULL,
	  primary key(status));

	CREATE TABLE passenger
	( email varchar(25),
	  name varchar(25) NOT NULL,
	  primary key(email));

	CREATE TABLE pilot
	( pilot_id int IDENTITY(1, 1),
	  name varchar(25) NOT NULL,
	  salary numeric(6, 2) NOT NULL check (salary > 0),
	  primary key(pilot_id))
	  ;

	CREATE TABLE plane
	( plane_id int IDENTITY(1,1),
	  model varchar(10) NOT NULL,
	  manufacturer varchar(20) NOT NULL,
	  capacity int NOT NULL check(capacity > 0),
	  primary key(plane_id));

	CREATE TABLE schedule
	( schedule_id int IDENTITY(1,1),
	  plane_id int NOT NULL,
	  route_id int NOT NULL,
	  start_time datetime NOT NULL,
	  end_time datetime NOT NULL,
	  pilot_id int NOT NULL,
	  status varchar(20) NOT NULL,
	  primary key(schedule_id),
	  foreign key(plane_id) references plane on delete cascade,
	  foreign key(route_id) references route on delete cascade,
	  foreign key(pilot_id) references pilot on delete cascade);

	CREATE TABLE booking_info
	( schedule_id int,
	  class varchar(20) check(class in ('Economy', 'Business', 'First Class', 'Premium Economy')),
	  price numeric(4, 2),
	  primary key(schedule_id, class),
	  foreign key(schedule_id) references schedule on delete cascade);

	CREATE TABLE booking
	( booking_id int IDENTITY(1, 1),
	  schedule_id int NOT NULL,
	  class varchar(20) NOT NULL check(class in ('Economy', 'Business', 'First Class', 'Premium Economy')),
	  email varchar(25) NOT NULL,
	  seat_num varchar(3) NOT NULL,
	  primary key(booking_id),
	  foreign key(schedule_id, class) references booking_info on delete cascade on update cascade,
	  foreign key(email) references passenger on delete cascade on update cascade);
  END