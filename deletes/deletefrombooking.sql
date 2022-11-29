create procedure delete_booking(
	@booking_id int
)
as 
	begin
	delete from booking where booking_id = @booking_id
	end;