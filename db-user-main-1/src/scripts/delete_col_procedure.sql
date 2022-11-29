 create or alter procedure delete_location(
	@location_id as int
)
as 
	begin
		delete from location where location_id = @location_id
	end;

create or alter procedure delete_route(
	@route_id int
)
as 
	begin
	delete from route where route_id = @route_id
	end;

create or alter procedure delete_status(
	@status varchar(20)
)
as 
	begin
	delete from status where status = @status
	end;

create or alter procedure delete_pilot(
	@pilot_id as int
)
as 
	begin
	delete from pilot where pilot_id = @pilot_id
	end;

create or alter procedure delete_passenger(
	@email varchar(25)
)
as 
	begin
	delete from passenger where email = @email
	end;

create or alter procedure delete_schedule(
	@schedule_id int
)
as 
	begin
	delete from schedule where schedule_id = @schedule_id
	end;


create or alter procedure delete_boooking_info(
	@schedule_id int,
	@class varchar(20)
)
as 
	begin
	delete from booking_info where schedule_id = @schedule_id and class = @class
	end;

create procedure delete_booking(
	@booking_id int
)
as 
	begin
	delete from booking where booking_id = @booking_id
	end;

create or alter procedure delete_plane(
	@plane_id int
)
as 
	begin
	delete from plane where plane_id = @plane_id
	end;