-- 코드를 입력하세요
SELECT b.ANIMAL_ID, b.NAME
from ANIMAL_OUTS b
left join ANIMAL_INS a on a.ANIMAL_ID = b.ANIMAL_ID
where a.animal_id is null
order by 1