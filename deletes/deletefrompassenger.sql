create or alter procedure delete_passenger(
	@email varchar(25)
)
as 
	begin
	delete from passenger where email = @email
	end;
