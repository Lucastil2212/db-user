CREATE OR ALTER TRIGGER update_from_location
ON dbo.location INSTEAD OF UPDATE 
AS 
BEGIN

    SET NOCOUNT ON
	INSERT INTO location
	SELECT airport_name,capacity FROM inserted;

	update route
	set start_location_id = (select airport_name from INSERTED)
	where start_location_id in (select airport_name from DELETED)

	update route
	set end_location_id = (select airport_name from INSERTED)
	where end_location_id in (select airport_name from DELETED)


	DELETE FROM location
	WHERE airport_name in (select airport_name from DELETED)
END;

