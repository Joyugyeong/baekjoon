-- 코드를 입력하세요
SELECT b.ANIMAL_ID, b.name
from ANIMAL_OUTS b
join ANIMAL_INS a on a.ANIMAL_ID = b.ANIMAL_ID
where a.datetime > b.datetime
order by a.datetime