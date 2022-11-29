CREATE OR ALTER PROCEDURE update_location(
  @airport_name AS varchar(30),
  @new_airport_name AS varchar(30) =NULL,
  @capacity AS int  = NULL
)
AS 
	BEGIN 
		update location
	    set airport_name = case when @new_airport_name is null then airport_name else @new_airport_name END,
		capacity = case when @capacity is null then capacity else @capacity END
	    where @airport_name = airport_name
	END;