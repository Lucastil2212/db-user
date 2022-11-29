create or alter procedure delete_boooking_info(
	@schedule_id int,
	@class varchar(20)
)
as 
	begin
	delete from booking_info where schedule_id = @schedule_id and class = @class
	end;