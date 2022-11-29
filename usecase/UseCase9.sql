create procedure use_case_9(
@locationA as varchar(30),
@locationB as  varchar(30),
@newStatus as varchar(20),
@planeModel as varchar(10))
AS
BEGIN
	update schedule
	set status = @newStatus
	where route_id in (select route_id from route where route.start_location_id = @locationA 
	and route.end_location_id = @locationB)
	and @planeModel in (select model from plane where plane.plane_id = schedule.plane_id)
END;