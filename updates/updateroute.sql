CREATE OR ALTER PROCEDURE update_route(
  @route_id AS int, 
  @start_location_id AS varchar(30) = NULL,
  @end_location_id AS varchar(30)  = NULL
)
AS 
	BEGIN 
		update route
		set start_location_id = case when @start_location_id is null then start_location_id else @start_location_id END,
	    end_location_id = case when @end_location_id is null then end_location_id else @end_location_id END
	    where @route_id = route_id
	END;