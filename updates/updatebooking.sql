CREATE OR ALTER PROCEDURE update_booking(
  @booking_id AS int, 
  @schedule_id AS int = NULL,
  @class AS varchar(20)  = NULL,
  @email AS varchar(25) = NULL,
  @seat_num AS varchar(3) = NULL
)
AS 
	BEGIN 
		update booking
		set schedule_id = case when @schedule_id is null then schedule_id else @schedule_id END,
	    class = case when @class is null then class else @class END,
	    email = case when @email is null then email else @email END,
		seat_num = case when @seat_num is null then seat_num else @seat_num END
	   where @booking_id = booking_id
	END;