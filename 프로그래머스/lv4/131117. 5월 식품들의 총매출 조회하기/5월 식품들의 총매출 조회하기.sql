-- 코드를 입력하세요
SELECT a.PRODUCT_ID, a.PRODUCT_NAME, a.price * sum(amount) as TOTAL_SALES
from FOOD_PRODUCT a
join FOOD_ORDER b on a.PRODUCT_ID = b.PRODUCT_ID
where b.PRODUCE_DATE like '2022-05-%'
group by 1
order by 3 desc, 1 asc