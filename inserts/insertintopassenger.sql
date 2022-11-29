create or alter procedure add_passenger(
	@email varchar(25),
	@name varchar(25))
as 
	begin
		insert passenger (email, name) values (@email, @name)
	end;
