create or alter procedure delete_route(
	@route_id int
)
as 
	begin
	delete from route where route_id = @route_id
	end;