create procedure add_location(
	@name varchar(30), @capacity int
)
as 
	begin transaction 
		insert into location (name, capacity) values (@name, @capacity);
	commit transaction;

	go

create procedure add_route(
	@start_location_id int, 
	@end_location_id int
	)
as 
	begin transaction 
		insert into route (start_location_id, end_location_id) values (@start_location_id, @end_location_id)
	commit transaction;

	go 

create procedure add_status(
	@status varchar(20), 
	@description varchar(50)
	)
as 
	begin transaction 
		insert into status (status, description) values (@status, @description)
	commit transaction;

	go 

create procedure add_pilot(
	@name varchar(25),
	@salary numeric(6,2)
	)
as 
	begin transaction
		insert into pilot (name, salary) values (@name, @salary)
	commit transaction;

	go 

create procedure add_schedule(
	@plane_id int,	
	@route_id int,
	@start_time datetime,
	@end_time datetime,
	@pilot_id int,
	@status varchar(20)
)
as
	begin transaction 
		insert into schedule (plane_id, route_id, start_time, end_time, pilot_id, status) values (@plane_id, @route_id, @start_time, @end_time, @pilot_id, @status)
	commit transaction

	go

create procedure add_booking_info(
	@schedule_id int, 
	@class varchar(20),
	@price numeric(4, 2)
)
as 
	begin transaction 
		insert booking_info (schedule_id, class, price) values (@schedule_id, @class, @price)
	commit transaction

	go 

create procedure add_booking(
	@schedule_id int,
	@class varchar(20),
	@email varchar(25),
	@seat_num varchar(3)
)
as
	begin transaction 
		insert booking (schedule_id, class, email, seat_num) values (@schedule_id, @class, @email, @seat_num)
	commit transaction;

	go 

create procedure add_plane(
	@model varchar(10),
	@manufacturer varchar(20),
	@capacity int
)
as 
	begin transaction 
		insert plane (model, manufacturer, capacity) values (@model, @manufacturer, @capacity)
	commit transaction

create procedure add_passenger(
	@email varchar(25),
	@name varchar(25),
)
as 
	begin transaction 
		insert passenger (email, name) values (@email, @name)
	commit transaction
