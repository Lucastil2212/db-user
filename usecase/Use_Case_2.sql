CREATE OR ALTER PROCEDURE use_case_2(
	@airport_name varchar(20),
	@arrival_time datetime)
as
	begin
		with incoming(schedule_id) as(
			select schedule_id 
			from (select * from schedule where @arrival_time = end_time) as S 
			inner join 
			(select * from route where end_location_id = @airport_name) as R
			on S.route_id = R.route_id
			),
		 sum_booking(sums) as (
			select count(*)
			from booking where schedule_id in (select schedule_id from incoming)
			)
		
		select airport_name, 'Under Capacity'
		from location as L,sum_booking as SB
		where @airport_name = airport_name and capacity <= SB.sums

	end;

