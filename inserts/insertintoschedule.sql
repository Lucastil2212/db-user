create or alter procedure add_schedule(
	@plane_id int,	
	@route_id int,
	@start_time datetime,
	@end_time datetime,
	@pilot_id int,
	@status varchar(20)
)
as
	BEGIN TRANSACTION T2
		IF @end_time - @start_time <= 0
		BEGIN
		PRINT 'End time cannot be less than or equal to start time';
		ROLLBACK TRAN T2
		END
		else
		BEGIN
			insert into schedule (plane_id, route_id, start_time, end_time, pilot_id, status) values (@plane_id, @route_id, @start_time, @end_time, @pilot_id, @status)
			COMMIT TRANSACTION T2;
		END