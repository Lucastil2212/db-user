create or alter procedure add_location(
	@airport_name varchar(30), @capacity int)
as 
	begin
		insert into location (airport_name, capacity) values (@airport_name, @capacity);
	end;