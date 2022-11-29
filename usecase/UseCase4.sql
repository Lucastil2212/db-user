CREATE OR ALTER PROCEDURE use_case_4(
@email varchar(25),
@upgrade_price numeric(6,2),
@schedule_id int)
AS 
	BEGIN
	with passengers(email) as(
	select email
	from booking as B
	where email = @email and @upgrade_price <= (select sum(price)
												  from booking_info as T
												  where B.schedule_id = T.schedule_id and 
														B.class = T.class))
	update booking
	set class = 'First Class'
	where @email = email and @schedule_id = schedule_id
	
	END;