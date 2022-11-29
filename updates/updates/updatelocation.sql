CREATE OR ALTER PROCEDURE update_location(
  @location_id AS int, 
  @city_name AS varchar(30) = NULL,
  @capacity AS int  = NULL
)
AS 
	BEGIN 
		update location
		set city_name = case when @city_name is null then city_name else @city_name END,
	    capacity = case when @capacity is null then capacity else @capacity END
	    where @location_id = location_id
	END;