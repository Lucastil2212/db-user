CREATE OR ALTER PROCEDURE update_status(
  @status AS varchar(10), 
  @newstatus AS varchar(10) = NULL,
  @description AS varchar(50) = NULL)
AS 
	BEGIN 
		update status
		set status = case when @newstatus is null then status else @status END, 
		description = case when @description is null then description else @description END
	  	where @status = status
	END;