CREATE OR ALTER PROCEDURE update_plane(
  @plane_id AS int, 
  @model AS varchar(10) = NULL,
  @manufacturer AS varchar(20) =NULL,
  @capacity AS int = NULL)
AS 
	BEGIN 
		update plane
		set model = case when @model is null then model else @model END,
	    manufacturer = case when @manufacturer is null then manufacturer else @manufacturer END,
	    capacity = case when @capacity is null then capacity else @capacity END
	    where @plane_id = plane_id
	END;