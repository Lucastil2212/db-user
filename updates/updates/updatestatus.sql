CREATE OR ALTER PROCEDURE update_status(
  @status AS varchar(10), 
  @new_status AS varchar(10) = NULL,
  @description AS varchar(50) = NULL)
AS 
	BEGIN 
		update status
		set status = case when @new_status is null then status else @new_status END,
		description = case when @description is null then description else @description END
	  	where @status = status
	END;