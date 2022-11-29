create or alter procedure use_case_3(
	@class varchar(20) = NULL,
	@lowerbound numeric(6,2) = NULL,
	@upperbound numeric(6,2) = NULL)
as
	begin
	if @lowerbound is null or @upperbound is null or @class is null
		with AllFlights as(
			select S.*, BI.class, BI.price
			from (select * from booking_info where class = @class or @lowerbound <= price or 
			@upperbound >= price) as BI 
			inner join
			(select * from schedule) as S on S.schedule_id = BI.schedule_id)
		
		select route.start_location_id as departing,route.end_location_id as destination,AllFlights.*
		from AllFlights,route
		where route.route_id = AllFlights.route_id

	else
		with AllFlights as(
			select S.*, BI.class, BI.price
			from (select * from booking_info where class = @class and @lowerbound <= price and 
			@upperbound >= price) as BI 
			inner join
			(select * from schedule) as S on S.schedule_id = BI.schedule_id)

		select route.start_location_id as departing,route.end_location_id as destination,AllFlights.*
		from AllFlights,route
		where route.route_id = AllFlights.route_id
	end;
