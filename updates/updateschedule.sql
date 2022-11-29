CREATE OR ALTER PROCEDURE update_schedule(
  @schedule_id AS int, 
  @plane_id AS int = NULL ,
  @route_id AS int = NULL,
  @start_time AS datetime = NULL,
  @end_time AS datetime = NULL,
  @pilot_id AS int = NULL,
  @status AS varchar(20) = NULL
)
AS 
BEGIN TRAN T1;
	IF @end_time - @start_time <= 0
		BEGIN
		PRINT 'End time cannot be less than or equal to start time';
		ROLLBACK TRAN T1
		END
	ELSE
		BEGIN
		update schedule
		set plane_id = case when @plane_id is null then plane_id else @plane_id END,
	    route_id = case when @route_id is null then route_id else route_id END,
	    start_time = case when @start_time is null then start_time else @start_time END,
		pilot_id = case when @pilot_id is null then pilot_id else @pilot_id END,
	    end_time = case when @end_time is null then end_time else @end_time END,
		status = case when @status is null then status else @status END
	    where @schedule_id = schedule_id
		COMMIT TRAN T1
		END