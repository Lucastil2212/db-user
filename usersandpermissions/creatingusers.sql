BEGIN
	CREATE LOGIN airport_admin
	WITH PASSWORD = 'airport_admin', --db owner
	DEFAULT_DATABASE = FinalProj,
	CHECK_POLICY = ON,
	CHECK_EXPIRATION = OFF ;
	

	create user airport_admin
	from login airport_admin;
	
	CREATE LOGIN generaluser
	WITH PASSWORD = 'generaluser', --public permissions
	DEFAULT_DATABASE = FinalProj,
	CHECK_POLICY = ON,
	CHECK_EXPIRATION = OFF ;


	create user generaluser
	from login generaluser;

	CREATE LOGIN pilot
	WITH PASSWORD = 'pilot', --public permissions
	DEFAULT_DATABASE = FinalProj,
	CHECK_POLICY = ON,
	CHECK_EXPIRATION = OFF ;


	create user pilot
	from login pilot;
END;