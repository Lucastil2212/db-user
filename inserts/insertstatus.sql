create or alter procedure add_status(
	@status varchar(20), 
	@description varchar(50)
	)
as 
	begin
		insert into status (status, description) values (@status, @description)
	end;