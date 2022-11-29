create or alter view allPilots as (
	select P.*,R.start_location_id,R.end_location_id,S.start_time,S.end_time,S.plane_id,S.status
	from  (schedule as S right outer join pilot as P on P.pilot_id = S.pilot_id)
		  left outer join route R on R.route_id = S.route_id)
