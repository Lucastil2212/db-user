create procedure use_case_10(
@numBookings int,
@pct int)
as
BEGIN
with pilots_to_be_updated(ID) as 
(select S.pilot_id from schedule as S
 group by S.pilot_id
 having count(*) >= @numBookings
 )

update pilot
set salary = case when (pilot_id in (select ID from pilots_to_be_updated)) then salary * (1 + @pct/100) else salary end
END;