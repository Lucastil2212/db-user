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
