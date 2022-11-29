create or alter procedure delete_status(
	@status varchar(20)
)
as 
	begin
	delete from status where status = @status
	end;