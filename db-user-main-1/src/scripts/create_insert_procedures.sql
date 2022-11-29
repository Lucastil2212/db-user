create or alter procedure add_location(
	@city_name varchar(30), @capacity int
)
as 
	begin
		insert into location (name, capacity) values (@name, @capacity);
	end;

create or alter procedure add_route(
	@start_location_id int, 
	@end_location_id int
	)
as 
	begin 
		insert into route (start_location_id, end_location_id) values (@start_location_id, @end_location_id)
	end;

create or alter procedure add_status(
	@status varchar(20), 
	@description varchar(50)
	)
as 
	begin
		insert into status (status, description) values (@status, @description)
	end;

create or alter procedure add_pilot(
	@name varchar(25),
	@salary numeric(6,2)
	)
as 
	begin
		insert into pilot (name, salary) values (@name, @salary)
	end;

create or alter procedure add_schedule(
	@plane_id int,	
	@route_id int,
	@start_time datetime,
	@end_time datetime,
	@pilot_id int,
	@status varchar(20)
)
as
	BEGIN TRANSACTION T2
		IF @end_time - @start_time <= 0
		BEGIN
		PRINT 'End time cannot be less than or equal to start time';
		ROLLBACK TRAN T2
		END
		else
		BEGIN
			insert into schedule (plane_id, route_id, start_time, end_time, pilot_id, status) values (@plane_id, @route_id, @start_time, @end_time, @pilot_id, @status)
			COMMIT TRANSACTION T2;
		END

create or alter procedure add_booking_info(
	@schedule_id int, 
	@class varchar(20),
	@price numeric(4, 2)
)
as 
	begin
		insert booking_info (schedule_id, class, price) values (@schedule_id, @class, @price)
	end;

create or alter procedure add_booking(
	@schedule_id int,
	@class varchar(20),
	@email varchar(25),
	@seat_num varchar(3)
)
as
	begin
		insert booking (schedule_id, class, email, seat_num) values (@schedule_id, @class, @email, @seat_num)
	end;

create or alter procedure add_plane(
	@model varchar(10),
	@manufacturer varchar(20),
	@capacity int
)
as 
	begin 
		insert plane (model, manufacturer, capacity) values (@model, @manufacturer, @capacity)
	end;

create or alter procedure add_passenger(
	@email varchar(25),
	@name varchar(25),
)
as 
	begin
		insert passenger (email, name) values (@email, @name)
	end;
