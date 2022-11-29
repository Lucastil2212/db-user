create or alter procedure use_case_8(
@number_unsafe int,
@status varchar(20))
AS
BEGIN
	with total_sum(model) as(
			select model
			from schedule as S,plane as P
			where status = @status and S.plane_id = P.plane_id
			group by P.model
			having count(*) >= @number_unsafe
	) 

	 delete
	 from plane
	 where model in (select model from total_sum)
END;