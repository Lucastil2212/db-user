 create procedure delete_location(
	@name varchar(30)
)
as 
		delete from location where name = @name
	commit transaction;

	go

create procedure delete_route(
	@route_id int
)
as 
	delete from route where route_id = @route_id
	commit transaction;

	go 

create procedure delete_status(
	@status varchar(20)
)
as 
	delete from status where status = @status
	commit transaction;

	go

create procedure delete_pilot(
	@name varchar(20)
)
as 
	delete from pilot where name = @name
	commit transaction;

		go

create procedure delete_passenger(
	@email varchar(25)
)
as 
	delete from passenger where email = @email
	commit transaction;

	go

create procedure delete_schedule(
	@schedule_id int
)
as 
	delete from schedule where schedule_id = @schedule_id
	commit transaction;
		
		go

create procedure delete_boooking_info(
	@schedule_id int,
	@class varchar(20)
)
as 
	delete from booking_info where schedule_id = @schedule_id and class = @class
	commit transaction;

	go

create procedure delete_booking(
	@booking_id int
)
as 
	delete from booking where booking_id = @booking_id
	commit transaction;