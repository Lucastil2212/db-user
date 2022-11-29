create or alter procedure delete_location(
	@airport_name as varchar(30))
as 
	begin
		delete from location where @airport_name = @airport_name
	end;