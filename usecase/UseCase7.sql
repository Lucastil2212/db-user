create or alter procedure use_case_7(
@lowerdate datetime,
@upperdate datetime,
@start_location varchar(30),
@end_location varchar(30))
AS
BEGIN 
	delete from schedule
	where start_time >= @lowerdate and end_time <= @upperdate and 
	route_id in (select route_id from route where start_location_id = @start_location 
				and end_location_id = @end_location)
END;