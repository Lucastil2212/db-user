CREATE OR ALTER TRIGGER trigger_from_location
ON dbo.location INSTEAD OF DELETE 
AS 
BEGIN

    SET NOCOUNT ON
    DELETE FROM route WHERE start_location_id IN (SELECT airport_name FROM DELETED) OR
		end_location_id IN (SELECT airport_name FROM DELETED);
    DELETE FROM location WHERE airport_name IN (SELECT airport_name FROM DELETED);
END;

