create or alter procedure use_case_6(
@expensive_flight_price numeric(6,2),
@plane_id int,
@route_id int,
@start_time datetime,
@end_time datetime,
@pilot_id  int,
@status varchar(20))
AS 
	BEGIN 
		if @expensive_flight_price >= (select max(price)
										from booking_info) 
			and @end_time - @start_time >= 0

			insert into schedule
			values(@plane_id, @route_id,@start_time,@end_time,@pilot_id,@status)
		
	END;
