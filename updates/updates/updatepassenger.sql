CREATE OR ALTER PROCEDURE update_passenger(
  @email AS varchar(25),
  @new_email AS varchar(25) = NULL,
  @name AS varchar(25) = NULL)
AS 
	BEGIN 
		update passenger
		set email = case when @new_email is null then email else @new_email END,
	    name = case when @name is null then name else @name END
	    where @email = email
	END;