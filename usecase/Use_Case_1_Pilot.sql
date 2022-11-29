CREATE OR ALTER PROCEDURE Use_Case_1_Pilot(
@start_location_id AS varchar(30) = NULL,
@end_location_id AS varchar(30) = NULL,
@pilot_id AS int)
AS 
	BEGIN
	
	If @start_location_id is NULL or  @end_location_id is NULL
		select S.schedule_id,R.start_location_id as departing_location,R.end_location_id as destination,S.start_time,S.end_time
		from ((select * from route where @end_location_id = end_location_id  or @end_location_id is NULL) as R
			  INNER JOIN schedule as S on S.route_id = R.route_id)
		where S.pilot_id =  @pilot_id;
	ELSE
		select S.schedule_id,R.start_location_id as departing_location,R.end_location_id as destination,S.start_time,S.end_time
		from ((select * from route where @end_location_id = end_location_id and @start_location_id = start_location_id) as R
			  INNER JOIN schedule as S on S.route_id = R.route_id)
			  where S.pilot_id =  @pilot_id;
	END;