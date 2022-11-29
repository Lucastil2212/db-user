--Passenger Permissions
USE FinalProj;
GRANT EXECUTE ON OBJECT::add_passenger
	to generaluser;

GO

USE FinalProj;
GRANT EXECUTE ON OBJECT::add_booking
	to generaluser;

GO

USE FinalProj;
GRANT EXECUTE ON OBJECT:: delete_passenger
	to generaluser;

GO

USE FinalProj;
GRANT EXECUTE ON OBJECT:: delete_booking
	to generaluser;

GO

USE FinalProj;
GRANT EXECUTE ON OBJECT:: delete_booking
	to generaluser;

GO


USE FinalProj;
GRANT EXECUTE ON OBJECT::Use_Case_1_Admin_User
	to generaluser;

GO

USE FinalProj;
GRANT EXECUTE ON OBJECT::use_case_3
	to generaluser;

GO


--Pilot Permissions
USE FinalProj;
GRANT EXECUTE ON OBJECT::add_pilot
	to pilot;

GO


USE FinalProj;
GRANT EXECUTE ON OBJECT::delete_pilot
	to pilot;

GO

grant select on allPilots to pilot;
grant select on schedule to pilot;
grant select on route to pilot;
