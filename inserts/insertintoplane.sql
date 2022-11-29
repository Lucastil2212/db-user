create or alter procedure add_plane(
	@model varchar(10),
	@manufacturer varchar(20),
	@capacity int
)
as 
	begin 
		insert plane (model, manufacturer, capacity) values (@model, @manufacturer, @capacity)
	end;