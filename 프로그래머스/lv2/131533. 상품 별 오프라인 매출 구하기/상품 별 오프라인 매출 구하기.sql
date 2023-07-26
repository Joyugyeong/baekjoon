-- 코드를 입력하세요
SELECT a.PRODUCT_CODE, sum(b.SALES_AMOUNT * a.price) as sales
from PRODUCT a
join OFFLINE_SALE b on a.PRODUCT_ID = b.PRODUCT_ID
group by 1
order by 2 desc, 1