CREATE OR ALTER PROCEDURE update_booking_info(
  @schedule_id AS int, 
  @class AS varchar(20),
  @price AS numeric(4,2)  = NULL
)
AS 
	BEGIN 
		update booking_info
		set price = case when @price is null then price else @price END
	    where schedule_id = @schedule_id and @class = class
	END;