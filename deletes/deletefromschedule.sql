create or alter procedure delete_schedule(
	@schedule_id int
)
as 
	begin
	delete from schedule where schedule_id = @schedule_id
	end;
