create or alter procedure add_route(
	@start_location_id varchar(30), 
	@end_location_id varchar(30)
	)
as 
	begin 
		insert into route (start_location_id, end_location_id) values (@start_location_id, @end_location_id)
	end;