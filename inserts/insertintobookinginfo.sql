create or alter procedure add_booking_info(
	@schedule_id int, 
	@class varchar(20),
	@price numeric(4, 2)
)
as 
	begin
		insert booking_info (schedule_id, class, price) values (@schedule_id, @class, @price)
	end;