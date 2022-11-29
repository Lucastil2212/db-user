create or alter procedure delete_plane(
	@plane_id int
)
as 
	begin
	delete from plane where plane_id = @plane_id
	end;