CREATE OR ALTER PROCEDURE pilot(
  @pilot_id AS int, 
  @name AS varchar(25) = NULL,
  @salary AS numeric(6,2)  = NULL
)
AS 
	BEGIN 
		update pilot
		set name = case when @name is null then name else @name END,
	    salary = case when @salary is null then salary else @salary END
	    where @pilot_id = pilot_id
	END;