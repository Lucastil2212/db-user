create or alter procedure add_pilot(
	@name varchar(25),
	@salary numeric(6,2)
	)
as 
	begin
		insert into pilot (name, salary) values (@name, @salary)
	end;