create or alter procedure delete_pilot(
	@pilot_id as int
)
as 
	begin
	delete from pilot where pilot_id = @pilot_id
	end;